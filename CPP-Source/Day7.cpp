//DAY 7 OF HACKERRANK 30 DAY CHALLENGE: ARRAYS (C++)

#include <string>
#include <vector>
#include <iostream>

using namespace std;


int main() {
	int n;
	cin >> n;
	vector<int> arr(n);
	for (int arr_i = 0; arr_i < n; arr_i++) {
		cin >> arr[arr_i];
	}

	for (int x = n - 1; x >= 0; x--) {
		cout << arr[x] << " ";
	}
	cout << "\n";

	return 0;
}
