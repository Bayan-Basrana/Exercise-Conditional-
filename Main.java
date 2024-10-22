import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
1.Write a program that checks the role of the user
 */

        Scanner input = new Scanner(System.in);
        System.out.println(" please enter your role Admin , superuser , user");
        String role =input.nextLine();

        if (role.equalsIgnoreCase("admin") )
            System.out.println("welcome admin");
        else if(role.equalsIgnoreCase("superuser") )
            System.out.println("welcome superuser");
        else if (role.equalsIgnoreCase("user"))
        System.out.println("welcome user");
         else
           System.out.println("incorrect entry");




 /*
 2-Take three numbers from the user and print the greatest number.
Test Data
 */


        System.out.println("please enter  number1 ");
           int num1  = input.nextInt();
        System.out.println("please enter  number2 ");
           int num2  = input.nextInt();
        System.out.println("please enter  number3 ");
           int num3 = input.nextInt();

if (num1>num2 && num1>num3)
    System.out.println(" The greatest: "+num1 );
else if (num2>num1 && num2>num3)
    System.out.println(" The greatest: "+num2 );
else
    System.out.println(" The greatest: "+num3 );


/*
3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
 */
        Random ran =new Random();
        int low =1 ;
        int high = 8;
        int generate_num = ran.nextInt( high-low);
        if (generate_num ==1)
            System.out.println("sunday");
        else if (generate_num ==2)
            System.out.println("Monday");
        else if (generate_num ==3)
            System.out.println("Tuesday");
        else if (generate_num ==4)
            System.out.println("Wednesday");
        else if (generate_num ==5)
            System.out.println("Thursday");
        else if (generate_num ==6)
            System.out.println("Friday");
        else
            System.out.println("Saturday");



/*
4.Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
 */
        System.out.println("Enter your numeric score ");
        int score = input.nextInt();
        if (score >= 90 && score <= 100)
            System.out.println("Letter Grade: A");
        else if (score >= 80 && score <90)
            System.out.println("Letter Grade: B");
        else if (score >= 70 && score <80)
            System.out.println("Letter Grade: C");
        else if (score >= 60 && score <70)
            System.out.println("Letter Grade: D");
        else if (score >= 0 && score <=59)
            System.out.println("Letter Grade: F");
        else
            System.out.println("INCORRECT NUMBER");
/*
5.Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
 */
        System.out.println("Enter your Age");
        int age = input.nextInt();
        if(age<13 )
            System.out.println("You are an Child");
        else if (age >=13 && age <= 19 )
            System.out.println("You are an Teenager");
        else
            System.out.println("You are an Adult");

    }


    }


