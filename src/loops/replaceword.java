package loops;

public class replaceword {

    public static void main(String[] args) {

        String str = "^&^&^&@###My name is Sandeep*&*((&(*(*26482687216321^";
        String s = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);
    }
}
