/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author Josué Duque
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        salario sal=new salario();
        sal.show(true);
    }
    
}
class salar{
    int horas,salhora,sal;
    salar(int horas, int salhora){
        this.horas=horas;
        this.salhora=salhora;
    }
    int salariomes(){
        sal=horas*salhora;
        if (sal>450000){
            return sal;
        }
        else{
            return 0;
        }
    }
}