//DAY 14 OF HACKERRANK 30 DAY CHALLENGE: SCOPE (C++)

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
private:
	vector<int> elements;

public:
	int maximumDifference;

//THIS PART OF THE DIFFERENCE CLASS WAS FILLED OUT FOR THE EXERCISE.
	Difference(vector<int> input) {
		elements = input;
	}

	void computeDifference() {
		int min = 101;//Higher than range given of 1<=x<=100. Forces any input to change its value.
		int max = 0;//Lower than range given of 1<=x<=100 Forces any input to change its value.

		for (int x = 0; x < elements.size(); x++) {
			if (elements[x] < min) {
				min = elements[x];
			}
			if (elements[x] > max) {
				max = elements[x];
			}
		}

		maximumDifference = max - min;
	}
}; 

//MAIN METHOD GIVEN USED FOR TESTING THE CLASS THAT WAS COMPLETED.
int main() {
	int N;
	cin >> N;

	vector<int> a;

	for (int i = 0; i < N; i++) {
		int e;
		cin >> e;

		a.push_back(e);
	}

	Difference d(a);

	d.computeDifference();

	cout << d.maximumDifference;

	return 0;
}