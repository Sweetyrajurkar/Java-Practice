/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Riya Rajurkar
 */
public class SumOfDigits {
    
    public static void main(String args[])
    {
        add();
    }
    
   static void add()
       {
        int num = 524536;
        int sum =0;
        
        for(int i=num ;i>0;i--)
        {
           int val = num % 10;    
           sum = val + sum;
           num = num/10;
            
        }
        
        System.out.println("Sum Of Digits is: "+sum);
       }
    }
    
    

