/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac;

/**
 *
 * @author 91969
 */
/*
1
2
Given the length of 3 sides of a triangle, check whether the triangle is valid or not. 
(Implement using Parameterized Constructor)
Input Format
First and only line of input contains three integers A, B, C - length of sides of the triangle.
Constraints
1 <= A, B, C <= 109
Output Format
Print "Yes" if you can construct a triangle with the given three sides, "No" otherwise.
Sample Input 0
4 3 5
Sample Output 0
Yes
*/
import java.util.*;
class Tri
{
    void check(int a , int b , int c)
    {
        if(a+b>c || b+c>a || a+c>b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
public class Triangle {
    public static void main(String[] args) {
        Tri obj = new Tri();
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();
        obj.check(a, b, c);
        
    }
}
