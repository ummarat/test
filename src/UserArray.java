import java.util.Scanner;

public class UserArray {
        static void incArray(int[] array) {
        int[] copy = new int[array.length + 1];
        for (int i = 0; i < copy.length - 1; i++) {
            copy[i] = array[i];
        }
        array = copy;
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    static void nArray(int[] array, int value) {
        int[] narr = new int[array.length + 1];
        narr[0] = value;
        for (int i = 1; i <= narr.length - 1; i++) {
            narr[i] = array[i - 1];
        }
        for (int a : narr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву ");
        int count = sc.nextInt();
        int[] array = new int[count];
        System.out.println("Заповніть масив значеннями:");
        for (int i = 0; i < count; i++) {
            System.out.println("Введіть число ");
            array[i] = sc.nextInt();
        }
        incArray(array);
        System.out.println("");
        nArray(array, 9);
    }
}
