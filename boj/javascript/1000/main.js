const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

readline.on('line', function(line) {
    input = line.split(' ').map(el => parseInt(el));
}).on('close', function(){
    // solution
    const a = parseInt(input[0]);
    const b = parseInt(input[1]);
    console.log(a+b);
    
    process.exit();
});