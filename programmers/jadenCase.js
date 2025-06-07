function solution(s) {
  let answer = [];
  let temp = "";

  for (const _splited of s.split(" ")) {
    if (isNaN(_splited[0])) {
      temp =
        (_splited[0]?.toUpperCase() || "") +
        (_splited.slice(1)?.toLowerCase() || "");
    } else {
      temp = _splited[0] + _splited.slice(1)?.toLowerCase();
    }
    answer.push(temp);
  }

  return answer.join(" ");
}
