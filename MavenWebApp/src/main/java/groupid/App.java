package groupid;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		int i=10;
		int j=90;
		
		System.out.println("high priority task");
		
		System.out.println(i+j);
		
        System.out.println( "Hello World!" );
		
    }
	
	//inital task (low priority)
	public void greet(){
		 System.out.println( "changes completed" );
	}
	
	//1
	
}
