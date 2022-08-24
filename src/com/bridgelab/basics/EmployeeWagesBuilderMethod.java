package com.bridgelab.basics;
public class EmployeeWagesBuilderMethod {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHrs;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpwage;
    public EmployeeWagesBuilderMethod(String company , int empRatePerHrs , int numOfWorkingDays , int maxHoursPerMonth)
    {
       this.company = company;
       this.empRatePerHrs = empRatePerHrs;
       this.numOfWorkingDays = numOfWorkingDays;
       this.maxHoursPerMonth = maxHoursPerMonth;

    }
    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day=" + totalWorkingDays + "EmpHrs" + empHrs);
        }
         totalEmpwage = totalEmpHrs * empRatePerHrs;
    }

    @Override
    public String toString() {
        return "EmployeeWagesBuilderMethod{" +
                "totalEmpwage=" + totalEmpwage +
                '}';
    }

    public static void main(String[] args) {
        EmployeeWagesBuilderMethod akasa = new EmployeeWagesBuilderMethod("akasa",20,2,10);
        EmployeeWagesBuilderMethod flipKart = new EmployeeWagesBuilderMethod("flipkart",10,4,20);
        akasa.computeEmpWage();
        System.out.println(akasa);
        flipKart.computeEmpWage();
        System.out.println(flipKart);
    }
}

