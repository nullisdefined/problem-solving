const fs = require("fs");
// 제출할 때
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

// 로컬에서 테스트할 때
// const input = fs.readFileSync("input.txt").toString().trim().split("\n");

// 여기서부터 문제 풀이 코드 작성
const n = input[0]; // 첫 번째 줄 입력받기
const [a, b] = input[0].split(" ").map(Number);
console.log(a + b);
