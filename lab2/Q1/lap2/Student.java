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
public class Student extends Person 
{
  final String status1 = "Freshman";
    final String status2 = "Sophomore";
    final String status3 = "Junior";
    final String status4 = "Senior";
    public Student(String n, String a, String p, String e) {
        super(n, a, p, e);
    }

    public String toString() {
        return name + " Student";
    }

   
}
