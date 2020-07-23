package com.mycompany.mygroup;

import com.mycompany.mygroup.core.infra.di.DependencyResolver;
import com.mycompany.mygroup.core.mvc.IBankAccountController;

import javax.management.InstanceNotFoundException;
import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstanceNotFoundException
    {
        System.out.println( "Hello World!" );
        IBankAccountController controller = (IBankAccountController) DependencyResolver.getInstance("IBankAccountController");
        controller.withdraw("1", new BigDecimal(12));
    }
}
