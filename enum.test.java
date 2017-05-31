import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestEnum {
    public static void main(String[] args) {
        Test.INSTANCE.test();
        System.out.println(Test.INSTANCE.getState());
        Test.INSTANCE.setState(2);
        System.out.println(Test.INSTANCE.getState());
        ExecutorService executors = Executors.newFixedThreadPool(10000);

        for(int i = 0; i < 10000; i++) {
            final int k = i;
            executors.submit(new Runnable() {
                @Override public void run() {
                    Test.INSTANCE.setState(k);
                }
            });
        }
        System.out.println(Test.INSTANCE.getState());
        executors.shutdown();
    }
}
