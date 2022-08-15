package com.bridgelab.basics;
public class EmployeeWages {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int IS_PARTTIME = 2;
    public static int wagePerHour = 20;
    public static int fullDayHour = 8;
    public static int partTimeHour = 4;
    public static int monthlyWagesAsFullTime = 0;
    public static int monthlyWagesPartTime = 0;
    public static int dailyEmployeeWages;
    static int count;

    public static void main(String[] args) {
        System.out.println("welcome to Employee Wages");
        int day = 1;
        while (day <= 20)
        {
            int attendenceCheck = (int) Math.floor((Math.random() * 10)) % 3;
            switch (attendenceCheck)
            {
                case IS_PRESENT:
                    System.out.println("days Of month at which employee is present => " + day);
                    System.out.println("Employee is Present for fullday");
                    System.out.println("Daily Employee Wage" + wagePerHour * fullDayHour);
                    dailyEmployeeWages = wagePerHour * fullDayHour;
                    monthlyWagesAsFullTime = monthlyWagesAsFullTime + dailyEmployeeWages;
                    day++;
                    System.out.println("monthly wages of employee =>" + monthlyWagesAsFullTime);
                    break;
                case IS_PARTTIME:
                    System.out.println("Employee is Present as Part time");
                    dailyEmployeeWages = wagePerHour * partTimeHour;
                    monthlyWagesPartTime = monthlyWagesPartTime + dailyEmployeeWages;
                    System.out.println("days Of month(Employee is Present) =>" + day);
                    day++;
                    System.out.println("part time wage is of one day=>" + " " + partTimeHour * wagePerHour);
                    System.out.println("monthly wages of employee =>" + monthlyWagesPartTime);
                    break;
                default:
                    System.out.println("Employee is absent on day =>" + day);
                    day++;
            }
        }
        int totalWagesForMonth = monthlyWagesPartTime+monthlyWagesAsFullTime;
        System.out.println("totalWagesForMonth=>"+totalWagesForMonth);
    }
}
