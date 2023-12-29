package loops;

public class DuplicateNum {

    public static void main(String[] args) {

        int num[] = {1,1,2,2,3,3, 5, 6, 6, 7, 7, 8};

        for( int i = 0; i< num.length; i++)
        {
            for( int j= i+1; j< num.length; j++)
            {
                if(num[i]==num[j])
                {
                    System.out.println("Duplicate number is " + num[j]);
                    break;
                }
            }
        }


    }
}
