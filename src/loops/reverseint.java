package loops;

public class reverseint {

    public static void main(String[] args) {

        long num = 123456789;
        long rev = 0;

        while(num !=0)
        {
            rev = rev * 10 + num % 10;
            num = num/ 10;
        }
        System.out.println("the reverse of number is " + rev);
    }
}
