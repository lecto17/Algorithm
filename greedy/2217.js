/**
 * 2217 번
 * [ 테스트 케이스 ]
 * TC 1
 * 1
 * 100
 * 
 * TC 2
 
 *
 * [ 풀이 방법 ]
 * 1. 로프를 무거운 순으로 정렬
 * 2. 로프 무게 * 갯수 => 제일 가벼운 로프가 버티면 정답
 */

function solution(numbers) {
  console.log("number: ", numbers, numbers.length);
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
  solution(input);
  process.exit();
});
