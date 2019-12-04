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
public class trace3 {

    public int sum;
    public int y;

    public void methodA() {
        int x = 2, y = 3;
        int[] msg = new int[1];
        msg[0] = 3;
        y = this.y + msg[0];
        methodB(msg, msg[0]);
        x = this.y + msg[0];
        sum = x + y + msg[0];
        System.out.println(x + " " + y + " " + sum);
    }

    private void methodB(int[] mg2, int mg1) {
        int x = 0;
        y = this.y + mg2[0];
        x = x + 33 + mg1;
        sum = sum + x + y;
        mg2[0] = y + mg1;
        mg1 = mg1 + x + 2;
        System.out.println(x + " " + y + " " + sum);
    }

    public static void main(String[] args) {
        trace3 obj = new trace3();
        obj.methodA();
        obj.methodA();
        obj.methodA();
        obj.methodA();
        obj.methodA();
        
    }
}
