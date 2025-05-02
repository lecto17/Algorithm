function solution(wallpaper) {
  var answer = [];
  const array = Array.from(
    { length: wallpaper.length },
    () => new Array(wallpaper[0].length)
  );
  let idx = 0,
    startX = 9999,
    startY = 9999,
    endX = -1,
    endY = -1;

  for (const row of wallpaper) {
    array[idx++] = [...row.split("")];
  }

  for (let i = 0; i < array.length; i++) {
    let firstFileCol = array[i].indexOf("#");
    let lastFileCol = array[i].lastIndexOf("#");
    let lastRow, lastCol;

    if (firstFileCol !== -1) {
      startX = Math.min(startX, i);
      startY = Math.min(startY, firstFileCol);

      endX = Math.max(endX, i);
      endY = Math.max(endY, lastFileCol);
    }
  }

  answer.push(startX, startY, endX + 1, endY + 1);

  return answer;
}
