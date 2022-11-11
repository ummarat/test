public class ConcatArray {
    //  ЦЕ ЗАВДАННЯ НЕ ВХОДИТЬ ДО ДОМАШНЬОГО ЗАВДАННЯ!!!
    // Я спочатку подумала, що треба з'єднати два масиви в один, а не додавати значення.
    // Потім зробила додавання знчень двох масивів в класі ThreeArray
    // Але це залишила для себе
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

        int[][] array3 = new int[array.length + array2.length][array.length + array2.length];

        int index = 0;
        //перенесення до array3 значень array
        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
            index++; //рахує індекси
        }
        //виведення значень двомірного масиву
        for (int[] a : array) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //перенесення до array3 значень array2
        for (int j = 0; j < array2.length; j++) {
            array3[index++] = array2[j];
        }

        for (int[] a : array2) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int[] s : array3) {
            for (int j : s) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
