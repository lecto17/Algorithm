예측문제

const solution = (patterns, sources) => {
	const result1 = [];
	const result2 = [];
	const list = patterns.slice();
	const set = new Set(patterns.slice());

	sources.forEach((str) => {
	   if (!list.includes(str)) result1.push(str);
	   if (!set.has(str)) result2.push(str);
	});

	console.log(result1.length === result2.length);
};

solution(['aaa', 'bbb', 'ccc'], ['aaa', 'ddd']);


