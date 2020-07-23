package com.mycompany.mygroup;

import com.mycompany.mygroup.core.infra.di.DependencyResolver;
import com.mycompany.mygroup.core.mvc.IBankAccountController;
import com.mycompany.mygroup.core.usecase.ResponseModel;

import javax.management.InstanceNotFoundException;
import javax.xml.ws.Response;
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
        ResponseModel responseModel = controller.withdraw("001", new BigDecimal(12));
        System.out.println("Response: " + responseModel.getResult());
    }
}
