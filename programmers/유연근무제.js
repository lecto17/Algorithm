function getTotalMinutes(time) {
  const timeString = time.toString();
  let len = timeString.length;
  return (
    parseInt(timeString.slice(len - 2)) +
    parseInt(timeString.slice(0, len - 2)) * 60
  );
}

function solution(schedules, timelogs, startday) {
  var answer = 0;
  const DAYS_OF_WEEK = 7,
    HOUR = 60;

  for (let i = 0; i < timelogs.length; i++) {
    for (let j = 0; j < timelogs[i].length; j++) {
      const time = timelogs[i][j];
      const today = (j + startday) % DAYS_OF_WEEK;
      const isWorkingDay = today > 5 || today === 0 ? false : true;

      if (isWorkingDay) {
        if (time - schedules[i] > 10) {
          const minutesOfTime = getTotalMinutes(time);
          const minutesOfSchedule = getTotalMinutes(schedules[i]);

          if (minutesOfTime - minutesOfSchedule > 10) break;
        }
      }
      if (j === timelogs[i].length - 1) answer++;
    }
  }

  return answer;
}
