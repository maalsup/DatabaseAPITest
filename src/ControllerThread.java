import java.util.Random;

public class ControllerThread extends Thread
{
	int i;
	int id;
	Random rand = new Random();
	
	public ControllerThread (int _i)
	{
		i = _i;
	}
	
	public void run() 
	{
		for (int i=0; i<10; i++)
		{
			try 
			{
	            Thread.sleep(20);
	        } 
			
			catch (InterruptedException e) 
			{
	            // Interrupted exception will occur if
	            // the Worker object's interrupt() method
	            // is called. interrupt() is inherited
	            // from the Thread class.
				break;
	        }
		}
		
		Controller c = new Controller();
		id = rand.nextInt(999999999) + 1000000000;
        System.out.println("Thread " + Integer.toString(i) + ", ID: " + Integer.toString(id));
        c.insertAdmin("testAdmin" + Integer.toString(i), Integer.toString(id));
    }

}
