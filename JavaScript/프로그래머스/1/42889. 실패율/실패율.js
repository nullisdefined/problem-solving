function solution(N, stages) {
    const challenger = new Array(N+2).fill(0);
    
    stages.forEach((stage) => {
        challenger[stage]++;
    });
    
    // console.log(challenger);
    
    const fails = {};
    let total = stages.length;
    
    for(let i=1; i<N+1; ++i) {
        if (challenger[i] === 0) {
            fails[i] = 0;
            continue;
        }
        
        fails[i] = challenger[i] / total;
        total -= challenger[i];
    }
    
    // console.log(fails);
    
    // console.log(Object.entries(fails));
    
    return Object.entries(fails).sort((a, b) => b[1] - a[1]).map((e) => Number(e[0]));
}