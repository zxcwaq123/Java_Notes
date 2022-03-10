package lesson_SHK.part1_basics.chap4_project3.domain;

import lesson_SHK.part1_basics.chap4_project3.service.Equipment;
import lesson_SHK.part1_basics.chap4_project3.service.Status;

public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment){
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + "架构师" + "\t" + status.getName() + "\t" + equipment.getDescription();
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getStatus() {
        return this.status.getName();
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
