import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber =  random.nextInt(1, 100);

        System.out.println("Угадай число от 1 до 100");
        System.out.println("У вас 5 попыток");

        int attempt = 5;

        while (attempt > 0){

            int myNumber = scanner.nextInt();

            if (myNumber == randomNumber) {
                System.out.println("ВЫ УГАДАЛИ!!!");
                break;
            } else if (myNumber > randomNumber) {
                System.out.println("Слишком высокое");
                attempt--;
            } else if (myNumber < randomNumber) {
                System.out.println("Слишком низкое");
                attempt--;
            }
        }
        if(attempt == 0){
            System.out.println();
            System.out.println("Вы не угодали:[");
            System.out.println("Это было число " + randomNumber) ;
        }

    }
}