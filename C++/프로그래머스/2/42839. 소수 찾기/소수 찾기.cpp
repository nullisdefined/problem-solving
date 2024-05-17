#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int solution(string numbers) {
    int answer = 0;
    int size = numbers.size();
    vector<int> ind;
    vector<int> num;
    vector<int> v(10000000 ,1);
    
    v[0] = v[1] = 0;
    for(int i=2; i<10000000; ++i)
        for(int j=i*2; j<10000000; j+=i)
            v[j] = 0;
    
    sort(numbers.begin(), numbers.end());
    
    for(int i=0; i<size; ++i) {
        ind.resize(size, 1);
        for(int j=0; j<i; ++j) ind[j] = 0;
        sort(ind.begin(), ind.end());
        
        do {
            string str = "";
            for(int i=0; i<size; ++i)
                if(ind[i] == 1) str.push_back(numbers[i]);
            do {
                num.push_back(stoi(str));
            } while(next_permutation(str.begin(), str.end()));
        } while(next_permutation(ind.begin(), ind.end()));
    }
    
    sort(num.begin(), num.end());
    num.erase(unique(num.begin(), num.end()), num.end());
    
    for(int i=0; i<num.size(); ++i) {
        int k = num[i];
        if(v[k] == 1) answer++;
    }
    
    return answer;
}