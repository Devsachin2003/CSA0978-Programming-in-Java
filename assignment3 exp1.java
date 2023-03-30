import java.util.*;

class Dynamiccolorchange extends Thread {

    private final String text;
    private final long delay;
    private final Random random;

    public Dynamiccolorchange(String text, long delay) {
        this.text = text;
        this.delay = delay;
        this.random = new Random();
    }

    public void run() {
        while (true) {
            int color = random.nextInt(6) + 31; 
            System.out.printf("\033[%dm%s\033[0m", color, text); 
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Dynamiccolorchange thread = new Dynamiccolorchange("Hi there!", 10);
        thread.start();
    }
}
