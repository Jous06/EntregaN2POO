
package ejercicio19;

import java.lang.Math;
public class Ejercicio19 {


    public static void main(String[] args) {
        equilatero eq=new equilatero();
        eq.show(true);
        

    }
    
}
class triangulo{
    double lado,altura;
    triangulo(double lado,double altura){
        this.lado=lado;
        this.altura=altura;
    }
    double perimetro(){
        return lado*3;}
    double area(){
        return (lado*altura)/2;
    
    }
    
}