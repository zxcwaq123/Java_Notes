package lesson_SHK.part1_basics.chap4_project3.service;

import lesson_SHK.part1_basics.chap4_project3.domain.Architect;
import lesson_SHK.part1_basics.chap4_project3.domain.Designer;
import lesson_SHK.part1_basics.chap4_project3.domain.Employee;
import lesson_SHK.part1_basics.chap4_project3.domain.Programmer;

public class TeamService {
    private static int counter = 1; // 静态变量，用来为开发团队新增成员自动生成团队中的唯一ID
    private final int MAX_MEMBER = 5; // 开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0; // 团队成员的实际人数

    public Programmer[] getTeam(){
        if(total > 0){
            Programmer[] t = new Programmer[total];
            System.arraycopy(team, 0, t, 0, total);
            return t;
        }
        throw new TeamException("当前团队为空");
    }

    public void addMember(Employee e) {
        if (e == null)
            throw new TeamException("所要添加的对象不存在，无法添加！");
        if (!(e instanceof Programmer))
            throw new TeamException("该成员不是开发人员，无法添加！");

        Programmer p = (Programmer) e;

        switch (p.getStatus()) {
            case "BUSY":
                throw new TeamException("该员工已是某团队成员。");
            case "VACATION":
                throw new TeamException("该员工正在休假，无法添加。");
        }

        if (isExit(p))
            throw new TeamException("该员工已在本团队中。");

        // 计算出现有团队中程序员、设计师、架构师的人数
        int numOfPro = 0, numOfDes = 0, numOfArch = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        //判断要添加的p是否满足各个工种人数的要求
        if (p instanceof Architect && numOfArch >= 1) {
            throw new TeamException("团队中至多只能有一名架构师");
        } else if (p instanceof Designer && numOfDes >= 2) {
            throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer && numOfPro >= 3) {
            throw new TeamException("团队中至多只能有三名程序员");
        }

        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
        team[total++] = p;
    }

    // 判断p是否已在当前开发团队中
    private Boolean isExit(Programmer p){
        for(int i = 0; i < total; i++){
            if(team[i].getMemberId() == p.getMemberId())
                return true;
        }
        return false;
    }

    // 从开发团队中移除指定memberId的员工
    public void removeMember(int memberId){
        int i;
        for(i = 0; i < total; i++){
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                team[i].setMemberId(0);
                counter--;
                break;
            }
            if(i == total)
                throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        // 将删除的数右边的员工左移
        for(int j = i; j < total - 1; j++){
            team[j] = team[j+1];
            team[j].setMemberId(j+1);
        }

        // 将最后一个元素删除
        team[--total] = null;
    }

}
