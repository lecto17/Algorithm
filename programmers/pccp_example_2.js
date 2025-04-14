function binarySearchAndSort(originArr) {
  const number = originArr[0];
  const arr = originArr.slice(2);
  let start = 0,
    end = arr.length;
  let mid = parseInt((start + end) / 2);

  while (mid <= end && start <= end) {
    if (number < arr[mid]) {
      end = mid - 1;
      mid = parseInt((start + end) / 2);
    } else {
      start = mid + 1;
      mid = parseInt((start + end) / 2);
    }
  }
  arr.splice(mid, 0, ...[number, number]);
  return arr;
}

function solution(ability, number) {
  let sum = 0;

  ability.sort((a, b) => a - b);

  for (let i = 0; i < number; i++) {
    sum = ability[0] + ability[1];
    ability[0] = sum;
    ability[1] = sum;
    ability = binarySearchAndSort(ability);
  }

  return ability.reduce((acc, cur) => (acc += cur), 0);
}
