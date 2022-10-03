/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio40;

/**
 *
 * @author Josué Duque
 */
public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encontrar enc=new encontrar();
        enc.show(true);
    }
    
}
class operaciones{
    double a;
    operaciones(double a){
    this.a=a;}
    double raizcuadrada(){
        return Math.sqrt(a);
    }
    double cuadrado(){
        return Math.pow(a, 2);
        
    }
    double cubo(){
        return Math.pow(a, 3);
        
    }
}