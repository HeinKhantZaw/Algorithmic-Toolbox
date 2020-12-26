const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    terminal: false
});

process.stdin.setEncoding('utf8');
rl.once('line', () => {
    rl.on('line', readLine);
});

function readLine (line) {
    const arr = line.toString().split(' ').map(Number);

    console.log(max(arr));
    process.exit();
}

function max(arr) {
    arr.sort(function(a, b){return a - b});
    var arr_size = arr.length;
    return arr[arr_size-1]*arr[arr_size-2];
}

module.exports = max;
