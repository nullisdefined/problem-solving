function solution(n) {
    var answer = 0
    for(let i=1; i<=n; ++i) {
        let temp = n - (i * (1+i)) / 2
        if(temp % i === 0 && temp >= 0) answer++;
        if(temp < 0) break;
    }
    
    return answer
}