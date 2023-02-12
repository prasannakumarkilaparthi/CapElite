import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int n=str.length(),i=0,j=n-1;
        while(i<j)
        {
            while(!Character.isLetterOrDigit(arr[i]))
            {
                i++;
            }
            while(!Character.isLetterOrDigit(arr[j]))
            {
                j--;
            }
            if(i<j)
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
        
    }
}
