import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int cnt=0;
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=in.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                   sum+=a[k];
                if(sum<0)
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
