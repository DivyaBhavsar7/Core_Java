import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length() == 0)
           {
                 System.out.println(0);
           }
        else
        {
        String[] string = s.trim().split("[! ,?._'@]+");
        System.out.println(string.length);
        for (String a: string)
        {
            System.out.println(a);
        }
        }
        scan.close();
    }
}

