import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<ArrayList>list=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            ArrayList<Integer>subList=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int num=in.nextInt();
                subList.add(num);
            }
            list.add(subList);
        }
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=in.nextInt()-1;
            int y=in.nextInt()-1;
            
            if(x<list.size() && y<list.get(x).size())
            {
                System.out.println(list.get(x).get(y));
            }
            else
            System.out.println("ERROR!");
        }
    }
}
