function solution(numbers) {
    let arr = [];
    numbers.sort((a, b) => a - b);
    for(let i = 0; i < numbers.length; ++i) {
        for(let j = 0; j < i; ++j) {
            arr.push(numbers[i] + numbers[j]);
        }
    }
    
    return [...new Set(arr)].sort((a, b) => a - b);
}