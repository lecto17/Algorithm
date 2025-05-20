function solution(ingredient) {
  var answer = 0,
    endFlag = false;
  let needStuff = 1,
    needLastBun = false;

  while (true) {
    for (let i = 0; i < ingredient.length; i++) {
      const stuff = ingredient[i];

      if (stuff === needStuff && !needLastBun) {
        needStuff += 1;
      } else if (stuff === 1 && !needLastBun) {
        needStuff = 2;
      } else if (stuff !== needStuff) {
        needStuff = 1;
        needLastBun = false;
      } // 햄버거 못만듬 초기화.

      // 햄버거 마지막 번
      if (needStuff === 4) {
        needStuff = 1;
        needLastBun = true;
      } else if (stuff === 1 && needStuff === 1 && needLastBun) {
        // 햄버거 다 만듬 초기화
        ingredient.splice(i - 3, 4);
        answer++;
        needLastBun = false;
        break;
      }

      if (i === ingredient.length - 1) endFlag = true;
    }

    if (endFlag || !ingredient.length) break;
  }

  return answer;
}
