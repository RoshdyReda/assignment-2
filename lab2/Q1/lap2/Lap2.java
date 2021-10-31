/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

/**
 *
 * @author AL MASA
 */
public class Lap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Person prs = new Person("roshdy","mania","011548917","rrcjkj@gmail");
        System.out.println(prs.toString());

        Student sdt = new Student("ahmed","mania","011548917","rrcjkj@gmail" );
        System.out.println(sdt.toString());

        Employee em = new Employee
        ("khaled","mania","011548917","rrcjkj@gmail",3000);
        System.out.println(em.toString());

        Faculty fa = new Faculty 
               ("anwer","mania","011548917","rrcjkj@gmail",3000,15,350 );
        System.out.println(fa.toString());

        Staff st = new Staff
        ("ali","mania","011548917","rrcjkj@gmail",3000,"sacnd");
               
        System.out.println(st.toString()); 
    }
    
}
