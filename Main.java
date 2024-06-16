import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int p;

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        Scanner in = new Scanner(System.in);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    p++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        thread.start();
        while (true) {
            int s = in.nextInt();
            if (s == n) {
                System.out.println(String.format("Congratulations! You guessed the number %s in %s seconds!", n, p));
            }
        }
    }
}