package lesson_SHK.code.object_oriented.day11.InheritanceTest_1;

public class Mankind {

    private int sex;
    private int salary;

    /**
     * @Description 根据sex的值显示性别
     * @Autor YgChen
     */
    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
