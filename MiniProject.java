import java.util.Scanner;

public class MiniProject {
    static void main(String[] args) {
        int myNum = (int)(Math.random()*100);
        int num = -1;
        System.out.println("Guess Number Between 1-100:");
        do {
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if(myNum==num){
                System.out.println("Congratulation! You Guess Correct Number.");
                break;
            } else if (myNum > num) {
                System.out.println("Try Guess Larger Number Or Enter -1 to Quit.");
            }else{
                System.out.println("Try Guess Smaller Number Or Enter -1 to Quit.");
            }
        } while (num>=0);
    }
}
