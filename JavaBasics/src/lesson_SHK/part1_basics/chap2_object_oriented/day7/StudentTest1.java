package lesson_SHK.part1_basics.chap2_object_oriented.day7;
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
public class StudentTest1 {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student1[] stus = new Student1[20];

        System.out.println("三年级学生信息：");
        for (int i = 0; i < stus.length; i++){
            //给数组元素赋值
            stus[i] = new Student1();
            //给Student对象的属性赋值
            stus[i].number = (i + 1);
            stus[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random()*(100 - 0 + 1));

            //打印出3年级学生信息
            if (stus[i].state == 3){
                System.out.println("序号：" + stus[i].number + "\t" + "年级：" + stus[i].state + "\t" + "成绩：" + stus[i].score);
            }
        }

        //冒泡排序
        for(int i = 0; i < stus.length; i++){
            for(int j = 0; j < stus.length - 1 - i; j++){
                if (stus[j].score < stus[j+1].score){
                    // 换序：交换的是Student对象（即数组的元素）
                    Student1 temp = new Student1();
                    temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }

        System.out.println("\n所有学生信息（按成绩排序）：");
        //遍历所有学生成绩
        for(int i = 0; i < stus.length; i++){
            System.out.println("序号：" + stus[i].number + "\t" + "年级：" + stus[i].state + "\t" + "成绩：" + stus[i].score);
        }

    }
}

class Student1 {

    //属性
    int number;
    int state;
    int score;
}
