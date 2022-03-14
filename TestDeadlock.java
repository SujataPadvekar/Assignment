package Thread_example;

public class TestDeadlock {
public static void main(String[] args) {
		
		String resource1="paper";
		String resource2="pen";
		
		Thread sujata = new Thread()
		{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread 1-Sujata:locked paper");
					try
					{
						Thread.sleep(400);
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
					
					synchronized(resource2)
					{
						System.out.println("Thread 1:locked pen");
					}	
				}
			}
		};
		
		Thread sachin = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 2-Sachin:locked pen");
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				synchronized(resource2)
				{
					System.out.println("Thread 2:locked paper");
				}
			}//run
		};//monalisa	
		
		sujata.start();
		sachin.start();
				
	}

}
