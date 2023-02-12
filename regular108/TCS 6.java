import java.io.*;
import java.util.*;
 



public class Solution {
    static int fib(int n)
{
    if (n==0||n==1)
        return 0;
    else if(n==2)
        return 1;
    return fib(n - 1) + fib(n - 2);
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0){
            System.out.println(fib(n/2+1));
            
        }
        else{
            System.out.println(n);
        }
        
    }
}
