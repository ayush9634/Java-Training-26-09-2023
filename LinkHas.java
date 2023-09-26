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
public class LinkHas {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(57);
        ls.add(32);
        ls.add(2);
        ls.add(12);
        ls.add(22);
        Set<Integer> s1 = new LinkedHashSet(ls);
        System.out.println(s1);
        boolean value1 = ls.remove(22);
        System.out.println(value1);
        System.out.println("removed: "+ls);
    }
}
