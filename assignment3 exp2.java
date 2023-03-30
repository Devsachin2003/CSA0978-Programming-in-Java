class MultiplicationTableThread implements Runnable {
    private int num;
    public MultiplicationTableThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " started.");
        System.out.println("Thread " + Thread.currentThread().getId() + " is in the 'New' state.");
        System.out.println("Thread " + Thread.currentThread().getId() + " is in the 'Runnable' state.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " is in the 'Terminated' state.");
    }

    public static void main(String[] args) {
        // Create threads for multiplication table of 5 and 10
        Thread thread1 = new Thread(new MultiplicationTableThread(5));
        Thread thread2 = new Thread(new MultiplicationTableThread(10));
        System.out.println("Threads created. They are in the 'New' state.");
        thread1.start();
        thread2.start();
        System.out.println("Threads started. They are in the 'Runnable' state.");
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads completed.");
    }
}
