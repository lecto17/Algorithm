function solution(name, yearning, photo) {
  var answer = [];
  let yearningPerPerson = {};

  for (let i = 0; i < name.length; i++) {
    const nm = name[i];
    yearningPerPerson[nm] = yearning[i];
  }

  for (const p of photo) {
    let score = 0;
    for (const nm of p) {
      score += yearningPerPerson[nm] || 0;
    }
    answer.push(score);
    score = 0;
  }

  return answer;
}
