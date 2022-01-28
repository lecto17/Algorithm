	
function getPermutations(arr, selectNumber) {
  const results = [];
  if (selectNumber === 1) return arr.map((v) => [v]);
  else {
    arr.forEach((fixed, index, origin) => {
      const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
      const permutations = getPermutations(rest, selectNumber - 1);
      const attached = permutations.map((permutation) => [
        fixed,
        ...permutation,
      ]);
      results.push(...attached);
    });
  }
  return results;
}

function isPrime(num) {
  for (let i = 2; num > i; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return num > 1;
}
function solution(numbers) {
  let answer = 0;
  const candiArr = [];
  const splitArr = numbers.split("");
  for (let i = 1; i < numbers.length + 1; i++) {
    candiArr.push(
      ...getPermutations(splitArr, i).map((v) => Number(v.join("")))
    );
  }
  const candiSet = new Set(candiArr);
  candiSet.forEach(function (v) {
    if (isPrime(v)) answer++;
  });
  return answer;
}
