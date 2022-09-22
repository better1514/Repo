import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] white = {1, 1, 2, 2, 2, 8}; //new Scanner(System.in).next()
        Scanner sc = new Scanner(System.in);
        int piece=0;
        int result[]=new int[6];

        for (int i = 0; i < white.length; i++) {
            piece=sc.nextInt();
            white[i] -= piece;
            System.out.println(white[i]);
        }
    }
}