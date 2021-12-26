#include <iostream>
#include <list>
#include <unordered_set>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst;
    int j = 1;
    for(int i = 0; i < 10; i++) {
        j *= -1;
        lst.push_back(j);
    }
    unordered_set<int> unsorted(std::begin(lst), std::end(lst));
    for(const auto& x: unsorted) {
        cout << x << endl;
    }
    return 0;
}
