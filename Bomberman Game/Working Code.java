import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static List<String> bomberMan(int n, List<String> grid) {
        int i=0,lim=0;
        ArrayList<String> sol=new ArrayList<String>();
        if(n%2==0)
        {
            for(String s:grid)
            {
                String a="";
                a=s.replaceAll(".","O"); 
                sol.add(a);
            }
        }
        else if(n%3==1&&n/3==0)
        {
            for(String s:grid)
            {
                sol.add(s);
            }
        }
        else
        {
         //int j=0;
         String ch=grid.get(0);
         char arr[][]=new char[grid.size()][ch.length()];
         int x=0,y=0;
         for(x=0;x<grid.size();x++)
         {
             String row=grid.get(x);
             for(y=0;y<ch.length();y++)
             {
                 arr[x][y]=row.charAt(y);
             }
         } 
        if((n/2)%2==0)
        {
            lim=2;
        }
        else
        {
            lim=1;
        }
         while(i<lim)
         {
           for(int j=0;j<x;j++)
           {
            if(x==1&&y==1)
            {
                arr[0][0]=',';
            }
            else if(x==1)
            {
                for(int k=0;k<y;k++)
                {
                    if(k==0)
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k+1]!='O')
                      {
                        arr[j][k+1]=',';
                      }
                     }
                    }
                    else if(k==y-1)
                    {
                     if(arr[j][k]=='O')
                     {
                      
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                     }
                    }
                    else
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j][k+1]!='O')
                      {
                       arr[j][k+1]=',';
                      }
                     }
                    }
                }
            }
            else if(y==1)
            {
                    if(j==0)
                    {
                     if(arr[j][0]=='O')
                     {
                      arr[j][0]=',';
                      if(arr[j+1][0]!='O')
                      {
                       arr[j+1][0]=',';
                      }
                     }
                    }
                    else if(j==x-1)
                    {
                     if(arr[j][0]=='O')
                     {
                      
                      arr[j][0]=',';
                      if(arr[j-1][0]!='O')
                      {
                       arr[j-1][0]=',';
                      }
                     }
                    }
                    else
                    {
                     if(arr[j][0]=='O')
                     {
                      arr[j][0]=',';
                      if(arr[j-1][0]!='O')
                      {
                       arr[j-1][0]=',';
                      }
                      if(arr[j+1][0]!='O')
                      {
                       arr[j+1][0]=',';
                      }
                     }
                    } 
            }     
            else{
             if(j==0)
             {
                for(int k=0;k<y;k++)
                {
                    if(k==0)
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k+1]!='O')
                      {
                        arr[j][k+1]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=',';
                      }
                     }
                    }
                    else if(k==y-1)
                    {
                     if(arr[j][k]=='O')
                     {
                      
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=',';
                      }
                     }
                    }
                    else
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j][k+1]!='O')
                      {
                       arr[j][k+1]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=',';
                      }
                     }
                    }
                }
                
            }
            else if(j==x-1)
            {
                
                for(int k=0;k<y;k++)
                {
                    if(k==0)
                    {
                     if(arr[j][k]=='O')
                     {
                       arr[j][k]=',';
                       if(arr[j][k+1]!='O')
                       {
                        arr[j][k+1]=',';
                       }
                       if(arr[j-1][k]!='O')
                       {
                        arr[j-1][k]=',';
                       }
                        
                     }
                    }
                    else if(k==y-1)
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j-1][k]!='O')
                      {
                       arr[j-1][k]=','; 
                      }
                     }
                    }
                    else
                    {
                      if(arr[j][k]=='O')
                      {
                       
                        arr[j][k]=',';
                        if(arr[j][k+1]!='O')
                        {
                         arr[j][k+1]=',';
                        }
                        if(arr[j][k-1]!='O')
                        {
                         arr[j][k-1]=',';
                        }
                        if(arr[j-1][k]!='O')
                        {
                         arr[j-1][k]=',';
                        }
                      } 
                    }
                }
                
            }
            else
            {
                
                for(int k=0;k<y;k++)
                {
                    if(k==0)
                    {
                     if(arr[j][k]=='O')
                     {
                    
                      arr[j][k]=',';
                      if(arr[j][k+1]!='O')
                      {
                       arr[j][k+1]=',';
                      }
                      if(arr[j-1][k]!='O')
                      {
                       arr[j-1][k]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=','; 
                      }
                     }
                    }
                    else if(k==y-1)
                    {
                     if(arr[j][k]=='O')
                     {
                      
                      arr[j][k]=',';
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j-1][k]!='O')
                      {
                       arr[j-1][k]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=','; 
                      }
                     }
                    }
                    else
                    {
                     if(arr[j][k]=='O')
                     {
                      arr[j][k]=',';
                      if(arr[j][k+1]!='O')
                      {
                         arr[j][k+1]=',';
                      }
                      
                      if(arr[j][k-1]!='O')
                      {
                       arr[j][k-1]=',';
                      }
                      if(arr[j-1][k]!='O')
                      {
                       arr[j-1][k]=',';
                      }
                      if(arr[j+1][k]!='O')
                      {
                       arr[j+1][k]=','; 
                      }
                      
                     }
                    }
                }
                
            }
            }
           // System.out.println(j); 
           }
           for(int finx=0;finx<x;finx++)
            {
             for(int finy=0;finy<y;finy++)
             {
              if(arr[finx][finy]=='.')
              {
                arr[finx][finy]='O';
              }
              else
              {
                 arr[finx][finy]='.';
              }  
             }
           }
           i++;
         }
         for(int finx=0;finx<x;finx++)
         {
            String samp="";
            for(int finy=0;finy<y;finy++)
            {
                samp+=arr[finx][finy];  
            }
            sol.add(samp);
         }
        }
        return sol;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            String gridItem = bufferedReader.readLine();
            grid.add(gridItem);
        }

        List<String> result = Result.bomberMan(n, grid);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
