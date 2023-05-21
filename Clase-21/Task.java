// Java program to illustrate
// ThreadPool
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class to be executed (Step 1)
class Task implements Runnable
{
	private String name;
	
	public Task(String s)
	{
		name = s;
	}
	
	// Prints task name and sleeps for 1s
	// This Whole process is repeated 5 times
	public void run()
	{
		if(name.compareTo("task-1")==0){
			System.out.println("Este es el: "+name);
			CountCharsSorted.printSortedMap(1,7037);
			System.out.println("--------------------");
		}else if(name.compareTo("task-2")==0){
			System.out.println("Este es el: "+name);
			CountCharsSorted.printSortedMap(7038,14075);
			System.out.println("--------------------");
		}else if(name.compareTo("task-3")==0){
			System.out.println("Este es el: "+name);
			CountCharsSorted.printSortedMap(14076,21113);
			System.out.println("--------------------");
		}else if(name.compareTo("task-4")==0){
			System.out.println("Este es el: "+name);
			CountCharsSorted.printSortedMap(21114,28151);
			System.out.println("--------------------");
		}else if(name.compareTo("task-5")==0){
			System.out.println("Este es el: "+name);
			CountCharsSorted.printSortedMap(28152,35185);
			System.out.println("--------------------");
		}
	}
}
