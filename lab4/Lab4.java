/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author 19101136
 */
public class Lab4 {

    int sum;
    public int y;

    public void methodA() {
        int x = 0, y = 0;
        y = y + 7;
        x = y + 11;
        sum = x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB() {
        int x = 0;
        y = y + 11;
        x = x + 33 + y;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public static void main(String[]args){
        object.methodA();
}
}