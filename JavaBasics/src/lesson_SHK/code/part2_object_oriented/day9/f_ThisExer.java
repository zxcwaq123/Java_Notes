package lesson_SHK.code.part2_object_oriented.day9;

public class f_ThisExer {
}

class Boy{

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl){

    }

    public void shout(){
        if(this.age >= 22){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

class Girl{

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy){

    }

    /**
     * @Description 比较大小
     * @param girl
     */
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        }else{
            return 0;
        }
    }
}