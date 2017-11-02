//DAY 1 OF HACKERRANK 30 DAY CHALLENGE: DATA TYPES (C++)

#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int main() {
	int i = 4;
	double d = 4.0;
	string s = "HackerRank ";


	// Declare second integer, double, and String variables.
	int i_in;
	double d_in;
	string s_in;

	// Read and save an integer, double, and String to your variables.
	// Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
	cin >> i_in;
	cin >> d_in;

	cin.ignore();
	getline(cin, s_in);

	// Print the sum of both integer variables on a new line.
	int i_out = i_in + i;
	cout << i_out << endl;

	// Print the sum of the double variables on a new line.
	d_in = d_in + d;
	cout << setprecision(1) << fixed << d_in << endl;

	// Concatenate and print the String variables on a new line
	// The 's' variable above should be printed first.
	string s_out = s + s_in;
	cout << s_out << endl;

	return 0;
}