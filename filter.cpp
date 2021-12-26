#include <iostream>
#include <list>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst = {9, 5, 2, 7};
    list<int> filtered;
    auto lambda = [](int x) { return x % 2; };
    copy_if(lst.begin(), lst.end(),
            std::back_inserter(filtered), lambda);
    for(const auto& x: filtered) {
        cout << x << ", ";
    }
    cout << endl;
    return 0;
}
