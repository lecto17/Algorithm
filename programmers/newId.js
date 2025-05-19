function solution(new_id) {
  let answer = new_id.toLowerCase();
  answer = answer.replace(/[^a-z0-9-._]/g, "");

  if (answer.startsWith(".") || answer.endsWith(".")) {
    while (answer.startsWith(".") || answer.endsWith(".")) {
      if (answer.startsWith(".")) {
        answer = answer.slice(1);
      }
      if (answer.endsWith(".")) {
        answer = answer.slice(0, answer.length - 1);
      }
    }
  }

  let index = answer.indexOf(".");

  while (index !== -1) {
    while (answer[index + 1] === ".") {
      answer = answer.slice(0, index + 1) + answer.slice(index + 2);
    }

    const some = [];
    answer.split("").forEach((el, idx) => {
      if (el === "." && answer?.[idx + 1] === ".") {
        index = idx;
        some.push(idx);
      }
    });

    if (some.length) index = some[0];
    else index = -1;
  }

  if (!answer) {
    answer = "a";
  }

  if (answer.length > 15) {
    answer = answer.slice(0, 15);
    if (answer.endsWith(".")) {
      answer = answer.slice(0, answer.length - 1);
    }
  } else if (0 < answer.length && answer.length <= 2) {
    const char = answer[answer.length - 1];
    answer = answer.padEnd(3, char);
  }

  return answer;
}
