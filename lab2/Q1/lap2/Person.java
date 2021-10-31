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
public class Person 
{
   String name;
    String address;
    String phone_number;
    String email_address;

    public Person() {

    }
    public Person(
            String n, String a, String p, String e) {
        name = n;
        address = a;
        phone_number = p;
        email_address = e;
    }

    public String toString() {
        return  name + " Person";
    } 
}
