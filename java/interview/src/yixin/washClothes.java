package yixin;

import java.util.*;

/**
 * Created by xding on 2016/3/29.
 */
public class washClothes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArry = str.split(" ");

        int M = Integer.parseInt(strArry[0]);
        int N = Integer.parseInt(strArry[1]);

//        System.out.println("M:" + M + ";N:" + N);

        String[] clrArray = scan.nextLine().split(" ");
//        for(int i=0; i<clrArray.length; i++) {
//            System.out.print(clrArray[i] + " ");
//        }
        int time;
        int[] timeArray = new int[N];
        for(int i=0; i<N; i++) {
            strArry = scan.nextLine().split(" ");
            for(int j=0; j<M; j++) {
                if(strArry[1].equals(clrArray[j])) {
                    time = Integer.parseInt(strArry[0]);
                    if(time > timeArray[j]) {
                        timeArray[j] = time;
                    }
                }
            }
        }
        int totalTime = 0;
        for(int i=0; i<timeArray.length; i++) {
            totalTime += timeArray[i];
        }
        System.out.println(totalTime);

    }
}
