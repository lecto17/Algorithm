function solution(n, w, num) {
  var answer = 0;
  const array = Array.from({ length: w }, () => new Array());
  let reverse = false,
    loopCount = 1,
    index = -1;

  for (let i = 1; i <= n; i++) {
    if (i > w * loopCount) {
      loopCount++;
      reverse = !reverse;
    }

    if (!reverse) {
      if (i === num) index = (i - 1) % w;
      array[(i - 1) % w].push(i);
    } else {
      let addOne = i % w !== 0 ? 1 : 0;
      let idx = (parseInt(i / w) + addOne) * w - i;

      array[idx].push(i);
      if (i === num) index = idx;
    }
  }

  while (array[index].length) {
    answer++;
    const popNumber = array[index].pop();
    if (popNumber === num) break;
  }

  return answer;
}
