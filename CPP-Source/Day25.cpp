//DAY 25 OF HACKERRANK 30 DAY CHALLENGE: RUNNING TIME AND COMPLEXITY (C++)

#include <cmath>
#include <vector>
#include <iostream>
using namespace std;


int main() {
    int T = 0;
    cin >> T;
    
    for (int x = 0; x < T; x++) {
        int input = 0;
        cin >> input;
        bool isPrime = true;
        
        if (input <= 1) {
            isPrime = false;
        }
        
        int inputRoot = sqrt(input);
        for (int y = 2; y <= inputRoot; y++) {
            if (input % y == 0) {
                isPrime = false;
            }
        }
        
        if (isPrime) {
            cout << "Prime" << endl;
        }
        else {
            cout << "Not prime" << endl;
        }
    }
}
