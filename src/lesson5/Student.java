package lesson5;


public class Student {
    //instance variables
    private String name;
    private int test1,test2,test3;
    
    //constructor
    //this code inisalizes an object by setting the  properties
    //this code runs whenever you type new in another class
    public Student(){
        name="";
        test1=0;
        test2=0;
        test3=0; 
    }
    
    public Student(String n, int t1, int t2, int t3)
    {
        name=n;
        test1=t1;
        test2=t2;
        test3=t3;
    }
    
    //This constructor allows us to clone an existing student
    public Student(Student other)
    {
        name= other.name;
        test1=other.test1;
        test2=other.test2;
        test3=other.test3;
    }
    //instance methods
    //these define the students abilities
    //because name is private we need methods to gain access
    
    public void setName(String aname)
    {
        name=aname;
    }
    public String getName()
    {
        return name;
    }
    //all setter methods are usually void
    //their job is to set a property of your object
    //all getter methods are not void and dont need a perameter
    //they are set to the type of data being returned
    //because name is a String, getname is Public String
    
    public void setScore(int test, int score)
    {
        if (test==1) test1=score;
        else if (test==2) test2=score;
        else test3=score;
    }
    public int getScore(int whichone)
    {
        if (whichone==1) return test1;
        else if (whichone==2) return test2;
        else return test3;
    }
    public int getAverage()
    {
        return (test1+test2+test3)/3;
    }
    public int getHighscore()
    {
        int resault=test1;
        if (test2>resault) resault=test2;
        else if  (test3> resault) resault=test3;
        return resault;     
    }
    //toString is a common method in most classes
    //it runs automatically when you print an object
    public String toString()
    {
        String resault;
        resault= "Name:\t" + name;
        resault+= "\nTest 1:\t" + test1;
        resault+= "\nTest 2:\t" + test2;
        resault+= "\nTest 3:\t" + test3;
        resault+= "\n------------";
        resault+= "\nAverage: " + getAverage();
        return resault;
     }
}
