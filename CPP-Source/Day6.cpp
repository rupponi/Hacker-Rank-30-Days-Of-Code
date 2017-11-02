//DAY 6 OF HACKERRANK 30 DAY CHALLENGE: LET'S REVIEW (C++)

#include <iostream>
#include <string>
using namespace std;


int main() {
	int numStrings = 0;
	int x, y;
	cin >> numStrings;

	for (x = 0; x < numStrings; x++) {
		string input = "";
		cin >> input;
		int n = input.length();

		for (y = 0; y < n; y += 2) {
			cout << input.at(y);
		}
		cout << " ";
		for (y = 1; y < n; y += 2) {
			cout << input.at(y);
		}
		cout << "\n";
	}
}
