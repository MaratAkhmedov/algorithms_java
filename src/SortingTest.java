import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SortingTest {
    static List<int[]> list;

    /**
     * @Before executes before every @test
     * @BeforeClass only is executed at the start (method should be static)
     */
    @Before
    public void init() {
        list = new ArrayList<>();
        list.add(new int[]{1, 2, 3, 4, 5, 6, 25, 30, 40, 55, 70, 100});
        list.add(new int []{1, 7, 2, 4, 6, 16, 25, 3, 17, 1, 23, 75});
        list.add(new int[]{1});
        list.add(new int[]{});
        System.out.println("Arrays initialized");
    }

    @Test
    public void quickSortUnitTest() {
        System.out.println("Test QuickSort\n");
        List<int[]> copy1 = new ArrayList<>(list);

        QuickSort s = new QuickSort();
        for (int i = 0; i < copy1.size(); i++) {
            System.out.println("Unsorted array number " + (i+1) + ": " + Arrays.toString(copy1.get(i)));
            s.sort(copy1.get(i));
            Arrays.sort(list.get(i));
            assertEquals(copy1.get(i), list.get(i));
            System.out.println("Sorted array number " + (i+1) + ": " + Arrays.toString(copy1.get(i)));
            System.out.println("Array number " + (i+1) + " is correct\n");
        }
    }

    @Test
    public void bubbleSortUnitTest() {
        System.out.println("Test BubbleSort\n");
        List<int[]> copy1 = new ArrayList<>(list);

        BubbleSort s = new BubbleSort();
        for (int i = 0; i < copy1.size(); i++) {
            System.out.println("Unsorted array number " + (i + 1) + ": " + Arrays.toString(copy1.get(i)));
            s.sort(copy1.get(i));
            Arrays.sort(list.get(i));
            assertEquals(copy1.get(i), list.get(i));
            System.out.println("Sorted array number " + (i + 1) + ": " + Arrays.toString(copy1.get(i)));
            System.out.println("Array number " + (i + 1) + " is correct\n");
        }
    }

    @Test
    public void mergeSortUnitTest() {
        System.out.println("Test MergeSort\n");
        List<int[]> copy1 = new ArrayList<>(list);

        MergeSort s = new MergeSort();
        for (int i = 0; i < copy1.size(); i++) {
            System.out.println("Unsorted array number " + (i + 1) + ": " + Arrays.toString(copy1.get(i)));
            s.sort(copy1.get(i));
            Arrays.sort(list.get(i));
            assertEquals(copy1.get(i), list.get(i));
            System.out.println("Sorted array number " + (i + 1) + ": " + Arrays.toString(copy1.get(i)));
            System.out.println("Array number " + (i + 1) + " is correct\n");
        }
    }




    /**
     * @After executes after every @test
     * @AfterClass only is executed at the finish (method should be static)
     */
    @After
    public void finish() {
        list.clear();
        System.out.println("Unit test number 1 has finished\n");
    }
}
