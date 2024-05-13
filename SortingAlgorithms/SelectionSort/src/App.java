public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] array = { 3, 12, 4, 6, 23, 87, 23, 44, 11, 1 };
        array = SelectionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}