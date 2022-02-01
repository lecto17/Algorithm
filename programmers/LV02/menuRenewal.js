
function solution(orders, course) {
    let answer = [];
    let prev_elements = [];

    function combination(elements, k, results) {
        if (prev_elements.length === k) {
            let str_tmp = prev_elements.slice().sort().join('');
            results[str_tmp] = results[str_tmp] === undefined ? 1 : results[str_tmp] + 1;
		    return ;
	    }

        for (let i = 0; i < elements.length; i++) {
            let next_elements = elements.slice(i + 1, elements.length);
            prev_elements.push(elements[i]);
            combination(next_elements, k, results);
            prev_elements.pop();
        }
    }

    let arr = [];
    orders.map(order => {
        arr.push(order.split(''));
    })

    let results = [];

    for (let i in course) {
        results.push({});
        for (let j in arr) {
            combination(arr[j], course[i], results[i]);
        }
    }

    results.map(result => {
        let max = 1;
        for (let i in result) {
            if (max < result[i]) {
                max = result[i];
            }
        }

        for (let j in result) {
            if ((result[j] === max) && max > 1) {
                answer.push(j);
            }
        }
    })

    return answer.sort();
}
