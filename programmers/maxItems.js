function solution(friends, gifts) {
  let array = Array.from({ length: friends.length }, () =>
    new Array(friends.length).fill(0)
  );
  let map = new Map(),
    idx = 0;
  const giftIndex = [];
  const willReceive = [];

  for (const friend of friends) {
    map.set(friend, idx);
    idx++;
  }

  for (const gift of gifts) {
    const [from, to] = gift.split(" ");
    const fromIndex = map.get(from),
      toIndex = map.get(to);
    array[fromIndex][toIndex] += 1;
  }

  for (let i = 0; i < friends.length; i++) {
    let cnt = array[i].reduce((acc, cur) => (acc += cur), 0);
    for (let j = 0; j < friends.length; j++) {
      cnt -= array[j][i];
    }
    giftIndex.push(cnt);
  }

  for (let i = 0; i < friends.length; i++) {
    let cnt = 0;
    for (let j = 0; j < friends.length; j++) {
      if (i === j) continue;
      if (array[i][j] > array[j][i]) {
        cnt++;
      } else if (array[i][j] == array[j][i] && giftIndex[i] > giftIndex[j]) {
        cnt++;
      }
    }
    willReceive.push(cnt);
  }
  return Math.max(...willReceive);
}
