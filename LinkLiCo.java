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
public class LinkLiCo {
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        li.add(24);
        li.add(36);
        li.add(12);
        li.add(9);
        System.out.println("List: "+li);
        Iterator it = li.iterator();
        System.out.println("Iterator");
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        System.out.println("For each loop");
        for(Integer i: li)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("Reverse");
        ListIterator lit = li.listIterator(li.size());
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous()+" ");
        }
        Collections.addAll(li,56,38,13,11,10,38);
        System.out.println("List: "+li);
        li.set(1,38);
        System.out.println("Updated list "+li);
        System.out.println("Index "+li.get(3));
        System.out.println("First Occurence "+li.indexOf(38));
        System.out.println("Last Occurence: "+li.lastIndexOf(38));
    }
}
