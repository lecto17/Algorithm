// TC
/**
 * TC 1
 * 4
 * 1 2
 * 2 3
 * 3 5
 * 3 6
 *
 * => 3
 *
 *
 * TC 2
 * 4
 * 1 2
 * 3 5
 * 2 3
 * 3 6
 *
 * => 3
 *
 *
 * TC 3
 * 4
 * 1 1
 * 2 2
 * 4 4
 * 3 3
 *
 * => 4
 *
 *
 * TC 4
 * 4
 * 1 2
 * 2 3
 * 3 4
 * 4 5
 *
 * => 4
 *
 *
 * TC 5
 * 4
 * 0 1
 * 0 2
 * 1 4
 * 4 5
 *
 * => 3
 */

let schedules = [];

function solution(numbers) {
  let biggest = 0;

  for (let i = 0; i < numbers.length; i++) {
    getValidTime(numbers[i]);

    if (biggest <= schedules.length) {
      biggest = schedules.length;
    }
  }
  console.log(biggest);
}

function getValidTime([startTime, endTime]) {
  if (startTime === endTime) {
    schedules.push([startTime, endTime]);
    return;
  }

  for (let i = 0; i < schedules.length; i++) {
    const [start, end] = schedules[i];

    console.log(
      start,
      end,
      startTime,
      endTime,
      endTime > start && endTime <= end,
      startTime >= start && startTime < end
    );

    if (
      (endTime > start && endTime <= end) ||
      (startTime >= start && startTime < end)
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
    input.map((el) => el.split(" ").map((el) => parseInt(el)))
    // .sort((a, b) => {
    //   const duration = a[1] - a[0] - (b[1] - b[0]);
    //   if (duration == 0) {
    //     return a[0] - b[0];
    //   }
    //   return duration;
    // })
  );
  process.exit();
});
