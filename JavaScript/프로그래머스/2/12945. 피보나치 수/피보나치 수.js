function solution(n) {
    let ans = 0;
    let f0 = 0;
    let f1 = 1;
    
    for(let i=2; i<=n; ++i) {
        ans = (f0 + f1) % 1234567;
        f0 = f1;
        f1 = ans;
    }
    
    return ans;
}