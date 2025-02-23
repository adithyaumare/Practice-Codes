#include <iostream>
using namespace std;

long long solve(long long total){
    long long original = total;
    total = total + 1;
    long long step = 1;
    long long count = 0;
    while (total >= step){
        count++;
        total -= step;
        step++;
    }
    return original + 1 - count;
}

int main(){
    int T;
    cin >> T;
    while (T--){
        long long total;
        cin >> total;
        cout << solve(total) << endl;
    }
    return 0;
}