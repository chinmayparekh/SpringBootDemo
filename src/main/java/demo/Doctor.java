package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")//singleton-one object for a class,prototype-new object when the container is accessed
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    //    private Nurse nurse;
    public void assist() {
        System.out.println("Doctor is assisting");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name method is called");
    }

    //    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct method is called");
    }

}
