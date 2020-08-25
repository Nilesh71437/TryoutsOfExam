import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayUsingJava8 {

    public static void main(String[] args) {

        int[] arr1 = new int[] {7,-5,3,8,-4,11,-19,21};
        int[] arr2 = new int[] {6,13,-7,0,11,-4,3,-5};

        int[] mergedArray = mergeArrayRemDup(arr1, arr2);
        System.out.println(" First Array :: "+ Arrays.toString(arr1));
        System.out.println(" Second Array :: "+Arrays.toString(arr2));
        System.out.println(" Merged Array :: "+Arrays.toString(mergedArray));
    }

    private static int[] mergeArrayRemDup(int[] arr1, int[] arr2) {
    int [] mergedArray = IntStream.concat(IntStream.of(arr1),IntStream.of(arr2)).distinct().sorted().toArray();

    return  mergedArray;

    }
}
