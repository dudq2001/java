/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MH
 */
public class Circles {
    private double radius;
 public Circles(double radius){
    this.radius=radius;
    }
 public String toString(){
 return radius+"";}
 
public double getRadius(){
return radius;
}
public void setRadius(double radius){
radius=radius;
}
public double getArea(){
    return radius*radius*Math.PI;
}
public double getCircumference(){
 return 2*radius*Math.PI;
}

}

