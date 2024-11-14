public class CollegeStudent extends Student{
    protected String myMajor; 
    protected int myYear;

    //constructor 
    CollegeStudent (String name, int age, String gender, String idNum, double gpa, String major, int year ){
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }
    // Setters
    public void setMyMajor(String major){
        myMajor = major;
    }
    public void setMyYear(int year){
        myYear = year;
    }
    // Getters
    public String getMajor(){
        return myMajor;
    }
    public int getYear(){
        return myYear;
    }

    @Override
    public String toString(){
        return super.toString() +", Major: "+ myMajor +", Year: "+ myYear;
    }
}
