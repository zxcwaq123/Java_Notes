package lesson_SHK.part1_basics.chap4_project3.service;

public interface Equipment {

    public abstract String getDescription();
}

class PC implements Equipment{
    private String model;
    private String display;

    public PC(){
        super();
    }

    public PC(String model, String display){
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public String getModel() {
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}

class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook(){
        super();
    }

    public NoteBook(String model, double price){
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Print implements Equipment{
    private String name;
    private String type;

    public Print(){
        super();
    }

    public Print(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}