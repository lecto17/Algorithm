function pick(board, array, dx, dy, candidates) {
  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board[0].length; j++) {
      let block = array[i][j];
      if (block === "-") continue;

      for (let k = 0; k < dx.length; k++) {
        const newX = i + dx[k];
        const newY = j + dy[k];

        if (
          0 <= newX &&
          newX < array.length &&
          0 <= newY &&
          newY < array[0].length
        ) {
          if (block !== array[newX][newY]) break;
        } else break;

        if (k === dx.length - 1) candidates.push([i, j]);
      }
    }
  }
}

function remove(array, dx, dy, candidates) {
  for (const cnd of candidates) {
    const [x, y] = cnd;
    array[x][y] = "-";

    for (let k = 0; k < dx.length; k++) {
      const newX = x + dx[k];
      const newY = y + dy[k];

      array[newX][newY] = "-";
    }
  }

  candidates.length = 0;
}

function order(array) {
  let str = "",
    arr = [];
  for (let i = 0; i < array[0].length; i++) {
    for (let j = 0; j < array.length; j++) {
      str += array[j][i];
    }
    arr.push(
      str.split("").sort((a, b) => {
        if (a === "-" && b !== "-") return -1;
        if (a !== "-" && b === "-") return 1;
        return 0;
      })
    );
    str = "";
  }

  for (let i = 0; i < array[0].length; i++) {
    for (let j = 0; j < array.length; j++) {
      array[j][i] = arr[i][j];
    }
  }
}

function solution(m, n, board) {
  var answer = 0;
  const array = Array.from({ length: m }, () => new Array(n));
  const dx = [0, 1, 1];
  const dy = [1, 1, 0];
  const candidates = [];

  for (let i = 0; i < board.length; i++) {
    array[i] = [...board[i]];
  }

  pick(board, array, dx, dy, candidates);
  while (candidates.length) {
    remove(array, dx, dy, candidates);
    order(array);
    pick(board, array, dx, dy, candidates);
  }

  array.forEach((row) =>
    row.forEach((el) => {
      if (el === "-") answer++;
    })
  );
  return answer;
}
