package lesson_SHK.part1_basics.chap2_object_oriented.day15.test2_interface;
/*
接口的应用：代理模式
 */
public class Test2_Proxy {
    public static void main(String[] args) {
        Server se = new Server();
        new ProxyServer(se).browse();
    }
}

interface NetWork{

    public void browse();
}

// 被代理类
class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

// 代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}