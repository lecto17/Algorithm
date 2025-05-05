function getMinType(char, keymap) {
  const UN_INITIALIZED = 9999;
  let min = UN_INITIALIZED;

  for (let i = 0; i < keymap.length; i++) {
    const index = keymap[i].indexOf(char);
    min = Math.min(index === -1 ? UN_INITIALIZED : index, min);
  }

  return min === UN_INITIALIZED ? -1 : min + 1;
}

function solution(keymap, targets) {
  var answer = [];
  let cnt = 0,
    typedCount = 0;
  for (const target of targets) {
    cnt = 0;
    for (const ch of target.split("")) {
      typedCount = getMinType(ch, keymap);
      if (typedCount === -1) {
        cnt = -1;
        break;
      } else {
        cnt += typedCount;
      }
    }
    answer.push(cnt);
  }

  return answer;
}
