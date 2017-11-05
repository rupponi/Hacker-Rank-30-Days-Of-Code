//DAY 11 OF HACKERRANK 30 DAY CHALLENGE: 2D ARRAYS (C++)

#include <vector>
#include <iostream>
using namespace std;


int main() {
	vector< vector<int> > arr(6, vector<int>(6));
	for (int arr_i = 0; arr_i < 6; arr_i++) {
		for (int arr_j = 0; arr_j < 6; arr_j++) {
			cin >> arr[arr_i][arr_j];
		}
	}

	int result = -64;

	for (int x = 0; x < 4; x++) {
		for (int y = 0; y < 4; y++) {
			int hourglass = arr[x][y] + arr[x][y + 1] + arr[x][y + 2] + arr[x + 1][y + 1] + arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
			if (hourglass > result) {
				result = hourglass;
			}
		}
	}

	cout << result << endl;

	return 0;
}