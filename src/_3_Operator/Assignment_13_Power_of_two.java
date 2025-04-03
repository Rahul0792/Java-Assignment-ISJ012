package _3_Operator;
public class Assignment_13_Power_of_two {
    public static void main(String[] args) {
        int number = 5;

        boolean flag = true;
        if(number<=0){
            flag = false;
        }

        if ((number & (number - 1)) == 0){
            flag = true;
        }
        else{
            flag = false;
        }

        if (flag) {
            System.out.println("Power of two ");
        }
        else{
            System.out.println("Not Power of two ");
        }

    }
}
