import java.io.*;
import java.util.*;

class Test<T>
{
    T obj;
    public void print(T a)
    {
        System.out.println(a);
    }
}
public class Solution {
    
    public static void main(String[] args) {
        int a[]={1,2,3};
        String str[]={"Hello","World"};
        
        Test<Integer> iobj=new Test<Integer>();
        for(int i=0;i<3;i++)
        {
           System.out.println(a[i]);
        }
        
        Test<String> sobj=new Test<String>();
        for(int i=0;i<2;i++)
        {
           System.out.println(str[i]);
        }
    }
}
