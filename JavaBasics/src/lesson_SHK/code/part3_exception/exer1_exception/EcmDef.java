package lesson_SHK.code.part3_exception.exer1_exception;

public class EcmDef {
    public static void main(String [] args){

        try{
            int result = ecm(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println("数据类型不一致。");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数。");
        }catch (ArithmeticException e){
            System.out.println("除零。");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }
    }

    static int ecm (int a, int b){
        if(a < 0 || b < 0){
            throw new EcDef("分子或分母为负数。");
        }
        return a / b;
    }

}

class EcDef extends RuntimeException{
    static final long serialVersionUID = 41011998;

    public EcDef(String s){
        super(s);
    }
}