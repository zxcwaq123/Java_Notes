package lesson_SHK.part1_basics.chap2_object_oriented.day11.InheritanceTest_1;

public class Kids extends Mankind{

    private int yeasOld;

    public Kids(){
    }

    public Kids(int yeasOld){
        this.yeasOld = yeasOld;
    }
    void printAge(){
        System.out.println(yeasOld);
    }

    public int getYeasOld() {
        return yeasOld;
    }

    public void setYeasOld(int yeasOld) {
        this.yeasOld = yeasOld;
    }
}
