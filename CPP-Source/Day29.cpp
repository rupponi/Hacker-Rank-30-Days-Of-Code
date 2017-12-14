//DAY 29 OF HACKERRANK 30 DAY CHALLENGE: BITWISE AND (C++)

#include <iostream>
using namespace std;

int main() {
	int t;
	cin >> t;
	for (int a0 = 0; a0 < t; a0++) {
		int n;
		int k;
		int highestVal = 0;
		cin >> n >> k;

		for (int a = 1; a < n; a++) {
			for (int b = a + 1; b <= n; b++) {
				if ((a & b) > highestVal && (a & b) < k) {
					highestVal = (a & b);
				}
			}
		}

		cout << highestVal << endl;
	}
}
