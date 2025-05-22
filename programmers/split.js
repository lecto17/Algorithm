function solution(s) {
  var answer = 0;
  let first = "";
  let firstCount = 0,
    otherCount = 0;

  for (let i = 0; i < s.length; i++) {
    if (!first) first = s[i];
    const ch = s[i];

    if (first === ch) firstCount++;
    else otherCount++;

    if (firstCount === otherCount) {
      answer++;
      firstCount = 0;
      otherCount = 0;
      first = "";
    } else if (i === s.length - 1 && firstCount !== otherCount) {
      answer++;
    }
  }

  return answer;
}
