import java.util.Scanner;

// 1. Print Day Name (1–7)
class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}

// 2. Print Month Name (1–12)
class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}

// 3. Calculator using Switch Case
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}

// 4. Grade Message
class GradeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}

// 5. Traffic Light Action
class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}

// 6. Vowel or Consonant
class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

// 7. Even or Odd using Switch Case
class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Even Number");
                break;
            case 1:
                System.out.println("Odd Number");
                break;
        }
    }
}

// 8. Electricity Rate based on Category
class ElectricityRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category = sc.next();

        switch (category) {
            case "Domestic":
                System.out.println("Rate: 5 Rs/unit");
                break;
            case "Commercial":
                System.out.println("Rate: 8 Rs/unit");
                break;
            case "Industrial":
                System.out.println("Rate: 10 Rs/unit");
                break;
            default:
                System.out.println("Invalid Category");
        }
    }
}

// 9. Season based on Month Number
class SeasonByMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Summer");
                break;
            case 6: case 7: case 8:
                System.out.println("Monsoon");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
