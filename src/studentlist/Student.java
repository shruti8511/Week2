package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {

    private String name;
    private int ID;
    private String DOB;
    private int maxHrs;

 
    public Student()
    {
        name = "Name Not Set";
        ID = 0;
    }
    public Student(String givenName, int givenID)
    {
          this.name = givenName;
          this.ID = givenID;
    }
    public void setName(String givenName)
    {
       this.name = givenName;
    }
    
    public String getName()
    {
           return name;
    }
    
    public void setID (int givenID)
    {
        this.ID = givenID;
    }
    
    public int getID ()
    {   
        return ID;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDOB() {
        return DOB;
    }
        public void setMaxHrs(int maxHrs) {
        this.maxHrs = maxHrs;
    }

    public int getMaxHrs() {
        return maxHrs;
    }
       @Override
    public String toString() {
        return "Student{" + "maxHrs=" + maxHrs + '}';
    }    
}
