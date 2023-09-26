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
public class LinkImpUsingDQ {
    public static void main(String[] args) {
        Deque<String> ds = new LinkedList<>();
        ds.add("Hi");
        ds.add("Hello");
        ds.add("Java");
        ds.add("Programming");
        ds.add("Language");
        System.out.println("Deque Value: "+ds);
        ds.removeFirst(); //Removes first value.
        System.out.println("Remaining Values: "+ds);
        ds.removeLast(); //Removes last value.
        System.out.println("Remaining Values: "+ds);
    }
}
