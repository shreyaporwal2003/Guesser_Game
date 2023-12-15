package GusserGameProject;
import java.util.*;


class Guesser{
    int Guessernum;
    public int takeNumberGuesser(){
        System.out.println("Guesser guess a Number: ");
        Scanner sc= new Scanner(System.in);
        Guessernum=sc.nextInt();
        return Guessernum;

    }
}
class Player{
    int Playernum;
    public int takeNumberPlayer(){
        System.out.println("Player guess a Number:");
        Scanner sc= new Scanner(System.in);
        Playernum=sc.nextInt();
        return Playernum;

    }
}
class Umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;
    void collectfromGuesser(){
        Guesser g=new Guesser();
        numberFromGuesser=g.takeNumberGuesser();

    }
    void collectfromPlayer(){
        Player P1=new Player();
        numberFromPlayer1=P1.takeNumberPlayer();
        Player P2=new Player();
        numberFromPlayer2=P2.takeNumberPlayer();
        Player P3=new Player();
        numberFromPlayer3=P3.takeNumberPlayer();
    }
    void compare(){
        if(numberFromPlayer1==numberFromGuesser){
            if(numberFromPlayer2==numberFromGuesser && numberFromPlayer3==numberFromGuesser){
                System.out.println("All Players won the game.");
            }
            else if(numberFromPlayer2==numberFromGuesser){
                System.out.println("Player 1 and Player 2 won the game.");
            }
            else if(numberFromPlayer3==numberFromGuesser){
                System.out.println("Player 1  won 3 the game.");
            }
            else{
                System.out.println("Only player 1 won the game.");
            }
            

        }
            
            
        else if (numberFromPlayer2==numberFromGuesser){
            if(numberFromPlayer3==numberFromGuesser){
                System.out.println("Only player 2 and 3 won the game.");
            }
            else{
                System.out.println("Only Player 2 won the game.");
            }

        }
        else if(numberFromPlayer3==numberFromGuesser){
            System.out.println("Player 3 won the game.");
        }
        else{
            System.out.println("No one won the game.");
        }
    }
        

}
public class GusserGame{
    public static void main(String[] args) {
        Umpire U=new Umpire();
        U.collectfromGuesser();
        U.collectfromPlayer();
        U.compare();

    }
}

