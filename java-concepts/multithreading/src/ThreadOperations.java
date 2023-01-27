
 class UserThread extends Thread{

    public void run(){
        System.out.println("UserThread run method called");
    }
}

 class ThreadOperations {

    public static void main(String[] args){
        System.out.println("program started");
        int x = 10 + 20;
        System.out.println("sum is"+x);

        //thread ops
        Thread t = Thread.currentThread();

        //set thread name
        t.setName("my main thread");

        System.out.println("current running thread name is = "+t.getName());

        // sleep
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
    
        }

        //getId()
        System.out.println("thread id is"+t.getId());

        System.out.println("program ended");

        //run() - stores thread tasks
        UserThread t2 = new UserThread();
        t2.start();

        
    }
}
