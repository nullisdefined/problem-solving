function solution(n) {
    n = Math.sqrt(n);
    if(Math.ceil(n) === n) return Math.pow(n+1, 2);
    return -1;
}
