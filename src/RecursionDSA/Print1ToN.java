package RecursionDSA;

public class Print1ToN {


    public void print(int N){

        if(N == 1){
            System.out.println(N+" ");
            return;
        }

        print(N - 1);
        System.out.println(N + " ");
    }
    
}
