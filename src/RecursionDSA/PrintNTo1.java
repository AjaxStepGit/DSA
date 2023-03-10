package RecursionDSA;

public class PrintNTo1 {

    public void print(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }

        System.out.println(N);
        print(N-1);

    }
    
}
