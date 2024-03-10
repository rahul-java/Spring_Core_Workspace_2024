package com.mea.app;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.config.AppConfig;
import com.mea.controller.MainController;
import com.mea.vo.CustomerVO;

public class RealtimeDITest
{
    public static void main( String[] args )
    {
    	//read input from end user as String values
      
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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //get the controller  class obj
        MainController controller = ctx.getBean("controller",MainController.class);
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
Enter Customer Name :
raja
Enter Customer Address :
hyd
Enter Customer Principle Amt :
120000
Enter Rate of Interest :
12
Enter Time in Months:
24
CustomerMgmtServiceImpl.registerCustomer()
Oracle-CustomerDAOImpl.insert()
Registration Successfully . Interest Amount : 14400.0
 */
