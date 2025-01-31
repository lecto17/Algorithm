function solution(input) {
  const [endX, endY] = input
    .shift()
    .split(" ")
    .map((el) => parseInt(el));

  const miro = Array.from(Array(endX + 1), () => new Array(endY + 1).fill(0));

  input.forEach((el, idx) => {
    miro[idx + 1] = [0, ...el.split("").map((el) => parseInt(el))];
  });

  let queue = [[1, 1, 1]];
  let dx = [-1, 0, 1, 0];
  let dy = [0, 1, 0, -1];
  let candidates = [];

  miro[1][1] = 0;

  function move(L, x, y) {
    if (x === endX && y === endY) {
      candidates.push(L);
      return;
    } else {
      for (let i = 0; i < 4; i++) {
        let xPos = x + dx[i];
        let yPos = y + dy[i];

        if (
          xPos >= 1 &&
          xPos <= endX &&
          yPos >= 1 &&
          yPos <= endY &&
          miro[xPos][yPos] === 1
        ) {
          queue.push([xPos, yPos, L + 1]);
          miro[xPos][yPos] = 0;
        }
      }
    }
  }

  while (queue.length) {
    const temp = [...queue];
    queue = [];

    temp.forEach((el) => {
      const [x, y, L] = el;
      move(L, x, y);
    });
  }
  console.log(Math.min(candidates));
  return Math.min(candidates);
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
  return solution(input);
});

// function solution(input) {
//   const [endX, endY] = input
//     .shift()
//     .split(" ")
//     .map((el) => parseInt(el));

//   const miro = Array.from(Array(endX + 1), () => new Array(endY + 1).fill(0));

//   input.forEach((el, idx) => {
//     miro[idx + 1] = [0, ...el.split("").map((el) => parseInt(el))];
//   });

//   let queue = [[1, 1, 1]];
//   let dx = [-1, 0, 1, 0];
//   let dy = [0, 1, 0, -1];
//   let LV = 1;
//   let candidates = [];

//   miro[1][1] = 0;

//   function DFS(L, x, y) {
//     if (x === endX && y === endY) {
//       console.log(`L: ${L} IS PUSHED BY `, x, y);

//       candidates.push(L);
//       return;
//     } else {
//       for (let i = 0; i < 4; i++) {
//         let xPos = x + dx[i];
//         let yPos = y + dy[i];

//         console.log("x, y: ", xPos, yPos, miro?.[xPos]?.[yPos]);
//         if (
//           xPos >= 1 &&
//           xPos <= endX &&
//           yPos >= 1 &&
//           yPos <= endY &&
//           miro[xPos][yPos] === 1
//         ) {
//           console.log("pushed: ", xPos, yPos, L + 1);
//           queue.push([xPos, yPos, L + 1]);
//           miro[xPos][yPos] = 0;
//           // DFS(L + 1, xPos, yPos);
//           // miro[xPos][yPos] = 1;
//           // DFS(L, xPos, yPos);
//         }
//       }
//     }
//   }

//   while (queue.length) {
//     const temp = [...queue];
//     queue = [];

//     temp.forEach((el) => {
//       const [x, y, L] = el;
//       console.log("LLLLOOOOGGG: ", x, y, L);

//       DFS(L, x, y);
//     });
//   }

//   console.log("dd: ", candidates);
// }

// const readline = require("readline");
// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// let input = [];
// rl.on("line", function (line) {
//   //여러줄 입력
//   input.push(line);
// }).on("close", function () {
//   return solution(input);
// });
