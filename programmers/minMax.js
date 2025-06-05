function solution(s) {
  let small = Number.MAX_SAFE_INTEGER;
  let big = Number.MIN_SAFE_INTEGER;

  for (const n of s.split(" ")) {
    let num = parseInt(n);

    if (num > big) big = num;
    if (num < small) small = num;
  }

  return `${small} ${big}`;
}
