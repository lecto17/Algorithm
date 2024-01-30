let schedules = [];

function solution(numbers) {
  let biggest = 0;

  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      getValidTime(numbers[j]);
    }

    if (biggest < schedules.length) biggest = schedules.length;

    numbers.shift();
    schedules = [];
  }

  console.log(biggest);
}

function getValidTime([startTime, endTime]) {
  for (let i = 0; i < schedules.length; i++) {
    const [start, end] = schedules[i];
    if (
      (startTime >= start && startTime <= end) ||
      (endTime >= start && endTime <= end)
    ) {
      return;
    }
  }
  schedules.push([startTime, endTime]);
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
  solution(
    input
      .map((el) => el.split(" ").map((el) => parseInt(el)))
      .sort((a, b) => a[1] - a[0] - (b[1] - b[0]))
  );
  process.exit();
});
