package testing_classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main obj = new Main();
    @Test
    void printPosValuesTest() {
        int[] arr = new int[] {1, 5, -8, -7, 6, 3, 4, -5};
        int[] arrTest = new int[] {1, 5, 6, 3, 4};

        assertArrayEquals(arrTest, obj.printPosValues(arr));
    }

    @Test
    void printBackwardsTest() {
        short[] arr = new short[] {1, 5, -8, -7, 6, 3, 4, -5};
        short[] resArr = new short[] {-5, 4, 3, 6, -7, -8, 5, 1};

        assertArrayEquals(resArr, obj.printBackwards(arr));
    }

    @Test
    void maxValue() {
        long[] arr = new long[]{1, 5, -8, -7, 6, 3, 4, -5};
        long max = 6;
        assertEquals(max, obj.printMaxValue(arr));
    }

    @Test
    void minValue() {
        float[] arr = new float[]{7.7f, 8.9f, -6.4f, 40.0f};
        float max = -6.4f;
        assertEquals(max, obj.printMinValue(arr));
    }

    @Test
    void copyArr() {
        int[] arr = new int[] {1, 5, -8, -7, 6, 3, 4, -5};
        assertArrayEquals(arr, obj.copyArray(arr));
    }

    @Test
    void addingSameIndexValueTest(){
        int[] arr = new int[]{32, 9, 3, 60};
        assertArrayEquals(arr, obj.addingSameIndexValues());
    }

    @Test
    void arrLength(){
        int count = 4;
        assertEquals(count, obj.countOfGivenValueInArray(5));
    }

    @Test
    void factTest(){
        int resFact = 40320;
        assertEquals(resFact, obj.fact(8));
    }

    @Test
    void nonRepeatedSublist (){
        int[][] arr = new int[][]{
                {1, 5, 6},
                {1, 5, 4},
                {1, 5, 3},
                {5, 6, 4},
                {5, 6, 3},
                {6, 4, 3}
        };

        assertArrayEquals(arr, obj.nonRepeatedSubList());

    }

    @Test
    void babbleSortTest() {
        int[] arr = new int[]{55, 1, 3, 4, 6};
        int[] sortedArr = new int[]{1, 3, 4, 6, 55};
        assertArrayEquals(sortedArr, obj.babbleSort(arr));
    }

    @Test
    void evenValuesToLastPositionTest() {
        int[] arr = new int[]{55, 1, 3, 4, 7, 9, 6};
        int[] resArr = new int[]{6, 4, 3, 1, 7, 9, 55};
        assertArrayEquals(resArr, obj.evenValuesToLastPosition(arr));
    }

    @Test
    void escapeZeroTest() {
        int[] arr = new int[]{5, 6, 0, 0, 4, 0, 9};
        int[] resArr = new int[]{5, 6, 4, 9};
        assertArrayEquals(resArr, obj.escapeZeroes(arr));
    }

    @Test
    void powTest() {
        int num = 5;
        int pow = 3;
        int res = 125;
        assertEquals(res, obj.pow(num, pow));
    }

    @Test
    void binaryToIntTest() {
        int[] arr = new int[]{1, 0, 1, 0, 1, 0};
        int res = 42;
        assertEquals(res, obj.binaryToInt(arr));
    }

    @Test
    void swapSymmetricTest() {
        int[][] arr = new int[][]{
                {1, 5, 3},
                {5, 3, 6},
                {7, 5, 3}
        };
        int[][] resArr = new int[][]{
                {1, 5, 7},
                {5, 3, 5},
                {3, 6, 3}
        };
        assertArrayEquals(resArr, obj.swapSymmetric(arr));
    }

    @Test
    void upperMainDiagonalTest() {
        int[][] arr = new int[][]{
                {1, 5, 3},
                {5, 3, 6},
                {7, 5, 3}
        };

        int[][] resArr = new int[][]{
                {5, 3},
                {6}
        };


        assertArrayEquals(resArr, obj.upperMainDiagonal(arr));
    }

    @Test
    void isEvenTest() {
        int[] arr = new int[]{55, 1, 3, 4, 7, 9, 6};
        boolean res = false;
        assertEquals(res, obj.isEven(arr));
    }

    @Test
    void sumOfMatrixRowsISEvenTest() {
        int[][] arr = new int[][]{
                {1, 5, 3},
                {5, 3, 6},
                {7, 5, 3}
        };
        boolean res = false;

        assertEquals(res, obj.sumOfMatrixRowsISEven(arr));
    }
}