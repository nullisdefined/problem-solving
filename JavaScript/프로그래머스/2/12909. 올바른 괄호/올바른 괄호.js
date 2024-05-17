function solution(s) {
    let acc = 0;
    for(let elem of s.split('')) {
        if(acc < 0) return false;
        elem === '('? acc++: acc--;
    }

    return acc === 0? true: false;
}