public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 3, 1, 2, 41, 9, 5, 13 };
        InsertionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
