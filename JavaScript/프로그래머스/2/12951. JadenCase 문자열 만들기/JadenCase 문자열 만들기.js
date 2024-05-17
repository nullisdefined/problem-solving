function solution(s) {
    let str = '';
    // index가 아닌 charAt 메서드를 이용해서 빈 문자열로 인한 런타임을 방지함
    str = s.split(' ').map(word => {
        return word.charAt(0).toUpperCase() + word.slice(1).toLowerCase();
    }).join(" ");
    
    return str;
}