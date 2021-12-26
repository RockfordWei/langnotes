#include <iostream>
#include <list>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst = {9, 5, 2, 7};
    auto lambda = [](int x) { return x * 2; };
    transform(lst.begin(), lst.end(), lst.begin(), lambda);
    for(const auto& x: lst) {
        cout << x << ", ";
    }
    cout << endl;
    return 0;
}
