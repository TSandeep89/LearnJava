public class removewhitespace {

    public static void main(String[] args) {
        String str = "     thodeti sandeep     ";
        System.out.println(str.trim());
        String stg = "toshi        sandy";
        System.out.println(stg.replaceAll(" ", ""));
    }
}
