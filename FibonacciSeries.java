/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Riya
 */
public class FibonacciSeries 
{
    public static void main(String args[])
    { 
        int number = 10;
        int num1 = 0, num2 = 1; 
        
        if (number >= 0) 
        {
        System.out.print(num1 + " "); 
        }
        
        if (number >= 1)
        {
        System.out.print(num2 + " "); 
        }
        
        for (int i = 2; i <= number; i++)  
        { 
        System.out.print(num1 + num2 + " "); 
        num2 = num1 + num2; 
        num1 = num2 - num1; 
        } 
    }    
}
