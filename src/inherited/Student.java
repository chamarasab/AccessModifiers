package inherited;
import abstracts.*;

public class Student extends Person{

    @Override
    public void setname(String fn, String sn) {
        super.fn = fn;
        super.sn = sn; 
    }

    @Override
    public void getName() {
        System.out.println("Name : " + getFn() + " " + getSn());
    }
    
}
