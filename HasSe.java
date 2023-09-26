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
public class HasSe {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(12);
        s1.add(10);
        s1.add(25);
        System.out.println("Set1: "+s1);
        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(25);
        s2.add(56);
        s2.add(33);
        System.out.println("Set2: "+s2);
        s1.retainAll(s2);
        System.out.println("Intersect: "+s1);
        s2.addAll(s1);
        System.out.println("Union: "+s2);
    }
}
