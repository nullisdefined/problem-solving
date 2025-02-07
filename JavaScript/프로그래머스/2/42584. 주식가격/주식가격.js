// O(n)으로 풀어야 통과지만, 별다른 알고리즘이 생각나지 않을 때는
// O(n^2)으로 풀고 정확성 테스트 점수를 확보한 뒤
// 효율성 테스트를 위한 생각은 나중에 하기

function solution(prices) {
    const answer = new Array(prices.length).fill(0);
    const st = [];
    
    for (let i=0; i<prices.length; ++i) {
        while (st.length > 0 && prices[i] < prices[st[st.length - 1]]) {
            const j = st.pop();
            answer[j] = i - j;
        }
        st.push(i);
    }
    
    while (st.length > 0) {
        const j = st.pop();
        answer[j] = prices.length - 1 - j;
    }
    
    return answer;
}