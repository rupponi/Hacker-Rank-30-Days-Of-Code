//DAY 18 OF HACKERRANK 30 DAY CHALLENGE: QUEUES AND STACKS (C++)

#include <iostream>
#include <vector>
using namespace std;

class Solution {
    public:
        vector<char> stack;
        vector<char> queue;
        int n;
        int m;
    
        Solution() {
            stack = vector<char>(0);
            queue = vector<char>(0);
            n = 0;
            m = 0;
        }
    
        void pushCharacter(char c) {
            if (n == 0) {
                stack = vector<char>(1);
                stack[0] = c;
                n++;
            }
            else {
                vector<char> temp = vector<char>(n+1);
                for (int x = 0; x < n; x++) {
                    temp[x+1] = stack[x];
                }
                temp[0] = c;
                stack = temp;
                n++;
            }
        }
    
        void enqueueCharacter(char c) {
            if (m == 0) {
                queue = vector<char>(1);
                queue[0] = c;
                m++;
            }
            else {
                vector<char> temp = vector<char>(m+1);
                for (int y = 0; y < m; y++) {
                    temp[y] = queue[y];
                }
                temp[m] = c;
                queue = temp;
                m++;
            }
        }
    
        char popCharacter() {
            if (n == 0) {
                char popOut = '\0';
                return popOut;
            }
            else {
                vector<char> temp = vector<char>(n-1);
                for (int x = 0; x < n-1; x++) {
                    temp[x] = stack[x];
                }
                char popOut = stack[n-1];
                stack = temp;
                n--;
                return popOut;
            }
        }
    
        char dequeueCharacter() {
            if (m == 0) {
                char dequeueOut = '\0';
                return dequeueOut;
            }
            else {
                vector<char> temp = vector<char>(n-1);
                for (int y = 0; y < m-1; y++) {
                    temp[y] = queue[y];
                }
                char dequeueOut = queue[m-1];
                queue = temp;
                m--;
                return dequeueOut;
            }
        }
};

int main() {
    // read the string s.
    string s;
    getline(cin, s);
    
  	// create the Solution class object p.
    Solution obj;
    
    // push/enqueue all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }
    
    bool isPalindrome = true;
    
    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;
            
            break;
        }
    }
    
    // finally print whether string s is palindrome or not.
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }
    
    return 0;
}