/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio41;

import java.lang.Math;

public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        resultado resul=new resultado();
        resul.show(true);
    }
    
}
class mayor{
    int a,b,c,d,m1,m2;
    mayor(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    int calcularmayor(){
        m1=Math.max(a, b);
        m2=Math.max(c, d);
        return Math.max(m1, m2);
    }
    
}