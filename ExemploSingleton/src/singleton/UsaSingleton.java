package singleton;
public class UsaSingleton extends Thread {
    //Escalono as regras para que seja possível utilizar uma multi-Thread
    @Override
    public void run() {
        Cenario cenario1 = Cenario.getCenario();
        System.out.println(cenario1);
    }

    public static void main(String[] args) throws Exception {
        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();
        UsaSingleton t3 = new UsaSingleton();

        t1.start();
        t2.start();
        t3.start();
    }
}
