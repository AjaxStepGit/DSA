package ArraysDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

// : Given an array of distinct integer values, count the number of pairs of integers that 
// have difference k. For example, given the array {1 , 7, 5, 9, 2, 12, 3} and the difference 
// k = 2, there are four pairs with difference 2: (1 , 3) j (3 , S), (5 , 7), (7 , 9),

public class NumberOfPairThatHaveDifferenceK{
    

    //ON^2 Approach
    public ArrayList<Integer[]> getPairs(int[] arr, int N, int K){
        System.out.println("Through N^2 Approach");
        ArrayList<Integer[]> pairList = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if((Math.abs(arr[i] - arr[j])) == K){
                    pairList.add(new Integer[] {arr[i], arr[j]});
                }
            }
        }
        return pairList;
    }


    //O NLogN Approach

    public ArrayList<Integer[]> getPair(int[] arr, int N, int K){
        System.out.println("Through NLogN Approach");
        ArrayList<Integer[]> pairList = new ArrayList<>();
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr){
            set.add(e);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);

        Integer found = 0;

        for(int i = 0; i < uniqueArray.length; i++){
            Integer searchElement = uniqueArray[i]+K;

            found = Arrays.binarySearch(uniqueArray, searchElement);
            if(found > -1){
                pairList.add(new Integer[]{uniqueArray[i], searchElement});
            }
            
        }

        return pairList;
    }


    //O (N) Approach

    public ArrayList<Integer[]> getPaires(int[] arr, int N, int K){
        System.out.println("Through O(N) Approach");
        ArrayList<Integer[]> pairList = new ArrayList<>();
        Hashtable<Integer, Integer> hTable = new Hashtable<>(); 
        for(int e : arr){
            hTable.put(e, e);
        }

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += (arr[i] + K);

            if(hTable.containsKey(sum)){
                pairList.add(new Integer[]{arr[i], sum});
            }

            sum = 0;
        }

        return pairList;
    }
    

    
}

// PUT THIS IN MAIN FUNCTION TO RUN & CHECK

// NumberOfPairThatHaveDifferenceK num = new NumberOfPairThatHaveDifferenceK();
// int[] arr = {1, 7, 5, 9, 2, 12, 3};
// for(Integer[] pair : num.getPairs(arr, arr.length, 2)){
//     System.out.println(Arrays.toString(pair));
// }

// for(Integer[] pair : num.getPair(arr, arr.length, 2)){
//     System.out.println(Arrays.toString(pair));
// }

// for(Integer[] pair : num.getPaires(arr, arr.length, 2)){
//     System.out.println(Arrays.toString(pair));
// }