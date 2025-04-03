package _3_Operator;

public class Assignment_12_Perfect_Square_Or_No {
    public static void main(String[] args) {
        int num = 4;
        double isSquare = Math.sqrt(num);

        if(isSquare * isSquare == num){
            System.out.println("Perfct square ");
        }
        else{
            System.out.println("Not Perfect Square ");
        }
    }
}
