package lesson_SHK.part1_basics.chap4_project3.service;
// 自定义异常类
public class TeamException extends RuntimeException{
    private static final long serialVersionUID = 232232323;

    public TeamException(String msg){
        super(msg);
    }
}
