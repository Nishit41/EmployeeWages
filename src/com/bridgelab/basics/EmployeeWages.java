package com.bridgelab.basics;

public class EmployeeWages {
         public static final int IS_PRESENT = 1;
         public static final int IS_ABSENT = 0;
         public static final int IS_PARTTIME = 2;
         static int wagePerHour = 20;
         static int fullDayHour = 8;
         static int partTimeHour = 4;
         public static void main(String[] args){
         System.out.println("welcome to Employee Wages");
         int attendenceCheck = (int)Math.floor((Math.random()*10)) % 3;
         switch( attendenceCheck )
         {
             case IS_PRESENT:
             System.out.println("Employee is Present for fullday");
             System.out.println("Daily Employee Wage"+ wagePerHour*fullDayHour);
             break;
             case  IS_PARTTIME:
             System.out.println("Employee is Part time");
             System.out.println("part time wage is =>"+" "+partTimeHour*wagePerHour);
             break;
             default:
             System.out.println("Employee is absent");
         }
     }
}
