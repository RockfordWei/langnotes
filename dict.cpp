#include <iostream>
#include <map>
using namespace std;
int main(int argc, const char * argv[]) {
    map<string, string> dinner = {
        {"appetizer", "apple"},
        {"beverage", "beer"},
        {"course", "crawfish"},
        {"desert", "donut"}
    };
    for(const auto& i: dinner) {
        string key = i.first;
        string value = i.second;
        cout << key << ":\t" << value << endl;
    }
    return 0;
}
