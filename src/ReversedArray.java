import java.util.Scanner;

public class ReversedArray {
    static void myReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static int[] subArray(int[] array, int index, int count) {
        int[] ssArray = new int[count];

            for (int j = 0; j < count; j++) {
                if (index < array.length)
                    ssArray[j] = array[index];
                else if(ssArray[j] == 0)
                    ssArray[j] = 1;
                index++;
                System.out.print(ssArray[j] + " ");
                }
            return ssArray;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Заповніть масив значеннями:");
        for (int i = 0; i < count; i++) {
            System.out.println("Введіть число ");
            array[i] = scanner.nextInt();
        }

        myReverse(array);
        System.out.println("");
        subArray(array, 6, 10);
    }
}
