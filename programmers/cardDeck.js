function solution(cards1, cards2, goal) {
  var answer = "Yes";

  for (const char of goal) {
    const first = cards1?.[0] || "";
    const second = cards2?.[0] || "";

    if (first === char) {
      cards1.shift();
      continue;
    } else if (second === char) {
      cards2.shift();
      continue;
    } else {
      answer = "No";
      break;
    }
  }

  return answer;
}
