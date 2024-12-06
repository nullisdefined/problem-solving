function solution(s) {
    let curBinary = s;
    let cnt = 0;
    let cntZero = 0;
    while(curBinary !== "1") {
        let curZero = 0;
        for(let i=0; i<curBinary.length; ++i) {
            if(curBinary[i] === "0") {
                cntZero++;
                curZero++;
            }
        }
        curBinary = (curBinary.length - curZero).toString(2);    
        cnt++;
    }
    
    return [cnt, cntZero];
}