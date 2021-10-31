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
public class Staff extends Employee 
{
   String title;

    public Staff(String n, String a, String p, String e, String o, double s, String t)
    {
        super(n, a, p, e, o, s);
        title = t;
    }

    
    

 
    

    public String toString() {
        return name + " Staff";
    }
 
}
