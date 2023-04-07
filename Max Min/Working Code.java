import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int n=arr.size();
        int sol=0;
        int min=100000000;
        if(n==k)
        {
         sol= arr.get(n-1)-arr.get(0); 
         return sol;
        }
        else
        {
           for(int i=0;i<=n-k;i++)
           {
              int a=i+(k-1);
              sol=arr.get(a)-arr.get(i);
              if(sol<=min)
              {
                min=sol;  
              }
           }
           return min;
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
