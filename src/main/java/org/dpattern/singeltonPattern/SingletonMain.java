package org.dpattern.singeltonPattern;

public class SingletonMain {

    public static void main(String[] args) {

        Thread thr1= new Thread(new ThreadDark());
        Thread thr2= new Thread(new ThreadBlue());
        thr1.start();
        thr2.start();

    }

    static class ThreadDark implements Runnable{

        @Override
        public void run() {
            DragonSingle dr1= DragonSingle.getInstance("Dark");
            System.out.println("1 : "+dr1.getValue());
        }
    }
    static class ThreadBlue implements Runnable{

        @Override
        public void run() {
            DragonSingle dr1= DragonSingle.getInstance("Blue");
            System.out.println("2 : "+dr1.getValue());
        }
    }
}
