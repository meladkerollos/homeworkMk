package homeWork;

import javax.xml.namespace.QName;

public class Student {
    private String name;
    private  int age;
    private  int grade;
    public Student ( String name , int age,  int grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }
    public void setAge( int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGrade( int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }

}
