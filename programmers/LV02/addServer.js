function solution(players, m, k) {
  var answer = 0;
  let servers = []; // { createdAt: createdHour, count: count of created servers }
  let activeServersCount = 0,
    activeUsers = 0,
    applicableCount = 0;

  for (let i = 0; i < players.length; i++) {
    if (servers.length && servers[0].createdAt + k <= i) {
      activeServersCount -= servers[0].count;
      servers.shift();
    }

    activeUsers = players[i];
    applicableCount = activeServersCount * m;

    const needsAddServer = activeUsers - applicableCount > 0;

    if (activeUsers && needsAddServer) {
      const residueUsers = activeUsers - applicableCount;
      const count = Math.floor(residueUsers / m);
      activeServersCount += count;
      answer += count;
      servers.push({
        createdAt: i,
        count: count,
      });
      // console.log("createdAt: ", i, 'count: ', count, ", answer: ", answer);
    }
  }

  return answer;
}
