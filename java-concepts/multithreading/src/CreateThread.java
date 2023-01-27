
public class CreateThread implements Runnable {
    
    public void run(){
        //task for thread
        for(int i=0;i<=10;i++){
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
        CreateThread t1 = new CreateThread();
        Thread thread = new Thread(t1);

        //MyThread t2 = new MyThread();

        thread.start();
       // t2.start();


    }
}
