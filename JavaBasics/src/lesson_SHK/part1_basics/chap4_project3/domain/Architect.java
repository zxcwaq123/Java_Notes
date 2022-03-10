package lesson_SHK.part1_basics.chap4_project3.domain;

import lesson_SHK.part1_basics.chap4_project3.service.Equipment;

public class Architect extends Designer{
    private int stock;

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock){
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}
