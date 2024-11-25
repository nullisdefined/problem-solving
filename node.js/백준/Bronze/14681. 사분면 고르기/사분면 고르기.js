const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function(line) {
    input.push(line);
}).on('close', function() {
    const x = Number(input[0]);
    const y = Number(input[1]);

    if (x * y > 0) {
        if (x > 0) {
            console.log(1);
        } else {
            console.log(3);
        }
    } else {
        if (x > 0) {
            console.log(4);
        } else {
            console.log(2);
        }
    }

    process.exit();
});