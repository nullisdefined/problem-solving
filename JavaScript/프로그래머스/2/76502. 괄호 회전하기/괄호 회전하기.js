class Stack {
    constructor() {
        this.stack = [];
    }
    size() {
        return this.stack.length;
    }
    push(value) {
        this.stack.push(value);
    }
    top() {
        if (this.size() === 0) {
            return -1;
        }
        return this.stack[this.size()-1];
    }
    pop() {
        if (this.top() === -1) {
            return null;
        }
        return this.stack.pop();
    }
}

function solution(s) {
    const st = new Stack();
    let answer = 0;
    
    for(let i=0; i<s.length; ++i) {
        let flag = true;
        for(let j=0; j<s.length; ++j) {
            if (s[j] === "[" || s[j] === "(" || s[j] === "{") {
                st.push(s[j]);
                continue;
            }
            
            if (s[j] === "]" && st.top() === "[") {
                st.pop();
                continue;
            } else if (s[j] === ")" && st.top() === "(") {
                st.pop();
                continue;
            } else if (s[j] === "}" && st.top() === "{") {
                st.pop();
                continue;
            } else {
                flag = false;
                break;
            }
        }
        
        if (flag === true && st.size() === 0) answer++;
        
        s = s.slice(1) + s[0];
    }
    return answer;
}