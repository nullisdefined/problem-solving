#include <iostream>
#include <string>
#include <stack>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    stack<char> st;
    
    for(int i=0; i<s.size(); ++i) {
        if(s[i]=='(') st.push(s[i]);
        else if((!st.empty() && st.top()=='(')) st.pop();
        else {
            answer = false;
            break;
        }
    }
    if(!st.empty()) answer = false;

    return answer;
}