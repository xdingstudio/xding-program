package data_structure;

public class SearchDoubleArray {

    public static void main(String[] args) {
	// write your code here
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        Find(array, 10);

    }

    // 未做异常输入处理
    public static boolean Find(int[][] array, int target) {
        int row = 0;
        int col = array[0].length - 1;
        boolean found = false;

        while(row < array.length && col >= 0) {
            if(array[row][col] > target) {
                col--;
            } else if(array[row][col] < target) {
                row++;
            } else if(array[row][col] == target) {
                found = true; // 统一输出处理
                break;
            }
        }

        System.out.print(found);
        return found;
    }
}
