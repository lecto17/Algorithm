// 문제를 정확하게 읽고 이해하기.
function solution(menu, order, k) {
  var answer = [];
  let time = 0,
    totalTime = 0,
    orderReadyAt = [],
    max = -1,
    loopCnt = order.length,
    idx;

  for (let i = 0; i < order.length; i++) {
    totalTime += menu[order[i]];
  }

  for (let sec = 0; sec < totalTime; sec++) {
    if (orderReadyAt?.[0] === 0) {
      answer.shift();
      orderReadyAt.shift();
    }

    if (sec % k === 0 && loopCnt > 0) {
      answer.push("person-" + sec);
      max = Math.max(max, answer.length);
      idx = order.length - loopCnt;
      orderReadyAt.push(menu[order[idx]]);
      loopCnt--;
    }

    if (orderReadyAt.length) {
      orderReadyAt[0] = orderReadyAt[0] - 1;
    }
  }

  return max;
}
