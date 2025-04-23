function changeToSeconds(timeString) {
  const time = timeString.replace(":", "");
  return parseInt(time.slice(0, 2)) * 60 + parseInt(time.slice(2));
}

function changeToTime(seconds) {
  const minute = parseInt(seconds / 60)
    .toString()
    .padStart(2, "0");
  const sec = (seconds % 60).toString().padStart(2, "0");
  return minute + ":" + sec;
}

function isOnOpening(op_st, op_end, cur) {
  if (op_st <= cur && cur <= op_end) {
    return op_end;
  }
  return cur;
}

function solution(video_len, pos, op_start, op_end, commands) {
  let posToSeconds = changeToSeconds(pos),
    changed_op_st = changeToSeconds(op_start),
    changed_op_end = changeToSeconds(op_end),
    changed_video_len = changeToSeconds(video_len);

  posToSeconds = isOnOpening(changed_op_st, changed_op_end, posToSeconds);

  for (const command of commands) {
    command === "next" ? (posToSeconds += 10) : (posToSeconds -= 10);

    if (posToSeconds < 0) posToSeconds = 0;
    if (posToSeconds > changed_video_len) posToSeconds = changed_video_len;

    posToSeconds = isOnOpening(changed_op_st, changed_op_end, posToSeconds);
  }

  return changeToTime(posToSeconds);
}
