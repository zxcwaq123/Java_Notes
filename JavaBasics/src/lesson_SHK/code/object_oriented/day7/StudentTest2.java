package lesson_SHK.code.object_oriented.day7;
/*
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年纪（state值为3)的学生信息(1-6)。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息。

提示：
1）生成随机数：Math.random()，返回值类型double；
2）获取[a,b]的随机整数: (int)(Math.random() * (b - a + 1) + a)
3）四舍五入取整：Math.round(double d)，返回值类型long。
 */

/*
代码优化：
在StudentTest1的基础上，将打印信息、冒泡排序等功能封装到方法中
 */
public class StudentTest2 {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student2[] stus2 = new Student2[20];

        StudentTest2 test = new StudentTest2();

        System.out.println("三年级学生信息：");
        for (int i = 0; i < stus2.length; i++){
            //给数组元素赋值
            stus2[i] = new Student2();
            //给Student对象的属性赋值
            stus2[i].number = (i + 1);
            stus2[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);
            stus2[i].score = (int)(Math.random()*(100 - 0 + 1));
        }

        //打印出3年级学生信息
        test.search(stus2,3);

        //按学生成绩冒泡排序
        test.sort(stus2);

        System.out.println("\n所有学生信息（按成绩排序）：");
        //遍历所有学生成绩
        test.print(stus2);
    }

    /**
     * @Description 遍历Student数组中的信息
     * @Author YaguangChen
     * @param stus2
     */
    public void print (Student2[] stus2){
        for(int i = 0; i < stus2.length; i++){
            System.out.println("序号：" + stus2[i].number + "\t" + "年级：" + stus2[i].state + "\t" + "成绩：" + stus2[i].score);
        }
    }

    /**
     * @Description 查找Student数组中指定年纪的学生信息
     * @Author YaguangChen
     * @param stus2
     * @param state
     */
    public void search(Student2[] stus2, int state){
        for(int i = 0; i < stus2.length; i++){
            if (stus2[i].state == state){
                System.out.println("序号：" + stus2[i].number + "\t" + "年级：" + stus2[i].state + "\t" + "成绩：" + stus2[i].score);
            }
        }
    }
    /**
     * @Description 将Student数组中的元素按属性成绩排序
     * @Author YaguangChen
     * @param stus2
     */
    public void sort (Student2[] stus2){
        //冒泡排序
        for(int i = 0; i < stus2.length; i++){
            for(int j = 0; j < stus2.length - 1 - i; j++){
                if (stus2[j].score < stus2[j+1].score){
                    // 换序：交换的是Student对象（即数组的元素）
                    Student2 temp = new Student2();
                    temp = stus2[j];
                    stus2[j] = stus2[j+1];
                    stus2[j+1] = temp;
                }
            }
        }
    }
}

class Student2 {
    //属性
    int number;
    int state;
    int score;
}
