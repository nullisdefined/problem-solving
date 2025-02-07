function solution(s)
{
    const st = [];
    st.push(s[0]);
    
    for(let i=1; i<s.length; ++i) {
        const top = st[st.length-1];
        if (s[i] !== top) {
            st.push(s[i]);
            continue;
        }
        st.pop();
    }
    
    if (st.length === 0) return 1;
    return 0;
}