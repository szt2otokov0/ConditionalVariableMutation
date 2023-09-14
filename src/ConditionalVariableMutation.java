import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int a = scn.nextInt();
        if(a % 2 == 0) System.out.println(a+1);

        int b;
        do{
            b = scn.nextInt();
        } while (b < 0 || b > 30 );

        if(b > 10 && b < 20) System.out.println("Sweet!");
        else if(b < 10) System.out.println("Less!");
        else System.out.println("More!");

        int c;
        boolean isBonus;
        do {
            c = scn.nextInt();
            isBonus = scn.nextBoolean();
        } while (c < 0 || c > 100);
    }
}