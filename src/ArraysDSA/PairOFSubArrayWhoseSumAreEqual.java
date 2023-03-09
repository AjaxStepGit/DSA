package ArraysDSA;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class PairOFSubArrayWhoseSumAreEqual {

    public ArrayList<Integer[]> getPairs(int[] arr, int N){
        ArrayList<Integer[]> pairList = new ArrayList<>();
        Hashtable<Integer, ArrayList<Integer>> hTable = new Hashtable<>();
        hTable = getSumOfAllSubArray(arr, 0, 0, hTable);
        Set<Integer> set = hTable.keySet();
        //Problem is How to print Pair because if the sum of two sub arrays are equal there will be overriden in hash table
        return pairList;
    }


    public Hashtable<Integer, ArrayList<Integer>> getSumOfAllSubArray(int[] arr, int start, int end, Hashtable<Integer, ArrayList<Integer>> hTable){
        Integer sum = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        if(end == arr.length){
            return hTable;
        }

        if(start > end){
            getSumOfAllSubArray(arr, 0, end+1, hTable);   //[1, 2, 3]
        }else{
            System.out.println();
            for(int i = start; i < end; i++){
                sum += arr[i];
                resultList.add(arr[i]);
            }
            sum += arr[end];
            resultList.add(arr[end]);
            hTable.put(sum, resultList);
            getSumOfAllSubArray(arr, start+1, end, hTable);
        }
            
        return hTable;
    }
    
}
