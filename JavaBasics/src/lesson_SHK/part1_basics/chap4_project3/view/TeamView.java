package lesson_SHK.part1_basics.chap4_project3.view;

import lesson_SHK.part1_basics.chap4_project3.domain.Employee;
import lesson_SHK.part1_basics.chap4_project3.service.NameListService;
import lesson_SHK.part1_basics.chap4_project3.service.TeamService;

public class TeamView {
    public static void main(String[] args) {

    }

    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu(){

    }

    private void listAllEmployees(){
        System.out.println("公司所有成员列表");
        System.out.println("ID" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "工资" + "\t" + "职位" + "\t" +
                            "状态" + "\t" + "奖金" + "\t" + "股票" + "\t" + "领用设备");
        Employee[] e = listSvc.getAllEmployees();
        for(int i = 0; i < e.length; i++){
            System.out.println(e[i].getInfo());
        }
    }
}
