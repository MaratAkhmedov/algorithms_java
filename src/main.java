import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SortingTest.class);

        //for (Failure failure : result.getFailures()) {
        //    System.out.println(failure.toString());
        //}

        System.out.println("El resultado no tiene errores: " + result.wasSuccessful());
    }
}
