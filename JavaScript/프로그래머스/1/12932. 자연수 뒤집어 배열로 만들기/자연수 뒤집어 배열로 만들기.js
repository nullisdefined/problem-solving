function solution(n) {
    return n.toString().split("").reverse().map(x=>x=parseInt(x));
}