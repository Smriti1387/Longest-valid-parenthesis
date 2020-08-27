import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
     public static int fun(String str)
     {
     Stack<Integer> st=new Stack<>();
     int result=-1;
     st.push(result);
     for(int i=0;i<str.length();i++)
     {
         if(str.charAt(i)=='(')
         {
             st.push(i);
         }
         else
         {
             if(str.charAt(i)==')')
             {
             st.pop();
             }
             if(!st.isEmpty())
             {
                 int len=i-st.peek();
                 if(len>result)
                 {
                     result=len;
                 }
             }
             if(st.isEmpty())
             {
                 st.push(i);
             }
         }
     }
         return result;
     }
     
     
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-- >0)
	 {
	     String str=sc.next();
	     System.out.println(fun(str));
	 }
	 }
}