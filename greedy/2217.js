/**
 * 2217 번
 * [ 테스트 케이스 ]
 * TC 1 
 * 1
 * 100
 * => 100
 * 
 * TC 2
 * 2
 * 10
 * 100
 * => 100
 * 
 * TC 3
 * 4
 * 10
 * 20
 * 30
 * 100
 * => 100
 * 
 * TC 4
 * 4
 * 10
 * 20
 * 90
 * 100
 * => 180
 * 
 * TC 5
 * 4
 * 10
 * 20
 * 30
 * 40
 * => 60
 
 *
 * [ 풀이 방법 ]
 * 1. 로프를 무거운 순으로 정렬
 * 2. 로프 무게 * 갯수 => 제일 가벼운 로프가 버티면 정답
 * 
 * 엣지 케이스를 생각하지 못하고 풂..
 * 로프를 사용하지 않을 수도 있다는 것 고려해서 다시 풀기.
 * 
 * 1. 로프를 무거운 순으로 정렬
 * 2. 무거운 루프 1개씩 추가하며 추가된 갯수에 로프들이 버틸 수 있는 후보 중 가장 큰 것이 정답
 */

function solution(numbers) {
  const array = [];
  let biggest = 0;
  let accumulator = 0;

  numbers.sort((a, b) => b - a);

  for (let i = 0; i < numbers.length; i++) {
    accumulator = numbers[i];

    if (biggest < parseInt(accumulator * (i + 1))) {
      biggest = parseInt(accumulator * (i + 1));
    }
  }
  console.log(biggest);
  // const countOfLoopes = numbers.length;
  // let heaviest = 0,
  //   mininumWeight = countOfLoopes * numbers[0];

  // numbers.sort((a, b) => b - a);

  // for (let i = countOfLoopes - 1; i >= 0; i--) {
  //   heaviest = numbers[i] * countOfLoopes;
  //   if (heaviest <= mininumWeight) {
  //     console.log(mininumWeight);
  //     return;
  //   }
  // }
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
  input.shift();
  solution(input.map((el) => parseInt(el)));
  process.exit();
});
