public class Main {

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        insertionSort(list);
        for (double value : list) {
            System.out.print(value + "  ");
        }
    }

    public static void insertionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double value = list[i];
            int pos = i;
            while (pos > 0 && value < list[pos-1]) {
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = value;
        }
    }
}