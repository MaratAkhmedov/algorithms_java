public class BubbleSort {
    /**
     * the method that sorts the array
     * @param array the array that will be sorted
     */
    public void sort(int[] array) {
        int first;
        int second;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                first = j;
                second = j + 1;
                if (array[first] > array[second]) {
                    swap(array, first, second);
                }
            }
        }
    }

    /**
     * swap 2 elements in the array
     * @param array the array where the elements will be swapped
     * @param first the first index of element that wil be swapped with the element that stay in the second index
     * @param second the second index of element that wil be swapped with the element that stay in the first index
     */
    private void swap(int[] array, int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
