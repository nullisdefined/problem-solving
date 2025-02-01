function isValidMove(nx, ny) {
    return nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5;
}

function solution(dirs) {
    let x = 0;
    let y = 0;
    
    const visited = new Set();
    
    for(const dir of dirs) {
        let nx = x;
        let ny = y;
        
        if (dir === 'U') {
            ny++;
        } else if (dir === 'D') {
            ny--;
        } else if (dir === 'L') {
            nx--;
        } else if (dir === 'R') {
            nx++;
        }
        
        if(!isValidMove(nx, ny)) continue;
        
        visited.add(`${x}${y}${nx}${ny}`);
        visited.add(`${nx}${ny}${x}${y}`);
        
        x = nx;
        y = ny;
    }
    
    return visited.size / 2;
}