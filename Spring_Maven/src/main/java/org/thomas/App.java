
package org.thomas;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thomas.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        /*
        ->  In this line we created the spring container and the configuration for conatainer
            is mentioned in the "spring.xml"
        ->  Search for 'spring 6 bean configuration xml'.
        ->  Now the spring what are the classes the Spring has to create the Object for
        ->  Object mentioned in xml will be created by this line.
        */
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //When you getBean() it will give you the Object.
        Alien obj1 = (Alien) context.getBean("alien");
        //System.out.println(obj1.getAge());
        obj1.code();



//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.setAge(23);
//        System.out.println(obj2.getAge()+"  obj2");

        Desktop obj3 = context.getBean("desk",Desktop.class);

           */

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();
          //U can mention the method name or names you give along with @Bean
//        Desktop dt2 = context.getBean("desk",Desktop.class);
//        dt2.compile();

        Alien a1 = context.getBean(Alien.class);
        System.out.println(a1.getAge());
        a1.code();



    }
}
