class Person {

    protected String myName ; // name of the person 
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female
    
    public Person(String name, int age, String gender)
    {
        myName = name; myAge = age ; myGender = gender; 
    }

    // Setters
    public void setMyName(String name){
        myName = name;
    }
    public void setMyAge(int age){
        myAge = age;
    }
    public void setMyGender(String gender){
        myGender = gender;
    }

    // Getters
    public String getName(){
        return myName;
    }
    public int getAge(){
        return myAge;
    } 
    public String getGender(){
        return myGender;
    }

    @Override
    public String toString()
    { 
        return myName + ", age: " + myAge + ", gender: " +myGender; 
    }
}   