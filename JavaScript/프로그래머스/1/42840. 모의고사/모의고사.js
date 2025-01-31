function solution(answers) {
    const answer = [];
    const patterns = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
    ];
    
    const scores = new Array(3).fill(0);
    
    for(let i = 0; i < answers.length; ++i) {
            for(let j = 0; j < 3; ++j) {
                if (patterns[j][i % patterns[j].length] === answers[i])
                    scores[j]++;
            }
    }
    
    const highScore = Math.max(...scores);
    
    scores.forEach((score, i) => {
        if (score === highScore)
            answer.push(i+1);
    })
    
    return answer;
}