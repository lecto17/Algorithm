var lines = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

 
var n = parseInt(lines[0]) // 기록의 수 
var logs = lines.slice(1) // 송수신 기록들
let len = logs.length;
let count = 1;
let category = '';
let number='';
let answer = '';

function check(category, number, newCate, newNumber) {
	if (category === newCate && number === newNumber ) {
		count++;
		len--;
	}
	else {
		if (count != 1) {
			answer += category+" "+number+` (${count})\n`;
		} else {
			answer += category+" "+number+"\n";
		}	
		count = 1;
	}
}

logs.map((log, index) => {
	let newCate = log.split(' ')[0];
	let newNumber = log.split(' ')[1];
	switch(newCate) {
		case "SMS":
			check(category, number, newCate, newNumber);
			break;
		case "CALL":
			check(category, number, newCate, newNumber);
			break;
	}
	category = newCate;
	number = newNumber;
	if (index + 1 === logs.length) {
		if (count === 1)
			answer += category+" "+number+"\n";
		else
			answer += category+" "+number+` (${count})\n`;
	}
})


console.log(`${len}` + answer);