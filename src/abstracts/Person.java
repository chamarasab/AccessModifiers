package abstracts;

public abstract class Person {
    public String fn;
    public String sn;
    public abstract void setname(String fn,String sn);
    
    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public abstract void getName();
}
