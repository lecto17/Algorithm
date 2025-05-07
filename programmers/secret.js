function solution(s, skip, index) {
  var answer = "";
  const chars = "abcdefghijklmnopqrstuvwxyz";
  const array = chars.split("");
  let cnt = 0;

  for (const ch of s) {
    let idx = array.indexOf(ch);
    let string = "";

    while (cnt !== index) {
      if (idx + 1 > 25) {
        idx = 0;
      } else {
        idx++;
      }

      const temp = skip.indexOf(array[idx]);

      if (temp === -1) {
        cnt++;
      }
    }

    cnt = 0;
    answer += array[idx];
  }

  return answer;
}
