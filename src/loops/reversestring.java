package loops;

public class reversestring {

    public static void main(String[] args) {
//
//        String str = "Sandeep";
//        int len = str.length();
//        System.out.println(len);
//        String rev= "";
//
//        for (int i=len-1; i>=0; i--)
//        {
//            rev= rev + str.charAt(i);
//
//        }
//        System.out.println(rev);

        String str = "Sandeep";
        int len = str.length();
        System.out.println("the lenght of String is : " + len );
        String rev  = "";

        for (int i = len-1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

    }


}
