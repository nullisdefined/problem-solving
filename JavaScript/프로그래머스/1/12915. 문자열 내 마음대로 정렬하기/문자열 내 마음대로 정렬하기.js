function solution(strings, n) {
    return strings.sort((a, b) => {
        if (a.charCodeAt(n) === b.charCodeAt(n)) {
            return a.localeCompare(b);
        }
        return a.charCodeAt(n) - b.charCodeAt(n);
    })
}