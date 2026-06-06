package SpringFramework.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/SpringPractice/StudentConfi.xml");
        StudentInfo s  = (StudentInfo) context.getBean("StudentInfo");
        System.out.println(s);
    }
}
