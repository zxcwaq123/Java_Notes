package lesson_SHK.part1_basics.chap4_project3.service;


import lesson_SHK.part1_basics.chap4_project3.domain.Architect;
import lesson_SHK.part1_basics.chap4_project3.domain.Designer;
import lesson_SHK.part1_basics.chap4_project3.domain.Employee;
import lesson_SHK.part1_basics.chap4_project3.domain.Programmer;

public class NameListService {
    private Employee[] employees = new Employee[Data.EMPLOYEES.length];

    public NameListService(){
        for(int i = 0; i < employees.length; i++){
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            double bonus;
            switch (type){
                case 10:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case 11:
                    employees[i] = new Programmer(id, name, age, salary, creatEquipment(i));
                    break;
                case 12:
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, creatEquipment(i), bonus);
                    break;
                case 13:
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][5]);
                    employees[i] = new Architect(id, name, age, salary, creatEquipment(i), bonus, stock);
                    break;
            }
        }
    }

    private static Equipment creatEquipment(int i){
        int type = Integer.parseInt(Data.EQUIPMENTS[i][0]);
        String name = Data.EQUIPMENTS[i][1];
        String info = Data.EQUIPMENTS[i][2];

        switch (type){
            case 21:
                return new PC(name,info);
            case 22:
                return new NoteBook(name, Double.parseDouble(info));
            case 23:
                return new Print(name, info);
        }
        return null;
    }

    //获取所有的员工构成的数组
    public Employee[] getAllEmployees() {
        return employees;
    }

    /*
    获取指定id的员工
    参数：指定员工的ID
    返回：指定员工对象
    异常：找不到指定的员工
     */
    public Employee getEmployee(int id){
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }



}
