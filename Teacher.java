

public class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Setters 
    public void setSubject(String subject){
        mySubject = subject;
    }
    public void setSalary(double salary){
        mySalary = salary;
    }

    // Getters
    public String getSubject(){
        return mySubject;
    }
    public double getSalary(){
        return mySalary;
    }
    @Override
    public String toString(){
        return super.toString() +" Subject: "+ mySubject +" Salary: "+ mySalary;
    }

}
