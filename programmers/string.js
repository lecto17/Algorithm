function solution(t, p) {
  var answer = 0;
  let len = p.length;

  for (let i = 0; i < t.length; i++) {
    const num = t.slice(i, i + len);

    if (num.length < len) break;
    if (parseInt(num) <= parseInt(p)) answer++;
  }

  return answer;
}
