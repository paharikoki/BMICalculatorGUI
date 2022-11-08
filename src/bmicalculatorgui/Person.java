/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculatorgui;

/**
 *
 * @author alanlestari28
 */
public class Person {
    double weight,height,result;
    String name;
    
    void calculateBMI(){
        result = weight / height * height;
    }
}
