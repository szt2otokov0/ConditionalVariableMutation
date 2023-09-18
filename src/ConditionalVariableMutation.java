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

        int credits;
        boolean isBonus;
        int output3 = 0;
        do {
            credits = scn.nextInt();
            isBonus = scn.nextBoolean();
        } while (credits < 0 || credits > 100);
        if(credits >= 50 && !isBonus) output3 +=3;
        else if (!isBonus) output3 -= 1;
        System.out.println(output3);

        int d;
        int time;
        do {
            d = scn.nextInt();
            time = scn.nextInt();
        } while ((d < 0 || d > 50) || (time < 0 || time > 500));
        if(d % 4 == 0 && time <= 200) System.out.println("check!");
        else if(time > 200) System.out.println("Time out!");
        else System.out.println("Run forest run!");
    }
}