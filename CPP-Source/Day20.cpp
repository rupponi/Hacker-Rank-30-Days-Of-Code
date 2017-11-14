//DAY 20 OF HACKERRANK 30 DAY CHALLENGE: SORTING (C++)

//NOTE: Exercise requires the use of Bubble Sort.
#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for(int a_i = 0; a_i < n; a_i++){
       cin >> a[a_i];
    }
    
    int numSwaps = 0;
    
    for (int x = 0; x < n; x++) {
        int sweepSwaps = 0;
        for (int y = 0; y < n-1; y++) {
            if (a[y+1] < a[y]) {
                int temp = a[y];
                a[y] = a[y+1];
                a[y+1] = temp;
                sweepSwaps++;
            }
        }
        numSwaps += sweepSwaps;
    }
    
    cout << "Array is sorted in " << numSwaps << " swaps." << endl;
    cout << "First Element: " << a[0] << endl;
    cout << "Last Element: " << a[n-1] << endl;
    
    return 0;
}