// 문제 이해 제대로 하기
function solution(A, B) {
  let cnt = A.length;

  const _sortedA = A.sort((a, b) => a - b);
  const _sortedB = B.sort((a, b) => b - a);

  return A.reduce((acc, cur, i) => acc + cur * B[i], 0);
}
