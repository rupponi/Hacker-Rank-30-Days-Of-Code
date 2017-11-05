//DAY 10 OF HACKERRANK 30 DAY CHALLENGE: BINARY NUMBERS (C++)

#include <iostream>
#include <stack>

using namespace std;


int main() {
	int n;
	cin >> n;

	stack<int> binaryValue;

	while (n > 0) {
		int newBinDigit = n % 2;
		n = n / 2;
		binaryValue.push(newBinDigit);
	}

	int consecutive = 0;
	int currentStream = 0;

	while (!binaryValue.empty()) {
		int current = binaryValue.top();
		binaryValue.pop();
		if (current == 1) {
			currentStream++;
			if (currentStream > consecutive) {
				consecutive = currentStream;
			}
		}
		if (current == 0) {
			currentStream = 0;
		}
	}

	cout << consecutive << endl;

	return 0;
}
