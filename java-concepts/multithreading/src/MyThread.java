
public class MyThread extends Thread {
    
    public void run(){
        for(int i=21;i<=30;i++){
            System.out.println("value of i is - "+i);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public static void main(String[] args){
        //create object of thread
        MyThread t2 = new MyThread();
        t2.start();
    }

}
