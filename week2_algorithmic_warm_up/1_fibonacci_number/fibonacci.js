const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    terminal: false
});

process.stdin.setEncoding('utf8');
rl.on('line', readLine);

function readLine(line) {
    console.log(fib(parseInt(line, 10)));
    process.exit();
}

function fib(n) {
if (n <= 1){
    return n;
}
	
var num = new Array(n);
num[0] = 1;
num[1] = 1;
for (let i = 2; i < num.length;i++){
    num[i] = num[i-1]+num[i-2];
}
return num[n-1]
}

module.exports = fib;
