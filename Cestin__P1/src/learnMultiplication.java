import java.util.Random;
import java.util.Scanner;

public class learnMultiplication {
    private static Scanner sc = new Scanner(System.in);
    private static Random rm = new Random(); //for part 2
    private static int counter = 0, corr = 0, incorr = 0; //for part 3
    public static void main(String[] args){
        System.out.println("\nThis Program will help you with arithmetic problems");
        System.out.println("1. Addition");
        System.out.println("2. Mulitplication");
        System.out.println("3. Substraction");
        System.out.println("4. Division");
        System.out.println("5. Mix Question");
        System.out.println("---------------------------");
        System.out.print("Choose your option: ");
        int arithmetic = sc.nextInt();
        Difficulty(arithmetic);
    }
    //for part 1 and 2 while (true) {
        /*while (counter < 10){ //part 3
            counter ++; //part 3
            Random rm = new Random();
            int num1 = rm.nextInt(10);
            int num2 = rm.nextInt(10);
            multiple(num1, num2);
        }
        percent(); //part 3
    }*/

    private static void multiple(int num1, int num2){

        int result = num1 * num2;
        do {
            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int userAnswer = sc.nextInt();
            if (userAnswer == result) {
                corr++; //part 3
                //From part 1*************System.out.println("Very Good!");
                //Modify for part 2
                correct();
                break; //part 1
            } else {
                incorr++;//part 3
                incorrect();
                break;
                //From part1*************System.out.println("No, Please try again");
            }
        } while (true);
    }
    private static void addition(int num1, int num2){

        int result = num1 + num2;
        do {
            System.out.println("How much is " + num1 + " plus " + num2 + "?");
            int userAnswer = sc.nextInt();
            if (userAnswer == result) {
                corr++; //part 3
                //From part 1*************System.out.println("Very Good!");
                //Modify for part 2
                correct();
                break; //part 1
            } else {
                incorr++;//part 3
                incorrect();
                break;
                //From part1*************System.out.println("No, Please try again");
            }
        } while (true);
    }
    private static void subtraction(int num1, int num2){

        int result = num1 - num2;
        do {
            System.out.println("How much is " + num1 + " minus " + num2 + "?");
            int userAnswer = sc.nextInt();
            if (userAnswer == result) {
                corr++; //part 3
                //From part 1*************System.out.println("Very Good!");
                //Modify for part 2
                correct();
                break; //part 1
            } else {
                incorr++;//part 3
                incorrect();
                break;
                //From part1*************System.out.println("No, Please try again");
            }
        } while (true);
    }
    private static void division(int num1, int num2){

        int result = num1 / num2;
        do {
            System.out.println("How much is " + num1 + " divided by " + num2 + "?");
            int userAnswer = sc.nextInt();
            if (userAnswer == result) {
                corr++; //part 3
                //From part 1*************System.out.println("Very Good!");
                //Modify for part 2
                correct();
                break; //part 1
            } else {
                incorr++;//part 3
                incorrect();
                break;
                //From part1*************System.out.println("No, Please try again");
            }
        } while (true);
    }
    private static void correct(){
        int c1 = rm.nextInt(4);
        switch(c1){
            case 0:
                System.out.println("Very Good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice Work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    private static void incorrect(){
        int c2 = rm.nextInt(4);
        switch(c2){
            case 0:
                System.out.println("No, please try again!");
                break;
            case 1:
                System.out.println("Wrong answer, try again!");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No, keep trying!");
                break;
        }
    }
    //part 3
    private static void percent(){
        if(corr >= 7.5){
            System.out.println("Congratulation, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }
    }
    //Part 4
    private static void Difficulty(int arithmeticOption){
        System.out.print("Please Enter your level digit number you would like to work on (1 to 4): \n");//for part 4
        int userLevel = sc.nextInt(); //for part 4
        int num1 = 0, num2 = 0, digit = 0;
        switch(userLevel){
            case 1:
                digit = 10;
                break;
            case 2:
                digit = 100;
                break;
            case 3:
                digit = 1000;
                break;
            case 4:
                digit = 10000;
                break;
        }

        while(counter < 10 ){
            counter ++;
            rm= new Random();
            num1 = rm.nextInt(digit);
            num2 = rm.nextInt(digit);
            switch(arithmeticOption) //Part 5
            {
                case 1:
                    addition(num1, num2);
                    break;
                case 2:
                    multiple(num1, num2);
                    break;
                case 3:
                    subtraction(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 5:
                    int c1 = rm.nextInt(4);
                    switch(c1){
                        case 0:
                            addition(num1, num2);
                            break;
                        case 1:
                            multiple(num1, num2);
                            break;
                        case 2:
                            subtraction(num1, num2);
                            break;
                        case 3:
                            division(num1, num2);
                            break;
                    }
                    break;
            }

        }
        percent();
    }
}
