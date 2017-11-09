//DAY 13 OF HACKERRANK 30 DAY CHALLENGE: ABSTRACT CLASSES (C++)

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

//THIS IS A GIVEN ABSTRACT BASE CLASS TO BE USED FOR THE EXERCISE.
class Book {
protected:
	string title;
	string author;
public:
	Book(string t, string a) {
		title = t;
		author = a;
	}
	virtual void display() = 0;

};

//THIS IS THE CLASS THAT WAS WRITTEN, THAT WILL INHERIT FROM THE ABSTRACT CLASS GIVEN ABOVE.
class MyBook : public Book {
public:
	int price;

	MyBook(string titleIn, string authorIn, int priceIn) : Book(titleIn, authorIn) {
		price = priceIn;
	}
	void display() {
		cout << "Title: " << title << endl;
		cout << "Author: " << author << endl;
		cout << "Price: " << price << endl;
	}
};

//THIS IS THE MAIN METHOD TO UTILIZE THE CLASSES GIVEN ABOVE THEM TO TEST THEM.
int main() {
	string title, author;
	int price;
	getline(cin, title);
	getline(cin, author);
	cin >> price;
	MyBook novel(title, author, price);
	novel.display();
	return 0;
}
