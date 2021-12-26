#include <iostream>
#include <list>
using namespace std;
int main(int argc, const char * argv[]) {
    list<int> lst = list<int>();
    for(int i = 0; i < 10; i++)
        lst.push_back(i);
    //next
    for (const auto& x: lst) {
        cout << x << ", ";
    }
    cout << endl;
    return 0;
}
