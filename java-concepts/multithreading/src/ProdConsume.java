class Producer extends Thread {

    ProdConsume pc;

    Producer(ProdConsume pc) {
        this.pc = pc;
    }

    public void run() {
        int i = 1;
        while (true) {
            this.pc.produce_item(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }

            i++;

        }
    }

}

class Consumer extends Thread {

    ProdConsume pc;

    Consumer(ProdConsume pc) {
        this.pc = pc;
    }

    public void run() {
        while (true) {
            this.pc.consume_item();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class ProdConsume {

    int n;
    boolean f=false;
    //f:false - producer chance
    //f:true - consumer chamce

    synchronized public void produce_item(int n) {
        if(f){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        
        }
        this.n = n;
        System.out.println("produced" + this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item() {
        if(!f){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consumed" + this.n);
        f=false;
        notify();
        return this.n;
    }

    public static void main(String[] args) {

        ProdConsume pc = new ProdConsume();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);

        p.start();
        c.start();

    }
}
