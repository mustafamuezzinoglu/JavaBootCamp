package part1;

import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {
        String a = "EU Batch 10";
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(a);
            System.out.println("Cydeo School inside" );

        }

        System.out.println("Cydeo School is outside " );

        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num<=0) {
            System.out.println("Enter a positive number");
            num = scan.nextInt();

        }

        while (true) {
            System.out.println("Enter a positive number");
            num = scan.nextInt();
            if(num >0 ){
                break; // exits the loop
            }
        }
        System.out.println("you have entered: "+ num);

        System.out.println("===================");

        for(char i='A' ; i <= 'K' ; i++){
            if ( i == 'D' || i == 'H' || i == 'J'){
                continue; //skips
            }
            System.out.println("i = " + i);
        }
        System.out.println("===================");

        for(char i='A' ; i <= 'K' ; i++){
            if ( i == 'D' || i == 'H' || i == 'J'){
                return; //exits the method
            }
            System.out.println("i = " + i);
        }

        System.out.println("Hello");



    }

}
