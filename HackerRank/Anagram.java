import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        char arr[]=a.toCharArray();
        char arr1[]=b.toCharArray();
        int i,j;
        char ch;
   
        if(arr.length!=arr1.length)
          return false;
        for(i=0;i<=arr.length-1;i++)
        {
            for(j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    ch=arr[j];
                    arr[j]=arr[i];
                    arr[i]=ch;
                }
            }
        }
        for(i=0;i<=arr1.length-1;i++)
        {
            for(j=i+1;j<=arr1.length-1;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    ch=arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=ch;
                }
            }
        }
        
        for(i=0;i<=arr1.length-1;i++)
        {
        if(arr[i]!=arr1[i])
        return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
