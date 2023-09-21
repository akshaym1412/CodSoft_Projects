import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  int count=2;

    public static void Start(){
       int guess;
       int count=2;
       Scanner sc=new Scanner(System.in);
       Random rand = new Random();
       int answer = rand.nextInt(100) + 1;
       System.out.println("--------------------WELCOME TO NUMBER GUESS GAME-----------------");
       System.out.println("Guess a number between 1 to 100: ");
       while (true) {
           if(count>-1)
           {
               guess = sc.nextInt();

               if (guess > answer) {
                   if(count!=0) {
                       System.out.println("Too high, try again "+ count + " Chances left");
                   }
               }
                   else if (guess < answer) {
                   if(count!=0) {
                       System.out.println("Too low, try again "+ count + " Chances left");
                   }
                   }
                   else {
                   System.out.println("Congrats, you guessed the number.");
                   Choice();
                   break;
               }
           }
           else{
               System.out.println("Sorry your chances over. Please retart the game!!!");
               Choice();
               break;

           }
           count--;
       }
   }
   public static void Choice(){
       System.out.println("Choose 1 to 'Restart' or Choose 2 'Exit'");
       Scanner sc=new Scanner(System.in);
       int st=sc.nextInt();
       count=2;
       switch (st){
           case 1:Start();
                 break;
           case 2: break;
       }
   }

    public static void main(String[] args) {
        Start();
        System.out.println("Thanks for Playing..........");
    }
}
