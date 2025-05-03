function setColor(array, stIdx, count) {
  for (let i = stIdx; i < stIdx + count; i++) {
    array[i] = 0;
  }
}

function solution(n, m, section) {
  const array = Array.from({ length: n }).fill(0);
  let cnt = 0;

  // 초기화
  for (const index of section) {
    array[index - 1] = 1;
  }

  while (array.indexOf(1) !== -1) {
    const index = array.indexOf(1);
    setColor(array, index, m);
    cnt++;
  }

  return cnt;
}
