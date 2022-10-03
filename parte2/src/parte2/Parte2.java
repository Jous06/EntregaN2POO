/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte2;

/**
 *
 * @author Josué Duque
 */
public class Parte2 {

    public static void main(String[] args) {
        part2 pa=new part2();
        pa.show(true);
    }
    
}

class circulo {
    int radio;
    circulo(int radio){
         this.radio=radio;
    }
    double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    double calcularPerimetro(){
        return Math.PI*2*radio;
    }
}
class rectangulo {
    int base;
    int altura;
    rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;}
    double calcularArea(){
        return base*altura;}
    double calcularPerimetro(){
        return (2*base)+(2*altura);}
}
class cuadrado {
    int lado;
    cuadrado(int lado){
        this.lado=lado;}
    double calcularArea(){
        return Math.pow(lado,2);}
    double calcularPerimetro(){
        return 4*lado;}
}
class triangulorectangulo {
    int base,altura;
    triangulorectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;}
    double calcularArea(){
        return (base*altura)/2;}
    double calcularPerimetro(){
        return base+altura+calcularHipotenusa();}
    double calcularHipotenusa(){
        return Math.pow((base*base)+(altura*altura),0.5);}
    String determinarTipoTriangulo(){
        if ((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())){
            return ("Equilatero");}
        else if ((base!=altura)&&(altura!=calcularHipotenusa())&&(base!=calcularHipotenusa())){
            return ("Escaleno");}
        else
            return ("Escaleno");}
    }
    
class rombo{
    int dma,dme;
    rombo(int dma, int dme){
        this.dma=dma;
        this.dme=dme;}
    double calcularArea(){
        return (dma*dme)/2;
    }
    double calcularPerimetro(){
        return 2*(Math.sqrt(Math.pow(dma,2)+Math.pow(dme,2)));
    }
}
class trapecio{
    int bmayor,bmenor,altura,lado1,lado2;
    trapecio(int bmayor, int bmenor,int altura,int lado1, int lado2){
        this.bmayor=bmayor;
        this.bmenor=bmenor;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;}
    double calcularArea(){
        return (bmayor+(bmenor*altura)/2);
    }
    double calcularPerimetro(){
        return bmayor+bmenor+altura+lado1+lado2;
    }
}