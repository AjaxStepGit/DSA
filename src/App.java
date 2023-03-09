import StringsDSA.CheckPermutation;
import StringsDSA.CheckUniqueStringWithoutDS;

public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "abdc";
        String s2 = "abcd";
        CheckPermutation chk = new CheckPermutation();
        if(chk.checkPermutation(s1, s2, s1.length())){
            System.out.println("Strings are in permutation");
        }else{
            System.out.println("Strings are not in permutation");
        }
    }
}
