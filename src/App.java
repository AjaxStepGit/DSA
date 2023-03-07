import java.util.Arrays;

import ArraysDSA.NumberOfPairThatHaveDifferenceK;

public class App {
    public static void main(String[] args) throws Exception {
        NumberOfPairThatHaveDifferenceK num = new NumberOfPairThatHaveDifferenceK();
        int[] arr = {1, 7, 5, 9, 2, 12, 3};
        for(Integer[] pair : num.getPairs(arr, arr.length, 2)){
            System.out.println(Arrays.toString(pair));
        }

        for(Integer[] pair : num.getPair(arr, arr.length, 2)){
            System.out.println(Arrays.toString(pair));
        }

        for(Integer[] pair : num.getPaires(arr, arr.length, 2)){
            System.out.println(Arrays.toString(pair));
        }
    }
}
