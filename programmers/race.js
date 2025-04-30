function solution(players, callings) {
  const answer = [...players];
  const rankMap = new Map();
  let index;

  players.forEach((el, idx) => rankMap.set(el, idx));

  for (const calling of callings) {
    index = rankMap.get(calling);

    answer[index] = answer[index - 1];
    answer[index - 1] = calling;

    rankMap.set(calling, index - 1);
    rankMap.set(answer[index], index);
  }
  return answer;
}
