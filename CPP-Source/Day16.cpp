//DAY 16 OF HACKERRANK 30 DAY CHALLENGE: EXCEPTIONS - STRING TO INTEGER (C++)

#include <string>
#include <iostream>

using namespace std;


int main(){
    string S;
    cin >> S;
    
    try {
        int output = stoi(S);
        cout << output << endl;
    }
    catch (const invalid_argument& ia) {
        cout << "Bad String" << endl;
    }
    
    return 0;
}