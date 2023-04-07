import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int minimumNumber(int n, String password) {
            
        int sol=0;
        int count=0; 
       if(password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("(")||password.contains(")")||password.contains("-")||password.contains("+"))
      {
          count++;      
      }
      if(password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9"))
     {
           count++;
     }
     if(password.contains("a")||password.contains("b")||password.contains("c")||password.contains("d")||password.contains("e")||password.contains("f")||password.contains("g")||password.contains("h")||password.contains("i")||password.contains("j")||password.contains("k")||password.contains("l")||password.contains("m")||password.contains("n")||password.contains("o")||password.contains("p")||password.contains("q")||password.contains("r")||password.contains("s")||password.contains("t")||password.contains("u")||password.contains("v")||password.contains("w")||password.contains("x")||password.contains("y")||password.contains("z"))
     {
        count++; 
     }
     if(password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z"))
     {
         count++;
     }
     if(count==4&&n>=6)
     {
       sol=0;  
     }
     if(count<4&&n>=6)
     {
        sol=4-count;
     }
     if(count==4&&n<6)
     {
         sol=6-n;
     }
     if(count<4&&n<6)
     {
         if((4-count)<=(6-n))
         {
            sol=6-n; 
         }
         else
         {
             int x=4-count;
             int y=6-n;
             int z=x-y;
             sol=y+z;
         }
     }
     return sol;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
