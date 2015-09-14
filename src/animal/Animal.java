/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Using the methods of a class with an object
//not absolutely necessary to always build a class from scratch.
package animal;

/**
 *
 * @author HP
 */
public class Animal {
String name;
 int age;
 String Type;
 
 public void setAge(int animalage)
{
    //Instantiating a class
    int Age = animalage; 
    
}
 //Creating a class constructor
public int getAge()
{
    int Age = 0;
    System.out.println(age);
return Age; 
}

public void setName(String Animalname)
{ 
    String Name = Animalname;
}
public String getName()
{ 
    String Name = "Bosco";
    System.out.println(name);
return Name; 
 
}
public void setatype(String Animaltype)
{ 
    String atype = Animaltype;
}
public String getType()
{ 
    String atype = "Dog";
    System.out.println(atype);
return atype; 
}

    private static class Animals {

        public Animals() {
        }
    }

class mamals extends Animals
{ 
   public void setvebaviour(String warmblood)
{ 
    String vebaviour = warmblood;
}
public String getvehaviour()
{ 
    String vebaviour = "warmblooded";
    System.out.println(vebaviour);
return vebaviour; 
 
}
    
 

 public void setbirth(String giveBirth)
{ 
    String birth = giveBirth;
}
public String getbirth()
{ 
    String birth = "givesbirth";
    System.out.println(birth);
return birth; 
 
}


}


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
