function solution(A,B){
    var answer = 0;
    A = A.sort((a, b) => a - b);
    B = B.sort((a, b) => b - a);
    // console.log(A, B);
    A.forEach((e, i) => {
        answer += e * B[i];
    })
    return answer;
}