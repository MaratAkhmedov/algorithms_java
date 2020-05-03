public class QuickSort {
    /**
     * the public quickSort method
     * @param array
     */
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * private recursive (divide and conquer) quicksort method
     * efficiency:
     *              best case: n * log(n) --> the value of the pivot is always middle element
     *              worst case: n * n --> array sorted descending or ascending
     * @param array the array that this method will sort
     * @param firstIndex
     * @param lastIndex
     */
    private void sort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex)
        {
            int divIndex = partition(array, firstIndex, lastIndex);

            // Recursively sort elements before
            // partition and after partition
            sort(array, firstIndex, divIndex-1);
            sort(array, divIndex+1, lastIndex);
        }
    }

    /**
     * this method takes the array and divide this array in 2 partitions where all elements
     * at the left of returned number are <= of pivot (pivot always is the last number)
     * and all elements at the right of this element are bigger when this number
     * @param array the array that will be divided in 2 partitions
     * @param firstIndex first index of the array
     * @param lastIndex == pivot, this is the last index of the array
     * @return
     */
    public int partition(int[] array, int firstIndex, int lastIndex) {
        int pivot = array[lastIndex];
        int i = firstIndex; // index of smaller element
        for (int j=firstIndex; j<lastIndex; j++)
        {
            // If current element is smaller than the pivot
            if (array[j] < pivot)
            {
                // swap arr[i] and arr[j]
                swap(array,i++,j);

            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
       swap(array, i, lastIndex);

        return i;
    }


    /**
     * swap firstIndex and lastIndex in the array passed as parameter
     * @param array
     * @param firstIndex
     * @param lastIndex
     */
    private void swap(int[] array, int firstIndex, int lastIndex) {
        int swap = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = swap;
    }
}
