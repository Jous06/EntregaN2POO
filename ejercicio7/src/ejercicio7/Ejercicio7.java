/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;


public class Ejercicio7 {

    public static void main(String[] args) {
        mayor ma=new mayor();
        ma.show(true);
        
        
    }
    
}
class mayo{
    int a,b;
    mayo(int a,int b){
        this.a=a;
        this.b=b;
        
    }
    String calcular(int a,int b){
        if(a<b){
            return("A es menor a B");
        }
        else if (a>b){
            return("A es mayor a B");
        }
        else{
            return("A es igual a B");
        }
    }
}