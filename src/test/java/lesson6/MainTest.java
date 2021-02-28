package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int[] array = new int[]{4, 5, 7};
        int[] arr1 = new int[]{1, 2, 4, 8, 7, 9, 6, 5, 4, 5, 7};
        for (int i = 0; i < array.length; i++) {
            Assertions.assertEquals(array[i], Main.arrayDivide4(arr1)[i]);
        }
    }

    @Test
    public void test2() {
        int[] array = new int[]{2, 2};
        int[] arr1 = new int[]{1, 2, 4, 8, 7, 9, 6, 5, 2, 2};
        for (int i = 0; i < array.length; i++) {
            Assertions.assertEquals(array[i], Main.arrayDivide4(arr1)[i]);
        }
    }

    @Test
    public void test3() {
        int[] array = new int[]{2};
        int[] arr1 = new int[]{1, 2, 4, 5, 2};
        for (int i = 0; i < array.length; i++) {
            Assertions.assertEquals(array[i], Main.arrayDivide4(arr1)[i]);
        }
    }

    @Test
    public void throwRunntime() {
        int[] array = new int[]{4, 5, 7};
        int[] arr1 = new int[]{1, 2, 4};
        Assertions.assertThrows(RuntimeException.class, () -> {
            Assertions.assertEquals(array, Main.arrayDivide4(arr1));
        });
    }

    @Test
    public void includedTrue1() {
        int[] arr = new int[]{1, 2, 5, 2};
        Assumptions.assumeTrue(Main.included1or4(arr));
    }

    @Test
    public void includedTrue2() {
        int[] arr = new int[]{4, 5, 2};
        Assumptions.assumeTrue(Main.included1or4(arr));
    }

    @Test
    public void includedFalse1() {
        int[] arr = new int[]{ 5, 2};
        Assumptions.assumeFalse(Main.included1or4(arr));
    }

}