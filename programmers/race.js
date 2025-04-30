function solution(players, callings) {
  var answer = [...players];
  for (const calling of callings) {
    const index = answer.findIndex((el) => el === calling);
    const temp = answer[index];
    answer[index] = answer[index - 1];
    answer[index - 1] = temp;
  }
  return answer;
}
