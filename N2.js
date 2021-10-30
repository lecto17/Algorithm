// Run by Node.js

const readline = require("readline");
const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

let input= [];
let loop, N, M;
let arr;
let answer = '';

rl.on("line", function(line) {
	input.push(line.split(' ').map(el =>parseInt(el)));
})


function check(n, m ,arr) {
	let temp=[-1];
	for (let i=0; i<n; i++) {
		for (let j=0; j<=temp.length; j++) {
			if (temp[j] !== arr[i]){
				temp.push(arr[i]);
				if (temp[0] === -1) temp.shift();
				break;
			}
			
			if (temp.length === m)
				return i;
		}
	}
}

rl.on("close", function() {
	loop = input[0][0];
	for (let i=0; i < loop; i++) {
		N = input[2*i + 1][0];
		M = input[2*i + 1][1];
		answer += check(N, M, input[2*(i+1)]) +"\n";
	}
	
})

console.log("answer: ", answer)