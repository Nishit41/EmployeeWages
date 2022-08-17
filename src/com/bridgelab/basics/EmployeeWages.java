package com.bridgelab.basics;
public class EmployeeWages {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int IS_PARTTIME = 2;
    public static int wagePerHour = 20;
    public static int fullDayHour = 8;
    public static int partTimeHour = 4;
    public static int monthlyWages = 0;

    public static int dailyEmployeeWages;
    public static int workingHour = 0;
    public static void calculationOfWages() {
        System.out.println("welcome to Employee Wages");
        int day = 1;
        while (day <= 20 && workingHour <= 100) {
            int attendenceCheck = (int) Math.floor((Math.random() * 10)) % 3;
            switch (attendenceCheck) {
                case IS_PRESENT:
                    System.out.println("The day at which employee is present in this month => " + day);
                    System.out.println("Employee is Present for fullday");
                    System.out.println("Daily Employee Wage" + wagePerHour * fullDayHour);
                    dailyEmployeeWages = wagePerHour * fullDayHour;
                    monthlyWages = monthlyWages + dailyEmployeeWages;
                    workingHour = workingHour + fullDayHour;
                    day++;
                    System.out.println("Cummulative workingHour =>" + " " + workingHour);
                    System.out.println("monthly wages of employee =>" + monthlyWages);
                    System.out.println("                                                         ");
                    break;
                case IS_PARTTIME:
                    System.out.println("Employee is Present as Part time");
                    dailyEmployeeWages = wagePerHour * partTimeHour;
                    monthlyWages = monthlyWages + dailyEmployeeWages;
                    System.out.println("the day at which employee is present in this month =>" + day);
                    day++;
                    workingHour = workingHour + partTimeHour;
                    System.out.println("Cummulative WorkingHour is" + " " + workingHour);
                    System.out.println("part time wage is of one day=>" + " " + partTimeHour * wagePerHour);
                    System.out.println("monthly wages of employee =>" + monthlyWages);
                    System.out.println("                                                          ");
                    break;
                default:
                    System.out.println("Employee is absent on day =>" + day);
                    day++;
                    System.out.println("                                   ");
                    break;
            }
        }
        {
            int totalWagesForMonth = monthlyWages ;
            System.out.println("totalWagesForMonth=>" + totalWagesForMonth);
            System.out.println("workingHour =>" + " " + workingHour);
        }
    }

    public static void main(String[] args) {
        calculationOfWages();
    }
}
