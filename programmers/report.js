function solution(id_list, report, k) {
  var answer = Array.from({ length: id_list.length }).fill(0);
  const reportMap = {};
  const reportCntMap = Array.from({ length: id_list.length }).fill(0);

  for (const r of report) {
    const [reporter, badUser] = r.split(" ");
    const idxBadUser = id_list.indexOf(badUser);
    const idxReporter = id_list.indexOf(reporter);

    if (!reportMap[idxBadUser]) {
      reportMap[idxBadUser] = [idxReporter];
      reportCntMap[idxBadUser] = 1;
    } else if (!reportMap[idxBadUser].includes(idxReporter)) {
      reportMap[idxBadUser].push(idxReporter);
      reportCntMap[idxBadUser] += 1;
    }
  }

  reportCntMap.forEach((el, idx) => {
    if (el >= k) {
      reportMap[idx].forEach((senderId) => {
        answer[senderId] += 1;
      });
    }
  });

  return answer;
}
