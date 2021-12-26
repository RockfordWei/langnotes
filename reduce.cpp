#include <iostream>
#include <list>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst = {9, 5, 2, 7};
    int sum = 0;
    for(const auto& x: lst) {
        sum += x;
    }
    cout << sum << endl;
    return 0;
}
