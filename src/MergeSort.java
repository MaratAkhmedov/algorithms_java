/**
 * Before Java 7 mergeSort was used for Object arrays
 * Generally, QuickSort is faster but mergeSort is Stable so, this algorithm is better with object arrays and
 * QuickSort is better for primitive Arrays (becouse QuickSort is not stable)
 * After Java 7, Java uses Dual-PivotQuickSort for primitive Arrays (this algorithm has n*log(n) efficiency)
 *                         and Tim
 */
public class MergeSort {

    /**
     * public sort method
     * @param array the array that will be sorted
     */
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * the recursive mergeSort method
     * efficiency: n * log(n)
     * @param array
     * @param left
     * @param right
     */
    private void sort(int[] array, int left, int right) {
        int middle = (left + right) / 2;

        if(right > left) {
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    /**
     * method that merges 2 ordered parts of array in 1 ordered array
     * @param array the initial array
     * @param left  the start index of the left subarray
     * @param middle  the final index of the left array
     * @param right the final index of the right subarray
     */
    private void merge(int array[], int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int sizeLeft = middle - left + 1; // <=
        int sizeRight = right - middle;   // >

        /* Create temp arrays */
        int[] leftArray = new int [sizeLeft];
        int[] rightArray = new int [sizeRight];

        /*Copy data to temp arrays*/
        for (int i=0; i < sizeLeft; ++i)
            leftArray[i] = array[left + i];
        for (int j=0; j < sizeRight; ++j)
            rightArray[j] = array[middle + 1 + j];


        mergeTempArrays(array, leftArray, rightArray, left);
    }

    /**
     *  Merge the temp arrays
     * @param array the initial array
     * @param leftArray left subarray
     * @param rightArray right subarray
     * @param firstPosition   Initial index of merged subarray in the array
     */
    private void mergeTempArrays(int[] array, int[] leftArray, int[] rightArray, int firstPosition) {

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = firstPosition;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i++];
            }
            else {
                array[k] = rightArray[j++];
            }
            k++;
        }

        /* Copy remaining elements of leftArray[] if those elements exist */
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        /* Copy remaining elements of rightArray[] if those elements exist*/
        while (j < rightArray.length)
        {
            array[k++] = rightArray[j++];
        }
    }
}
