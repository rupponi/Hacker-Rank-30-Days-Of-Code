//DAY 4 OF HACKERRANK 30 DAY CHALLENGE: CLASS VS INSTANCE (JAVA)
//NOTE: The name of the original class was Person. It was altered to identify the Java class as the day 4 activity.

public class Day4 {
    private int age;

    public Day4(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String output = "";

        if (age < 13) {
            output = "You are young.";
        } else if ((age >= 13) && (age < 18)) {
            output = "You are a teenager.";
        } else {
            output = "You are old.";
        }

        System.out.println(output);
    }

    public void yearPasses() {
        age++;
    }
}
