import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    static int count=2;
    static boolean correct = false;

    public static void Start(){
       int guess;
       Scanner sc=new Scanner(System.in);
       Random rand = new Random();
       int answer = rand.nextInt(100) + 1;
       System.out.println(answer);
       System.out.println("--------------------WELCOME TO NUMBER GUESS GAME-----------------");
       System.out.println("Guess a number between 1 to 100: ");
       while (!correct) {
           if(count>-1){
               guess = sc.nextInt();

               if (guess > answer) {
                   if(count!=0) {
                       System.out.println("Too high, try again "+ count + " Chances left");
                   }}
                   else if (guess < answer) {
                   if(count!=0) {
                       System.out.println("Too low, try again "+ count + " Chances left");
                   } } else {
                   System.out.println("Congrats, you guessed the number.");
                   Choice();
                   return;
               }}
           else{
               System.out.println("Sorry your chances over. Please retart the game!!!");
               Choice();
               return;

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
                 return;
           case 2: return;
       }
       return;
   }

    public static void main(String[] args) {
        Start();
        System.out.println("Thanks for Playing..........");
    }
}
