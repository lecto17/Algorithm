function solution(X, Y) {
  var answer = [];
  const firstMap = new Map();
  const secondMap = new Map();

  for (const x of X.split("")) {
    if (firstMap.has(x)) {
      firstMap.set(x, firstMap.get(x) + 1);
    } else firstMap.set(x, 1);
  }

  for (const y of Y.split("")) {
    if (secondMap.has(y)) {
      secondMap.set(y, secondMap.get(y) + 1);
    } else secondMap.set(y, 1);
  }

  let biggestMap = firstMap.size > secondMap.size ? firstMap : secondMap;
  let smallestMap = firstMap.size > secondMap.size ? secondMap : firstMap;

  for (const [key, value] of biggestMap) {
    if (smallestMap.has(key)) {
      let _min = Math.min(value, smallestMap.get(key));

      for (let i = 0; i < _min; i++) {
        answer.push(key);
      }
    }
  }

  answer.sort((a, b) => b - a);

  if (answer.length && answer.every((el) => el === "0")) {
    answer = ["0"];
  }

  return answer.length ? answer.join("") : "-1";
}
