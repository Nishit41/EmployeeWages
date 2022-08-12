package com.bridgelab.basics;

public class EmployeeWages {
    public static final int IS_PRESENT = 1;
    public static  final int IS_ABSENT = 0;
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    public static void main(String[] args)
    {
        System.out.println("welcome to Employee Wages");
        int attendenceCheck = (int)(Math.random()*10%2);
        if( attendenceCheck == 1 )
        {
            System.out.println("Employee is Present");
            System.out.println("Daily Employee Wage"+ wagePerHour*fullDayHour);
        }
        else {
           System.out.println("Employee is absent");
        }
    }
}
