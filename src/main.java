import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        /*boolean res = checkBrackets(
                "if(wdwqd) {" +
                        "while(true) { ;}" +
                        "})",
                "()");
        System.out.println(res);*/

      int[] array = {38,27, 43, 3, 9, 82, 10};
      //testQuickSort(array);
      //testBubbleSort(array);
        Result result = JUnitCore.runClasses(SortingTest.class);

        //for (Failure failure : result.getFailures()) {
        //    System.out.println(failure.toString());
        //}

        System.out.println("El resultado no tiene errores: " + result.wasSuccessful());
        MergeSort sorting = new MergeSort();
        sorting.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testBubbleSort(int[] array) {
        BubbleSort bubble = new BubbleSort();
        bubble.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testQuickSort(int[] array) {
        /**
         * test partition method of quicksort
         */
        //int[] array = {13, 17, 12, 25};
        QuickSort q = new QuickSort();
        /*
        System.out.println("Pivot: " + array[array.length - 1]);
        int divIndex = q.partition(array, 0, array.length - 1);
        System.out.println("Array resultante: " + Arrays.toString(array));
        System.out.print("los elementos < que pivot: " );
        for (int i = 0; i < divIndex; i++) {
            System.out.print("[" + array[i] + "]");
        }

        System.out.print("\nlos elementos > que pivot: " );
        for (int i = divIndex + 1; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("\nPosición de pivot: " + divIndex);*/


        System.out.println("Antes de sortear: " + Arrays.toString(array));
        q.sort(array);
        System.out.println("Despues de sortear: " + Arrays.toString(array));
    }

    /**
     * this method checks if the String contains brackets in the correct order
     * Example:
     * "if(true) {
     *     while(){
     *     }
     * }"
     * will returns true if we use checkBrackets("code", "[]")
     * @param text
     * @param brackets
     * @return true if brackets stays in the correct order
     */
    private static boolean checkBrackets(String text, String brackets) {
        char open = brackets.charAt(0);
        char close = brackets.charAt(1);
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if(counter < 0)
                return false;
            char current = text.charAt(i);
            if(current == open)
                counter++;
            else if(current == close)
                counter--;
        }
        if(counter == 0)
            return true;
        else
            return false;
    }
}
