package lesson_SHK.code.object_oriented.day13.equalsTest;

public class Test8_EqualsTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001,"AA");
        Order o2 = new Order(1002,"bb");
        Order o3 = new Order(1001,"AA");
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
    }
}

class Order{
    int orderId;
    String orderName;

    public Order(int orderId, String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj instanceof Order){
            return this.orderId == ((Order) obj).orderId && this.orderName.equals(((Order) obj).orderName);
        }
        return false;
    }
}