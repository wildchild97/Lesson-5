
package lesson5;

import TerminalIO.KeyboardReader;
public class MakeStudents {


    public static void main(String[] args) 
    {
        Student s1= new Student();
        Student s2 =new Student ();
        KeyboardReader k=new KeyboardReader();
        
        String name;
        int score;
       
        //get first students information
        name=k.readLine("Eneter the First students name: ");
        s1.setName(name);
        for (int d=1; d<=3; d++)  
        {
            score=k.readInt("Enter the students score: ");
            s1.setScore(d,score);
        }
                
       //get Second students information
        name=k.readLine("Eneter the First students name: ");
        s2.setName(name);
        for (int d=1; d<=3; d++)  
        {
            score=k.readInt("Enter the students score: ");
            s2.setScore(d,score);
        }
        System.out.println(s1);
        System.out.println(s2);
        
        
       //old code
        System.out.println("The average for " + s.getName() +" is " + s.getAverage());
        System.out.println("The top mark for " + s.getName() +" is " + s.getHighscore());
        System.out.println(s);//runs toString automatically
        System.out.println("\n\n----------------\n\n");
        
        
        System.out.println("The average for " + s2.getName() +" is " + s2.getAverage());
        System.out.println("The top mark for " + s2.getName() +" is " + s2.getHighscore());
        System.out.println(s2);//runs toString automatically
        
        System.out.println("\n\n----------------\n\n");
        
       
        
}
}
