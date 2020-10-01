package ufm.cis.jayani;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ufm.cis.jayani.di.House;

public class SpringDependencyExample {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContextWoodenDoor.xml");

        House house = (House) appContext.getBean("wooden");
        house.constructHouse();
    }
}
