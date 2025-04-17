// BFS로 변경해서 풀 것
// DFS로 풀면 시간초과 발생
function solution(n, m, hole) {
  var answer = 0,
    routes = [];
  const map = Array.from(Array(n), () => new Array(m).fill(0));
  const dx = [0, 1, 2, 0];
  const dy = [1, 0, 0, 2];
  let min = Number.MAX_SAFE_INTEGER,
    used = false;
  const usedPos = [];

  for (const [x, y] of hole) {
    map[x - 1][y - 1] = 1;
  }

  map[0][0] = 1;
  function DFS(xPos, yPos) {
    if (xPos === n - 1 && yPos === m - 1) {
      min = Math.min(min, answer);
      return;
    } else {
      for (let i = 0; i < 4; i++) {
        let x = xPos + dx[i],
          y = yPos + dy[i];
        if ((i === 2 || i === 3) && used) {
          continue;
        }
        if ((i === 2 || i === 3) && !used) {
          used = !used;
          usedPos.push([x, y]);
        }

        if (0 <= x && x < n && 0 <= y && y < m && map[x][y] === 0) {
          map[x][y] = 1;
          answer++;
          routes.push([x, y]);
          DFS(x, y);
          map[x][y] = 0;
          answer--;
          routes.pop();
        } else if (
          usedPos.length &&
          used &&
          usedPos[0][0] === x &&
          usedPos[0][1] === y
        ) {
          used = false;
          usedPos.pop();
        }
      }
    }
  }

  DFS(0, 0);

  return min === Number.MAX_SAFE_INTEGER ? -1 : min;
}
