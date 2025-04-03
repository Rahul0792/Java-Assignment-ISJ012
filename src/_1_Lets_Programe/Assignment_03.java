package _1_Lets_Programe;

public class Assignment_03 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i -= 2) {
            for (int k = 5; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i += 2) {
            if (i == 1)
                continue;


            for (int k = 5; k > i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
