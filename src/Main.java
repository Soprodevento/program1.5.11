import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 7, 5};
        int[] secondArray = {8, 4, 2, 22};
        int[] mergedArray = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(mergedArray));

    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
