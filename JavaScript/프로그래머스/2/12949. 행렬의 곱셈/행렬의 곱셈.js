function solution(arr1, arr2) {
    const answer = [];
    for(let i=0; i<arr1.length; ++i) {
        answer.push(new Array(arr2[0].length).fill(0));
    }
    
    // 첫 번째 for: 첫 번째 행렬의 행 정하기
    for(let i=0; i<arr1.length; ++i) {
        // 두 번째 for: 두 번째 행렬의 열 정하기
        for(let j=0; j<arr2[0].length; ++j) {
            let value = 0;
            // 세 번째 for: 곱할 원소 인덱스 정하기
            for(let k=0; k<arr1[0].length; ++k) {
                value += arr1[i][k] * arr2[k][j];
            }
            answer[i][j] = value;
        }
    }
    
    return answer;
}