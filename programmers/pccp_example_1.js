function solution(command) {
  let curIndex = 0; // +y(0), +x(1), -y(2), -x(3)
  let curPosition = [0, 0];

  for (com of command.split("")) {
    switch (com) {
      case "L":
        curIndex = curIndex - 1 < 0 ? 3 : curIndex - 1;
        break;
      case "R":
        curIndex = curIndex + 1 > 3 ? 0 : curIndex + 1;
        break;
      case "G":
        if (curIndex === 0) {
          curPosition = [curPosition[0], curPosition[1] + 1];
        } else if (curIndex === 1) {
          curPosition = [curPosition[0] + 1, curPosition[1]];
        } else if (curIndex === 2) {
          curPosition = [curPosition[0], curPosition[1] - 1];
        } else {
          curPosition = [curPosition[0] - 1, curPosition[1]];
        }
        break;
      case "B":
        if (curIndex === 0) {
          curPosition = [curPosition[0], curPosition[1] - 1];
        } else if (curIndex === 1) {
          curPosition = [curPosition[0] - 1, curPosition[1]];
        } else if (curIndex === 2) {
          curPosition = [curPosition[0], curPosition[1] + 1];
        } else {
          curPosition = [curPosition[0] + 1, curPosition[1]];
        }
        break;
    }
  }
  return curPosition;
}
