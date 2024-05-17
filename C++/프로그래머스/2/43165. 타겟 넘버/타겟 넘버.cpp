#include <string>
#include <vector>
#include <algorithm>
#include <queue>
#include <numeric>

using namespace std;

int solution(vector<int> numbers, int target) {
    int answer = 0;
    vector<vector<int>> v;
    int s = numbers.size();
    queue<vector<int>> q;
    q.push({numbers[0]});
    q.push({(-1)*numbers[0]});
    
    while(!q.empty()) {
        int qs = q.front().size();
        if(qs == s) {
            if(accumulate(q.front().begin(), q.front().end(), 0) == target)
                answer++;
            q.pop();
        }
        else {
            vector<int> t1 = q.front();
            t1.push_back(numbers[qs]);
            vector<int> t2 = q.front();
            t2.push_back((-1)*numbers[qs]);
            q.pop();
            q.push(t1);
            q.push(t2);
        }
    }
    
    return answer;
}