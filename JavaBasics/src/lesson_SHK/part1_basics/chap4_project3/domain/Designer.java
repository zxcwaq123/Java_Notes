package lesson_SHK.part1_basics.chap4_project3.domain;

import lesson_SHK.part1_basics.chap4_project3.service.Equipment;

public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus){
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
