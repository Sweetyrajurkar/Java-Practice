/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Riya
 */
import java.lang.Math; 

public class PowerOfSumOfDigits {
   
    public static void main(String args[])
    {
        int num = 1435;
        int sum =0;
        int counter = 0;
        
        for(int i=num ;i>0;i--)
        {
           counter = counter +1;
           int val = num % 10;  
           double result = Math.pow(val,counter);
           val=(int)result;
           sum = val + sum;
           num = num/10;    
        }
        //1^4 + 4^3 + 3^2 + 5^1
        System.out.println("Sum Of Digits is: "+sum);
       }
    
}
