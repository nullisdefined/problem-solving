function solution(s) {
    let numArr = s.split(' ').sort((a, b) => a - b);
    
    return Math.min(...numArr)+" "+Math.max(...numArr);
}