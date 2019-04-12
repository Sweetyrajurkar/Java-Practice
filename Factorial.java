/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @Riya Rajurkar
 */

import java.util.Scanner;

public class Factorial {
    
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the numbber:-");
    int num = s.nextInt();
    int fact=num;
            
        for(int i=1;i<num;i++)
        {
           fact = fact*i;
        }
        System.out.println("FACTORIAL OF "+num+" IS : "+fact);
    }
    
}
