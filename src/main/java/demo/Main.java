package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Doctor doc = (Doctor) context.getBean("doc");//instead of Doctor.class "doc" would also work after type casting
////        Doctor doc = new Doctor();
//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();
//        doc.assist();
        Doctor doc = context.getBean(Doctor.class);
        doc.assist();
        doc.setQualification("MBBS");
        System.out.println(doc);

        Doctor doc2 = context.getBean(Doctor.class);
        System.out.println(doc2);
//        doc.getNurse().assist();
    }

}
