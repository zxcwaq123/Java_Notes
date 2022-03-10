package lesson_SHK.part1_basics.chap2_object_oriented.day10_project02.util;

import java.util.*;

/**
 CMUtility工具类：
 将不同的功能封装为方法，通过直接调用方法使用它，而无需考虑具体的实现细节。
 */

public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @Description 私有方法，从键盘获取数据。
     */
    private static String readkeyBoard(int limit, boolean blankReturn){
        String line = "";

        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() == 0){
                if(blankReturn) return line;
                else continue;
            }

            if(line.length() < 1 || line.length() > limit){
                System.out.printf("输入长度(1-%d)错误，请重新输入：",limit);
                continue;
            }
            break;
        }
        return line;
    }



    /**
     * @Description 用于界面菜单的选择。该方法读取键盘，用户输入'1'-'5'中的任意字符，则方法返回，返回值为用户输入的字符。
     */

    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readkeyBoard(1,false);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5'){
                System.out.print("输入错误，请重新输入：");
            }else break;
        }
        return c;
    }

    /**
     * @Description 从键盘读取一个字符，并返回。
     */
    public static char readChar(){
        String str = readkeyBoard(1,false);
        return str.charAt(0);
    }

    /**
     * @重载方法
     * @Description 从键盘读取一个字符，并返回。如果用户不输入字符而直接回车，方法将以defaultValue作为返回值。
     */
    public static char readChar(char defaultValue){
        String str = readkeyBoard(1,true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    /**
     * @Description 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
     */
    public static int readInt(int defaultValue){
        int n;
        for(;;){
            String str = readkeyBoard(2,true);
            if(str.equals("")){
                return defaultValue;
            }

            try{
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e){
                System.out.print("输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * @Description 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值
     */
    public static String readString(int limit){
        return readkeyBoard(limit,false);
    }

    /**
     * @重载方法
     * @Description 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值
     */
    public static String readString(int limit, String defaultValue){
        String str = readkeyBoard(limit,true);
        return str.equals("") ? defaultValue : str;
    }

    /**
     * @Description 用于确认选择的输入，该方法从键盘读取'Y'或'N'，并将其作为方法的返回值。
     */
    public static char readComfirmSelection(){
        char c;
        for(;;){
            String str = readkeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else {
                System.out.print("输入错误，请重新输入：");
            }
        }
        return c;
    }
}
