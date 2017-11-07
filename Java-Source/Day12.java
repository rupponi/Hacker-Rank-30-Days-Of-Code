//DAY 12 OF HACKERRANK 30 DAY CHALLENGE: INHERITANCE (JAVA)

import java.util.Scanner;

//Main Day 12 Class. This simply runs the Student class below that was worked on.
public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}


//This is the Person base class that the Student class derives from.
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}


//This is the Student class that was worked on. A constructor was provided utilizing the super class's constructor.
// In addition, a calculate method was provided to average all given test scores and provide a letter grade.
class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName,lastName,identification);
        this.testScores = scores;
    }

    public char calculate() {
        int total = 0;
        for (int x = 0; x < testScores.length; x++) {
            total += testScores[x];
        }
        int average = (total / testScores.length);
        char currentGrade;

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
}

