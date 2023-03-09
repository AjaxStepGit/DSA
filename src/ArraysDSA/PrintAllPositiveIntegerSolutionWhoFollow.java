package ArraysDSA;

import java.util.ArrayList;
import java.util.Hashtable;

// : Print all positive integer solutions to the equation a3 + b3 = c3 + d3
//  where a, b, c, 
// and d are integers between 1 and 1000.

public class PrintAllPositiveIntegerSolutionWhoFollow {
    

    //BruteForce Approach

    public ArrayList<Integer[]> getPairs(int[] a, int[] b, int[] c, int[] d){
        System.out.println("O(N^3) Approach");
        ArrayList<Integer[]> pairList = new ArrayList<>();

        for(int e1 : a){
            for(int e2 : b){
                for(int e3 : c){
                    for(int e4 : d){
                        if(Math.pow(Double.valueOf(e1), 3) + Math.pow(Double.valueOf(e2), 3) == Math.pow(Double.valueOf(e3), 3) + Math.pow(Double.valueOf(e4), 3)){
                            pairList.add(new Integer[]{e1, e2, e3, e4});
                            break;                            
                        }
                    }
                }
            }
        }

        return pairList;
    }


    //O(N^2) Approach
    public ArrayList<Integer[]> getPair(int[] a, int[] b, int[] c, int[] d){
        System.out.println("O(N^2) Approach");
        ArrayList<Integer[]> pairList = new ArrayList<>();
        Hashtable<Integer, Integer[]> hTable = new Hashtable<>();
        for(int e1 : c){
            for(int e2 : d){
                Integer sum = (int)(Math.pow(Double.valueOf(e1), 3)+Math.pow(Double.valueOf(e2), 3));
                hTable.put(sum, new Integer[]{e1, e2});
            }
        }


        for(int e1 : a){
            for(int e2 : b){
                Integer sum = (int)(Math.pow(e1, 3)+Math.pow(e2, 3));
                if(hTable.containsKey(sum)){
                    Integer e3 = hTable.get(sum)[0];
                    Integer e4 = hTable.get(sum)[1];
                    pairList.add(new Integer[]{e1, e2, e3, e4});
                    break;
                }
            }
        }
        
        return pairList;
    }
}


//Static void main Function

// int[] a = {2, 171, 551, 289, 353};
//         int[] b = {463, 4, 214, 524, 549};
//         int[] c = {971, 386, 4, 706, 507};
//         int[] d = {861, 368, 210, 587, 2};

//         PrintAllPositiveIntegerSolutionWhoFollow p = new PrintAllPositiveIntegerSolutionWhoFollow();
//         ArrayList<Integer[]> pairList = p.getPairs(a, b, c, d);
//         if(pairList.isEmpty()){
//             System.out.println("No Such Element present");
//             return;
//         }
//         for(Integer[] pair : pairList){
//             System.out.println(Arrays.toString(pair));
//         }

//         for(Integer[] pair : p.getPair(a, b, c, d)){
//             System.out.println(Arrays.toString(pair));
//         }
