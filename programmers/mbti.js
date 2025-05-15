function setScore(map, first, second, score) {
  let _score = 0,
    key = first;

  if (score < 4) {
    if (score === 1) {
      key = first;
      _score = 3;
    } else if (score === 2) {
      key = first;
      _score = 2;
    } else {
      key = first;
      _score = 1;
    }
  } else if (score > 4) {
    if (score === 5) {
      key = second;
      _score = 1;
    } else if (score === 6) {
      key = second;
      _score = 2;
    } else {
      key = second;
      _score = 3;
    }
  }

  map.set(key, (map.get(key) || 0) + _score);
}

function solution(survey, choices) {
  var answer = "";
  const mbtiIndexes = ["RT", "CF", "JM", "AN"];
  const scoreMap = new Map();
  let idx = 0;

  for (const s of survey) {
    const [first, second] = s.split("");
    setScore(scoreMap, first, second, choices[idx++]);
  }

  for (const index of mbtiIndexes) {
    const [first, second] = index.split("");
    const _fValue = scoreMap.get(first) || 0;
    const _sValue = scoreMap.get(second) || 0;

    if (_fValue > _sValue) answer += first;
    else if (_fValue < _sValue) answer += second;
    else answer += [first, second].sort()[0];
  }

  return answer;
}
