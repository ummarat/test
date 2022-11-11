public class ThreeArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array2 = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        int[][] array3 = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array3[i][j] = array[i][j] + array2[i][j];
            }
        }

        for (int[] s : array3) {
            for (int j : s) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
