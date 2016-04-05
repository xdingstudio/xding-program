package yixin;
import java.util.*;

/**
 * Created by xding on 2016/3/29.
 */
public class reverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i=0; i<n; i++) {
            String str = scan.nextLine();
            String[] strArray = str.split(" ");
            for(int j=strArray.length-1; j>=0; j--) {
                System.out.print(strArray[j]);
                if(j != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("\n");
                }
            }
        }

//        System.out.print(n);
    }
}
