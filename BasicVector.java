/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colllection;

/**
 *
 * @author E-LAB-PC28
 */
import java.util.*;
public class BasicVector {
    public static void main(String[] args) {
        Vector<String> vs = new Vector<>();
        vs.add("Ayush");
        vs.add("Amritansh");
        vs.add("Aman");
        vs.add("Ayushi");
        vs.add("Arun");
        vs.add("Tyagi");
        System.out.println("Vector values: "+vs);
        vs.set(5, "Akshay");
        Iterator it = vs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        Vector<String>s2 = new Vector<>();
        s2.addAll(vs);
        System.out.println("Another Vector: "+s2);
        System.out.println("Index: "+s2.indexOf("Aman"));
        
    }
}
