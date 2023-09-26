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
public class LinkImpUsingQ {
    public static void main(String[] args) {
        Queue<Integer> qi = new LinkedList<>();
        qi.add(28);
        qi.add(56);
        qi.add(12);
        qi.add(7);
        System.out.println("Queue "+qi);
        System.out.println("Top Value: "+qi.peek());//Displays the first element in list
        int s1 = qi.poll(); //Removes the value from front.
        System.out.println("Removed Element: "+s1);
        System.out.println("After Removal: "+qi);
        qi.offer(97); //Adds the value at backside.
        System.out.println(qi);
      
    }
}  
