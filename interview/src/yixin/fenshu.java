package yixin;

import java.util.Scanner;

/**
 * Created by xding on 2016/3/29.
 */
public class fenshu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArry;
        int num = Integer.parseInt(scan.nextLine());

        for(int i=0; i<num; i++) {
            strArry = scan.nextLine().split(" ");
            int n = Integer.parseInt(strArry[0]);
            int m = Integer.parseInt(strArry[1]);
            System.out.print(group(n, m));
        }
    }

    public static int group(int n, int m) {
        if(n<1 || m<1) {
            return 0;
        } else if(n==1 || m==1) {
            return 1;
        } else if(n < m) {
            return group(n, n);
        } else if(n == m) {
            return group(n, m-1) + 1;
        } else {
            return group(n, m-1) + group(n-m, m);
        }
    }
}
