
public class OverrideRunThread extends Thread {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx());
        t.start();

    }
}

class ThreadEx implements Runnable {

    @Override
    public void run() {
        System.out.println("the thread overriding run.");

    }
}

