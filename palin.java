import java.util.*;
public class palin{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int sum=0;
          int s=sc.nextInt();
         int n[]=new int[s];
         for(int i=0;i<s;i++)
         {
          n[i]=sc.nextInt();
          sum=sum+n[i];
         }
         System.out.print(sum);
         String str=Integer.toString(sum);
         System.out.println(str);
         String reverse = "";
        for(int i = str.length() -1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.print(reverse);
        if(str.equals(reverse))
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("notpalinrome");
        }
     
         
         
         

     }
}
