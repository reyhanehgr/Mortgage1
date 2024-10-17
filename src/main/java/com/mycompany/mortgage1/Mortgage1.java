/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mortgage1;

import java.text.NumberFormat;
import java.util.Scanner;

///Mortgage Calcullating numbe1
public class Mortgage1 {

    public static void main(String[] args) {
        final int percent=100;
        final int month_in_year=12;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Principal:");
        int principal=scanner.nextInt();
        System.out.println("Annual Intrest Rate:");
        float annualIntrest=scanner.nextFloat();
        double monthlyIntrest=(annualIntrest/month_in_year)/percent;
        int period=30;
        int numberPayment= period*12;
        double pow = Math.pow((1+monthlyIntrest), (double)numberPayment);
        double mortgage= principal*((monthlyIntrest*pow)/(pow-1));
        String result =NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+result);
        
    }
}
