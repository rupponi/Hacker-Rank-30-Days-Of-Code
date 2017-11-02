//DAY 2 OF HACKERRANK 30 DAY CHALLENGE: OPERATORS (C++)

#include <cmath>
#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
	double mealCost, tipCost, taxCost;
	cin >> mealCost;
	cin >> tipCost;
	cin >> taxCost;

	tipCost = mealCost * (tipCost / 100);
	taxCost = mealCost * (taxCost / 100);

	mealCost = mealCost + tipCost + taxCost;

	if ((mealCost - (int)mealCost) > 0.5) {
		mealCost = ceil(mealCost);
	}
	else {
		mealCost = floor(mealCost);
	}

	cout << "The total meal cost is " << mealCost << " dollars." << endl;

	return 0;
}
