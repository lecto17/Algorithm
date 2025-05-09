function processDate(date) {
  return date.toString().padStart(2, "0");
}

// 이런 로직 없이 1일 단위로 변환해서 풀면 간단하게 풀 수 있음.
function getDate(date, month) {
  let _addYear = parseInt(month / 12);
  let _residue = month - _addYear * 12;
  _addYear += _residue + date[1] > 12 ? 1 : 0;
  let _addMonth =
    (_residue + date[1] > 12 ? _residue + date[1] - 12 : _residue + date[1]) +
    (date[2] === 1 ? -1 : 0);

  const _year = date[0] + _addYear;
  const _month = _addMonth;
  const _day = date[2] === 1 ? 28 : date[2] - 1;

  return processDate(_year) + processDate(_month) + processDate(_day);
}

function solution(today, terms, privacies) {
  var answer = [];
  const _terms = terms.map((term) => term.split(" "));
  const _today = today
    .split(".")
    .map((el) => processDate(el))
    .join("");
  const map = new Map(_terms.map((term) => [term[0], parseInt(term[1])]));

  for (let i = 0; i < privacies.length; i++) {
    const [date, type] = privacies[i].split(" ").map((el, idx) => {
      if (idx === 0) {
        return el.split(".").map((el) => parseInt(el));
      }
      return el;
    });

    const _date = getDate(date, map.get(type));
    if (_today > _date) answer.push(i + 1);
  }

  return answer;
}
