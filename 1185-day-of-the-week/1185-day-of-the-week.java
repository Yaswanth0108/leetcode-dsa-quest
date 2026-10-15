class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int noOfDays = 0;
        int years = year - 1971; 
        
        // 1. Cleanly count leap years that happened BEFORE this year
        int pastLeapYears = (year - 1 - 1968) / 4;
        int normalYears = years - pastLeapYears;
        noOfDays = pastLeapYears * 366 + normalYears * 365;
        
        // 2. Check if the CURRENT year is a leap year (2100 is excluded)
        boolean isLeapYear = (year % 4 == 0) && (year != 2100);
        
        // 3. Accumulate days of the months passed in the current year
        switch(month - 1) {
            case 11 : noOfDays += 30;
            case 10 : noOfDays += 31;
            case 9  : noOfDays += 30;
            case 8  : noOfDays += 31;
            case 7  : noOfDays += 31;
            case 6  : noOfDays += 30;
            case 5  : noOfDays += 31;
            case 4  : noOfDays += 30;
            case 3  : noOfDays += 31;
            case 2  : noOfDays += isLeapYear ? 29 : 28;
            case 1  : noOfDays += 31;
            break;
            default : break;
        }
        
        // 4. Add current days and map to the correct day name
        noOfDays += day;
        int dayOfTheYear = noOfDays % 7;
        
        switch(dayOfTheYear) {
            case 1 : return "Friday";
            case 2 : return "Saturday";
            case 3 : return "Sunday";
            case 4 : return "Monday";
            case 5 : return "Tuesday";
            case 6 : return "Wednesday";
            case 0 : return "Thursday";
            default: break;
        }
        return "";
    }
}
