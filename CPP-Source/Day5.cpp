//DAY 5 OF HACKERRANK 30 DAY CHALLENGE: LOOPS (C++)

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main() {
	int n, x;
	cin >> n;

	for (x = 1; x <= 10; x++) {
		int result = n * x;
		cout << n << " x " << x << " = " << result << endl;
	}

	return 0;
}
