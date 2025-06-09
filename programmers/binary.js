function solution(s) {
  var answer = [0, 0];
  let len = s.length;
  let str = s;

  while (len > 1) {
    let withoutZero = str.replaceAll("0", "");
    let zeroCount = len - withoutZero.length;

    answer[0] += 1;
    answer[1] += zeroCount;

    str = withoutZero.length.toString(2);
    len = str.length;
  }

  return answer;
}
