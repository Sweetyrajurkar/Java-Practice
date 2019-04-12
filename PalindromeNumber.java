/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Riya 
 */
public class PalindromeNumber {
    
    public static void main(String args[])
    {
        int rev =0;
        int count =0;
        
        System.out.println("Palindrome numbers are:");
        for(int i=1; i<=1000; i++)
        {
            int num =i;
            while(num>0)
            {
                int val = num % 10;    
                rev = rev*10 + val;
                num = num/10;            
            }   
             if (rev == i)
            {
                System.out.print(i + " ");
                count++;
            }
             
            rev = 0;
       }  
        
        System.out.print("\nCount is : "+count+" ");
    }
}
