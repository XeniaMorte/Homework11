public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("\n Сумма в конце месяца: " + sum);
        System.out.println(" Максимальное значение: " + max);
        System.out.println(" Минимальное значение: " + min);
        System.out.println(" Среднее значение " + sum / arr.length);

        //задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        int over = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length; i++) {
            fullName[i] = reverseFullName[over - i];
            System.out.print(fullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}