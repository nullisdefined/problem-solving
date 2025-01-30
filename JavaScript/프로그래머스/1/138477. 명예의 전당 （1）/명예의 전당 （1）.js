function solution(k, score) {
    var answer = [];
    var nums = [];
    score.forEach(num => {
        nums.push(num);
        nums.sort((a, b) => b - a).splice(k);
        answer.push(nums[nums.length - 1]);
    })
    return answer;
}