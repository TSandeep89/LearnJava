package loops;

public class Stringlen {

    public static void main(String[] args) {

        int age[] = {56, 28, 66, 35, 47, 18};
        int len  = age.length;
        System.out.println(len);

        for (int i = len-1; i>=0; i--)
        {
            System.out.println(i);
        }


    }
}
