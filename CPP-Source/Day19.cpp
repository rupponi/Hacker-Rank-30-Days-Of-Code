//DAY 19 OF HACKERRANK 30 DAY CHALLENGE: INTERFACES (C++)

#include <cmath>
#include <iostream>
using namespace std;

class AdvancedArithmetic{
    public:
        virtual int divisorSum(int n)=0;
};

class Calculator: public AdvancedArithmetic {
    public:
        int output;
        Calculator() {
            output = 0;
        }
        int divisorSum(int n) {
            for (int x = 1; x <= 1000; x++) {
                if (n % x == 0) {
                    output += x;
                }
            }
            
            return output;
        }
};

int main() {
    int n;
    cin >> n;
    AdvancedArithmetic *myCalculator = new Calculator(); 
    int sum = myCalculator->divisorSum(n);
    cout << "I implemented: AdvancedArithmetic\n" << sum;
    return 0;
}