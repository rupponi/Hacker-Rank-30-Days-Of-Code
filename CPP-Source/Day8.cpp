//DAY 8 OF HACKERRANK 30 DAY CHALLENGE: DICTIONARIES NAD MAPS (C++)

#include <cstdio>
#include <string>
#include <iostream>
#include <cstdint>
#include <map>
using namespace std;


int main() {
	int n, x;
	n = 0;
	cin >> n;
	map<string, int> phoneBook;

	cin.ignore();

	for (x = 0; x < n; x++) {
		size_t breakpoint = 0;
		string input, name, breakcatch;
		breakcatch = " ";
		int number;
		getline(cin, input);
		breakpoint = input.find(breakcatch);
		name = input.substr(0, breakpoint);
		number = stoi(input.substr(breakpoint));
		phoneBook[name] = number;
	}
	string userIn;
	cin >> userIn;

	while (cin) {
		if (phoneBook.find(userIn) != phoneBook.end()) {
			cout << userIn << "=" << phoneBook[userIn] << endl;
		}
		else {
			cout << "Not found" << endl;
		}
		cin >> userIn;
	}

	return 0;
}
