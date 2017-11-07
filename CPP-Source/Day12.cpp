//DAY 12 OF HACKERRANK 30 DAY CHALLENGE: INHERITANCE (C++)

#include <iostream>
#include <string>
#include <vector>

using namespace std;


class Person {
protected:
	string firstName;
	string lastName;
	int id;
public:
	Person(string firstName, string lastName, int identification) {
		this->firstName = firstName;
		this->lastName = lastName;
		this->id = identification;
	}
	void printPerson() {
		cout << "Name: " << lastName << ", " << firstName << "\nID: " << id << "\n";
	}

};

class Student : public Person {
private:
	vector<int> testScores;
public:
	Student(string firstName, string lastName, int identification, vector<int> grades) : Person(firstName, lastName, identification) {
		this->testScores = grades;
	}

	char calculate() {
		int total = 0;
		int average = 0;
		for (int x = 0; x < testScores.size(); x++) {
			total += testScores[x];
		}
		average = (total / testScores.size());
		char currentGrade = ' ';

		if ((average >= 90) && (average <= 100)) {
			currentGrade = 'O';
		}
		else if ((average >= 80) && (average < 90)) {
			currentGrade = 'E';
		}
		else if ((average >= 70) && (average < 80)) {
			currentGrade = 'A';
		}
		else if ((average >= 55) && (average < 70)) {
			currentGrade = 'P';
		}
		else if ((average >= 40) && (average < 55)) {
			currentGrade = 'D';
		}
		else {
			currentGrade = 'T';
		}

		return currentGrade;
	}
};

int main() {
	string firstName;
	string lastName;
	int id;
	int numScores;
	cin >> firstName >> lastName >> id >> numScores;
	vector<int> scores;
	for (int i = 0; i < numScores; i++) {
		int tmpScore;
		cin >> tmpScore;
		scores.push_back(tmpScore);
	}
	Student* s = new Student(firstName, lastName, id, scores);
	s->printPerson();
	cout << "Grade: " << s->calculate() << "\n";
	return 0;
}