#include <string>
#include <vector>
#include <queue>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    queue<int> q;
    for(int i=0; i<progresses.size(); ++i) {
        if((100-progresses[i])%speeds[i]) q.push((100-progresses[i])/speeds[i]+1);
        else q.push((100-progresses[i])/speeds[i]);
    }
    
    while(!q.empty()) {
        int t = q.front();
        int n = 1;
        q.pop();
        
        while(t>=q.front()&&!q.empty()) {
            n++;
            q.pop();
        }
        answer.push_back(n);
    }
    return answer;
}