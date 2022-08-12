package com.bridgelab.basics;

public class EmployeeWages {
    public static final int IS_Present = 1;
    public static  final int IS_AbSENT = 0;
    public static void main(String[] args)
    {
        System.out.println("welcome to Employee Wages");
        int attendenceCheck = (int)(Math.random()*10%2);
        if( attendenceCheck == 1 )
        {
           System.out.println("Employee is Present");
        }
        else {
           System.out.println("Employee is absent");
        }
    }
}
