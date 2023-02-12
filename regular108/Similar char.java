import java.io.*;
import java.util.*;

public class Solution {
     static int countOccur(int n,String s){
         char ch = s.charAt(n-1);
         int c=0;
         for(int i=0;i<n-1;i++){
             if(s.charAt(i)== ch){
                 c+=1;
             }
         }
         return c;
     }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        String st = s.next();
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n1 = s.nextInt();
            System.out.println(countOccur(n1,st));
        }
        
    }
}
