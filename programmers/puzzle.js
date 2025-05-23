function solution(diffs, times, limit) {
  let total = 0,
    level = 1,
    lt = 1,
    rt = diffs.reduce((a, b) => Math.max(a, b), -Infinity);
  const candidates = [];

  while (lt <= rt && rt >= 1) {
    total = 0;
    level = parseInt((lt + rt) / 2);

    for (let i = 0; i < diffs.length; i++) {
      const diff = diffs[i];
      const time = times[i];

      if (diff <= level) {
        total += time;
      } else {
        let _time = 0,
          idx = i - 1 < 0 ? 0 : i - 1;
        for (let j = idx; j <= i; j++) {
          _time += times[j];
        }
        total += _time * (diff - level) + time;
      }

      if (total > limit) {
        lt = parseInt((lt + rt) / 2) + 1;
        break;
      } else if (total <= limit && i === diffs.length - 1) {
        candidates.push(level);
        rt = parseInt((lt + rt) / 2) - 1;
      }
    }
  }

  return Math.min(...candidates);
}
