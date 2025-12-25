import java.util.Scanner;


   1. Check if age is greater than 18 → Adult

      
class AdultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        }
    }
}


2. Check whether a number is divisible by 10

   class DivisibleBy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 10 == 0)
            System.out.println("Divisible by 10");
        else
            System.out.println("Not Divisible by 10");
    }
}


   3. Temperature above 30°C → Hot Day
  
class HotDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > 30)
            System.out.println("Hot Day");
    }
}

   4. Even or Odd

      class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

   5. Leap Year Check

      class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}


   6. Positive or Negative

class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}


   7. Grade Based on Marks

class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else if (marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}


   8. Day of Week (1–7)

class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
    }
}


   9. Triangle Type

class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}


   10. Age Group Classification

class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age <= 12)
            System.out.println("Child");
        else if (age <= 19)
            System.out.println("Teenager");
        else if (age <= 59)
            System.out.println("Adult");
        else
            System.out.println("Senior Citizen");
    }
}


   11. Temperature Classification

   class TemperatureClassify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp >= 35)
            System.out.println("Hot");
        else if (temp >= 25)
            System.out.println("Warm");
        else if (temp >= 15)
            System.out.println("Cool");
        else
            System.out.println("Cold");
    }
}


   12. Positive, Negative or Zero

   class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}


   13. Voting & Contest Eligibility
 
class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
            if (age >= 25)
                System.out.println("Eligible to Contest");
            else
                System.out.println("Not Eligible to Contest");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}


   14. Leap Year & Century Year

class LeapCentury {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap Year");
            if (year % 100 == 0)
                System.out.println("Century Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}


   15. Even & Greater than 50

class EvenGreater50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
            if (num > 50)
                System.out.println("Greater than 50");
        } else {
            System.out.println("Odd");
        }
    }
}
