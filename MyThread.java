class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Value of i for thread1:"+i);
        }

    }
  
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("Value of i for thread2 :" +i);
        }

    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThread1 thread1=new MyThread1();

        MyThread2 thread=new MyThread2();
        Thread thread2=new Thread(thread);

        thread1.start();
        thread2.start();
    }

    
    
}
