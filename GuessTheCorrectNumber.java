import java.util.Scanner;

class miniproject {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int myNumber = (int) (Math.random()*50);
    int userNumber = 0;
    do {
        System.out.println("Guess my number(1-50): ");
        userNumber = sc.nextInt();
        if (userNumber == myNumber) {
            System.out.println("that correct man");
            break;
        }
        else if(userNumber > myNumber) {
            System.out.println("your number is too high");
        }
        else {
            System.out.println("your number is too low");
        }
    } while (userNumber >= 0);
    System.out.print("my number was: ");
    System.out.println(myNumber);
        }
    }
