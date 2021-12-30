/*
从键盘上输入“year”, “month"和“day”，要求通过程序输出该日期是"year"年的第几天
 */


package Lesson_SHK.Code.BasicGrammar.day_3;

import java.util.Scanner;

public class SwitchCase_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = scan.nextInt();
        String isYear;
        int Feb;
        //判断平/闰年
        if (((year%4 == 0) && (year%100 !=0)) || year%400 == 0){
            isYear = "闰年";
            Feb = 29;
        }
        else{
            isYear = "平年";
            Feb = 28;
        }

        System.out.print("请输入月份：");
        int month = scan.nextInt();
        if(month<1 || month>12) {
            System.out.println("输入月份有误，月份应在(1-12)之间！");
            System.exit(0);
        }

        System.out.print("请输入日期：");
        int day = scan.nextInt();

        switch (month) {
            case 1:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，1月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" +  day + "天");
                }
                break;
            case 2:
                if(day<1 || day >Feb){
                    System.out.println("输入日期有误，" + isYear + "2月日期应在(1-" + Feb +")之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 + day) + "天");
                }
                break;
            case 3:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，3月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 + Feb + day) + "天");
                }
                break;
            case 4:
                if(day<1 || day >30){
                    System.out.println("输入日期有误，4月日期应在(1-30)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 2  + Feb + day) + "天");
                }
                break;
            case 5:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，5月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 2 + 30 + Feb + day) + "天");
                }
                break;
            case 6:
                if(day<1 || day >30){
                    System.out.println("输入日期有误，6月日期应在(1-30)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 3 + 30 + Feb + day) + "天");
                }
                break;
            case 7:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，7月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 3 + 30 * 2 + Feb + day) + "天");
                }
                break;
            case 8:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，8月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 4 + 30 * 2 + Feb + day) + "天");
                }
                break;
            case 9:
                if(day<1 || day >30){
                    System.out.println("输入日期有误，9月日期应在(1-30)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 5 + 30 * 2 + Feb + day) + "天");
                }
                break;
            case 10:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，10月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 5 + 30 * 3 + Feb + day) + "天");
                }
                break;
            case 11:
                if(day<1 || day >30){
                    System.out.println("输入日期有误，11月日期应在(1-30)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 6 + 30 * 3 + Feb + day) + "天");
                }
                break;
            case 12:
                if(day<1 || day >31){
                    System.out.println("输入日期有误，12月日期应在(1-31)之间！");
                }
                else {
                    System.out.println("该日期是" + year + "年的第" + (31 * 6 + 30 * 4 + Feb + day) + "天");
                }
                break;
        }
    }
}
