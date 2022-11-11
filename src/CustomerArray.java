public class CustomerArray {
    public static void main(String[] args) {

        int[] array = {2, 5, 758, -78, 68, -123, 4};

        int min = array[0];
        int max = array[0];
        int sum = array[0];
        int arif = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
            sum += array[i];
            arif = sum / array.length;
        }
        System.out.print("Непарні значення ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Мінімальне значення " + min + "\n" +
                "Максимальне значення " + max + "\n" +
                "Сума всіх елементів " + sum + "\n" +
                "Середнє арифметичне " + arif + "\n");
    }
}