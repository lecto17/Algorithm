function solution(n, list1, list2) {
  let biggest = 0;
  let sum = 0,
    idx = -1;
  list1.sort((a, b) => a - b);

  for (const el of list1) {
    for (let idxOfL2 = 0; idxOfL2 < list2.length; idxOfL2++) {
      if (biggest <= list2[idxOfL2]) {
        biggest = list2[idxOfL2];
        idx = idxOfL2;
      }

      if (idxOfL2 === list2.length - 1) {
        sum += el * list2[idx];
        list2.splice(idx, 1);
      }
    }
    biggest = 0;
  }

  console.log(sum);
  return sum;
}

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  //여러줄 입력
  input.push(line);
}).on("close", function () {
  let n = parseInt(input[0]);
  //띄어쓰기 기준으로 배열에 넣기
  let aList = input[1].split(" ").map((el) => parseInt(el));
  let bList = input[2].split(" ").map((el) => parseInt(el));
  solution(n, aList, bList);
  process.exit();
});
