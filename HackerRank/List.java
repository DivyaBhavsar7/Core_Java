import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
          list.add(in.nextInt());
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            String str=in.next();
            if(str.equals("Insert"))
            {
                int x=in.nextInt();
                int y=in.nextInt();
                list.add(x, y);
            }
            else 
            {
                int z=in.nextInt();
                list.remove(z);
            }
        }
        for(int arr: list)
           System.out.print(arr+" ");
        in.close();
    }
}
