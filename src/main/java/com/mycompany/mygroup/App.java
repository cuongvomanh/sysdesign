package com.mycompany.mygroup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstanceNotFoundException 
    {
        System.out.println( "Hello World!" );
		IBankAccountController controller = DependencyResolver.getInstance("IBankAccountController");
		controller.withdraw(1, new BigDecimal(12); 
    }
}
