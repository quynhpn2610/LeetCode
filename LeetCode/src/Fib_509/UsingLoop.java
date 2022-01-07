package Fib_509;

public class UsingLoop {
    public int fib(int n) {
        // base case
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int first = 0;
        int second = 1;
        int fibAtCount = 0;
        int count = 2;

        while (count <= n){
            fibAtCount = first + second;
            first = second;
            second = fibAtCount;
            count ++;
        }
        return fibAtCount;
    }
}
