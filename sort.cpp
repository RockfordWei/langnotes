#include <iostream>
#include <list>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst = {9, 5, 2, 7};
    lst.sort();
    for (const auto& x: lst) {
        cout << x << ", ";
    }
    cout << endl;
    return 0;
}
