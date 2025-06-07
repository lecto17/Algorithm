function solution(s) {
  var answer = true;
  let arr = [],
    temp = -1;

  for (const _s of s.split("")) {
    if (_s === "(") arr.push("(");
    else temp = arr.pop();

    if (!temp) {
      answer = false;
      return answer;
    }
  }

  return arr.length ? false : true;
}
