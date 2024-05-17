#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> citations) {
    int answer = 0;
    int s = citations.size();
    
    sort(citations.begin(), citations.end());
    
    for(int i=0; i<s; ++i) {
        if(s-i<citations[i] && answer<s-i) answer = s-i;
        else if(s-i>=citations[i] && answer<citations[i]) answer = citations[i];
    }
    
    return answer;
}