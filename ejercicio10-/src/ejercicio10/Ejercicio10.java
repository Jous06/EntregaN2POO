/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Josué Duque
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora cal=new calculadora();
        cal.show(true);
    }
    
}
class matricula{
    double estrato,patrimonio;
    matricula(double estrato,double patrimonio){
        this.estrato=estrato;
        this.patrimonio=patrimonio;
    }
    double pago(){
        if(patrimonio>2000000 && estrato>3){
            return (50000+(patrimonio*0.03));
        }
        else{
            return 50000;
        }
    }
}