function solution(n) {
    let str = n.toString().split("").sort().reverse().join("");
    return parseInt(str);
}