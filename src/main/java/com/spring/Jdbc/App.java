package com.spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	
    	// Not Prefered
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Jdbc/NewFile.xml");
        JdbcTemplate template = context.getBean("JdbcTemplate",JdbcTemplate.class);
        
        String q = "INSERT INTO student(id,name,city) values(?,?,?)";
        
        // fire query
        int result = template.update(q,203,"Harshal","pune");
        System.out.println("Rows Affected "+result);
    }
}
