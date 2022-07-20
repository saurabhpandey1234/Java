package com.spring.poject.sweetshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.poject.entities.Admin;
import com.spring.poject.entities.UserLogin;
import com.spring.poject.entities.UserRegistration;
import com.spring.project.dao.AdminDao;
import com.spring.project.dao.UserLoginDao;
import com.spring.project.dao.UserRegistrationDao;

public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println("Sweet Shop");
        ApplicationContext context=  
       		 new ClassPathXmlApplicationContext("com/spring/poject/sweetshop/Config.xml");
        
        AdminDao adminDao=context.getBean("adminDao",AdminDao.class);
        UserLoginDao userloginDao=context.getBean("userloginDao",UserLoginDao.class);
        UserRegistrationDao userRegistrationDao=context.getBean("userRegistrationDao",UserRegistrationDao.class);
        
        
        System.out.println("Enter 1 For Admin");
       System.out.println("Enter 2 For user");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
        	int input=Integer.parseInt(br.readLine());
			switch(input) {
			case 1:
				//admin
				System.out.println("Enter AdminId: ");
        		int adminid=Integer.parseInt(br.readLine());
        		System.out.println("Enter admin name");
        		String adminname=br.readLine();
        		System.out.println("Enter admin password");
        		String adminpass=br.readLine();
        		
        		Admin admin=new Admin();
        	     admin.setAdminid(adminid);
        	     admin.setAdminname(adminname);
        	     admin.setAdminpassword(adminpass);
        	     int result=adminDao.insert(admin);
        	     System.out.println("Admin added"+result);
        	     
			case 2:
				//user
				
				System.out.println("Enter 1 for login");
				System.out.println("Enter 2 for Registration");
				int input1=Integer.parseInt(br.readLine());
				switch(input1) {
				case 1:
					System.out.println("Enter UserId: ");
	        		int userid=Integer.parseInt(br.readLine());
	        		System.out.println("Enter user name");
	        		String username=br.readLine();
	        		System.out.println("Enter user password");
	        		String userpass=br.readLine();
	        		
	        		UserLogin userlogin=new UserLogin();
	        		userlogin.setUserid(userid);
	        		userlogin.setUsername(username);
	        		userlogin.setUserpassword(userpass);
	        	    
					int result1=userloginDao.insert(userlogin);
	        	     System.out.println("user added"+result1);
	        	     
				case 2:
					System.out.println("Enter UserId: ");
	        		int userid1=Integer.parseInt(br.readLine());
	        		System.out.println("Enter user name");
	        		String username1=br.readLine();
	        		System.out.println("Enter user useremail");
	        		String useremail=br.readLine();
	        		System.out.println("Enter user password");
	        		String userpass1=br.readLine();
	        		System.out.println("Enter user confirm password");
	        		String userpass2=br.readLine();
	        		
	        		if(userpass1.equals(userpass2)) {
	        			UserRegistration userRegistration=new UserRegistration();
		        		userRegistration.setUserid(userid1);
		        		userRegistration.setUsername(username1);
		        		userRegistration.setUseremail(useremail);
		        		userRegistration.setUserpassword(userpass1);
		        		userRegistration.setUserconfirpassword(userpass2);
		        	    
						int result2= userRegistrationDao.insert(userRegistration);
		        	     System.out.println("user Registered "+result2);
	        		}
	        		else {
	        			System.out.println("Your password are not same ");
	        			System.out.println("Try once again");
	        		}
				}
				
				
        	     
			
			
			}
			
					
			     
        }
        catch(Exception e) {
        	System.out.println("Invalid Input Try with another one !!!");
        	System.out.println(e.getMessage());
        }
				
			
        ((ClassPathXmlApplicationContext) context).close();
    }
}
