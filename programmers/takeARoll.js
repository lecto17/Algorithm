function solution(park, routes) {
  const array = Array.from(
    { length: park.length },
    () => new Array(park[0].length)
  );
  const dx = [0, 1, 0, -1],
    dy = [1, 0, -1, 0];
  let idx = 0,
    sRow = 0,
    sCol = 0;

  for (let i = 0; i < park.length; i++) {
    if (park[i].includes("S")) {
      sRow = i;
      sCol = park[i].indexOf("S");
      break;
    }
  }

  function isBlocked(direction, position) {
    let newX = sRow,
      newY = sCol;
    let sign = 1,
      someThingBlocked = false;
    if (direction === "N" || direction === "W") {
      sign = -1;
    }

    for (let i = 0; i < position; i++) {
      if (direction === "E" || direction === "W") newY += sign * 1;
      else if (direction === "N" || direction === "S") newX += sign * 1;

      if (array[newX][newY] === "X") {
        someThingBlocked = true;
        break;
      }
    }

    return someThingBlocked;
  }

  for (const row of park) {
    array[idx++] = [...row];
  }

  for (const route of routes) {
    let newR, newC;
    const [direction, pos] = route.split(" ");
    const position = parseInt(pos);

    switch (direction) {
      case "N":
        newR = sRow - position;
        newC = sCol;
        break;
      case "E":
        newR = sRow;
        newC = sCol + position;
        break;
      case "S":
        newR = sRow + position;
        newC = sCol;
        break;
      case "W":
        newR = sRow;
        newC = sCol - position;
        break;
    }

    if (newC < 0 || newC >= park[0].length || newR < 0 || newR >= park.length) {
      continue;
    }

    if (isBlocked(direction, position)) continue;

    (sRow = newR), (sCol = newC);
  }

  return [sRow, sCol];
}
