public class RunnableDemo implements Runnable {
    
    public static int variable_compartida=0; 
    public static int n;
    
    public void run()
	{
		for(int i=0;i<n;i++){
            modifica();
        }
	}

    public void modifica(){
        if(Thread.currentThread().getName().compareTo("First")==0){
            variable_compartida++; 
        }else if(Thread.currentThread().getName().compareTo("Second")==0){
            variable_compartida--; 
        }
    }

	public static void main(String[] args) throws InterruptedException
	{
        if (args.length != 1) {
            System.out.println("Ejecution: java RunnableDemo n");
            System.out.println("Argumentos:\nn: Numero de repeticiones del ciclo");
            return;
        }
        n=Integer.parseInt(args[0]); 
        // Runnable target
		RunnableDemo t = new RunnableDemo();
		
		// create threads
		Thread t1 = new Thread(t, "First");
		Thread t2 = new Thread(t, "Second");
			
		// start threads
		t1.start();
		t2.start();

        t1.join();
        System.out.println("Valor variable compartida: "+variable_compartida);
	}
}

