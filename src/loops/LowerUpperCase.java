package loops;

public class LowerUpperCase {

    public static void main(String[] args) {
        int count = 0;
        String str = "Welcome to Automation";
//        String lowercase = str.toLowerCase();
//        String Uppercase = str.toUpperCase();
//        System.out.println(lowercase);
//        System.out.println(Uppercase);
        int len = str.length();
        System.out.println(len);

        for(int i = 0; i<= len; i++)
        {
            int s = str.charAt(i);
            if(Character.isUpperCase(s))
                count++;
        }
        System.out.println("the upeer case is " + count);
    }

}
