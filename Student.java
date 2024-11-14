class Student extends Person{
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class’ constructor 
         super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;}
    
    // Setters
    public void setIdNum(String idNumber){
        myIdNum = idNumber; 
    }
    public void setGPA(double GPA){
        GPA = myGPA;
    }

    // Getters
    public String getIdNum(){
        return myIdNum;
    }
    public double getGPA(){
        return myGPA;
    }

}
