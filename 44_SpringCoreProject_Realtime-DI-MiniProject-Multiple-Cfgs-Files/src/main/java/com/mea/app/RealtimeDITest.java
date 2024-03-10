package com.mea.app;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mea.controller.MainController;
import com.mea.vo.CustomerVO;

public class RealtimeDITest
{
    public static void main( String[] args )
    {
    	//read input from end user as String values
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        String name=null,address=null,pamt=null,rate=null,time=null;
        
        if(sc!=null)
        {
        	System.out.println("Enter Customer Name :");
        	name=sc.next();
        	System.out.println("Enter Customer Address :");
        	address=sc.next();
        	System.out.println("Enter Customer Principle Amt :");
        	pamt=sc.next();
        	System.out.println("Enter Rate of Interest :");
        	rate=sc.next();
        	System.out.println("Enter Time in Months:");
        	time=sc.next();
        		
        }
        
        CustomerVO customerVO = new CustomerVO();
        customerVO.setCname(name);
        customerVO.setCadd(address);
        customerVO.setPamt(pamt);
        customerVO.setRate(rate);
        customerVO.setTime(time);
        
        //create IOC Container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/mea/config/applicationContext.xml");
        
        //get the controller  class obj
        MainController controller = factory.getBean("controller",MainController.class);
        try {
			String resultMsg = controller.processCustomer(customerVO);
			System.out.println(resultMsg);
		} catch (Exception e) {

			System.err.println("Problem is Customer Registration."+e.getMessage());
			//e.printStackTrace();
		}
    }
}

/*
 Hello World!
Enter Customer Name :
ravi
Enter Customer Address :
delhi
Enter Customer Principle Amt :
500000
Enter Rate of Interest :
12
Enter Time in Months:
24
CustomerDAOImpl ::: 1-param-constructor
CustomerMgmtServiceImpl ::: 1-param-constructor
MainController ::: 1-param-constructor
CustomerMgmtServiceImpl.registerCustomer()
CustomerDAOImpl.insert()
Registration Successfully . Interest Amount : 60000.0 
 */
