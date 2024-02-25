package com.homework;

/**
 * Hello world!
 *
 */
public class App {
    // public static void main(String[] args) {
    // System.out.println("Hello World!");
    // }

    /**
     * The NextDate method takes in a day, month, and year input, and outputs the
     * next day
     * or error depending on the inputs
     * 
     * @param day   The day of the date
     * @param month The month in the date
     * @param year  The year in the date
     * 
     * @return the next date in the form of a string OR string briefly describing
     *         error in inputs (if any)
     */
    public static String NextDate(int day, int month, int year) {
        // includes the number of days in every month of the year except februrary
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // checking for leap year
        boolean isLeapYear = (year % 4 == 0) || (year % 400 == 0);
        // if it is a leap year, change the number of dates the second month in the days
        // list to 29
        if (isLeapYear) {
            days[1] = 29;
        } else {
            days[1] = 28;
        }

        // check for bounds
        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day > days[month - 1]) {
            return "ERROR: input out of range";
        }

        // check if it is the last day of the last month of the last year, it should
        // give only this output
        if (day == 31 && month == 12 && year == 2212) {
            return "1/1/2213";
        }

        // if there are still more days in the month, increment date by one
        if (day < days[month - 1]) {
            return (day + 1) + "/" + month + "/" + year;
        }
        // if the date is the last date in a month, incrememt the month by one
        else if (month < 12) {
            return 1 + "/" + (month + 1) + "/" + year;
        }
        // if neither, increment year
        else {
            return 1 + "/" + 1 + "/" + (year + 1);
        }
    }
}
