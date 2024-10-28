function solution(input) {
  input.forEach((line, idx) => {
    const input = line.split(" ").map((el) => Number(el));
    const [availableDays, totalDays, vacationDays] = input;

    if (!totalDays && !availableDays && !vacationDays) return;

    const count = Math.floor(vacationDays / totalDays);
    const remaining =
      vacationDays % totalDays > availableDays
        ? availableDays
        : vacationDays % totalDays;

    console.log(`Case ${idx + 1}: ${count * availableDays + remaining}`);
    // console.log(`Case ${idx + 1}: `, count * availableDays + remaining);
  });
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
  solution(input);
  // input.forEach((line, idx) => {
  //   solution(line, idx);
  // });
});
