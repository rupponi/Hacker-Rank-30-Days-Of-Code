//DAY 26 OF HACKERRANK 30 DAY CHALLENGE: NESTED LOGIC (C++)

#include <iostream>
using namespace std;


int main() {
	int dayActual, monthActual, yearActual, dayExpected, monthExpected, yearExpected, fine;

	cin >> dayActual >> monthActual >> yearActual;
	cin >> dayExpected >> monthExpected >> yearExpected;

	if (yearActual > yearExpected) {
		fine = 10000;
	}
	else if (yearActual == yearExpected) {
		if (monthActual > monthExpected) {
			fine = 500 * (monthActual - monthExpected);
		}
		else if (monthActual == monthExpected) {
			if (dayActual > dayExpected) {
				fine = 15 * (dayActual - dayExpected);
			}
			else {
				fine = 0;
			}
		}
		else {
			fine = 0;
		}
	}
	else {
		fine = 0;
	}

	cout << fine << endl;

	return 0;
}