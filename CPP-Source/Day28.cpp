//DAY 28 OF HACKERRANK 30 DAY CHALLENGE: REGEX, PATTERNS, AND INTRO TO DATABASES (C++)

#include <iostream>
#include <string>
#include <vector>

using namespace std;


int main() {
	int N;
	cin >> N;
	vector<string> validIds = vector<string>(0);

	for (int a0 = 0; a0 < N; a0++) {
		string firstName;
		string emailID;
		cin >> firstName >> emailID;

		if (emailID.find("@gmail.com") != string::npos) {
			vector<string> temp = vector<string>(validIds.size() + 1);
			for (unsigned int x = 0; x < validIds.size(); x++) {
				temp[x] = validIds[x];
			}
			temp[validIds.size()] = firstName;
			validIds = temp;
		}
	}

	for (unsigned s = 0; s < validIds.size() - 1; s++) {
		int minIndex = s;
		for (int t = s + 1; t < validIds.size(); t++) {
			if (validIds[t].compare(validIds[minIndex]) < 0) {
				minIndex = t;
			}
		}
		if (minIndex != s) {
			string temp = validIds[s];
			validIds[s] = validIds[minIndex];
			validIds[minIndex] = temp;
		}
	}

	for (unsigned int z = 0; z < validIds.size(); z++) {
		cout << validIds[z] << endl;
	}

	return 0;
}
