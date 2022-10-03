
package ejercicio18;


public class IUejemplo2 {

   
    public static void main(String[] args) {
        Formulario fr=new Formulario();
        fr.setVisible(true);
    }
    
}
class salario{
    int horas,vhoras,retefuente,salbruto;
    salario(int retefuente,int salbruto){
        this.horas=horas;
        this.retefuente=retefuente;
        this.vhoras=vhoras;
        this.salbruto=salbruto;
    }
    int calcularsalario(){
        return salbruto-(salbruto*retefuente/100);
    }
}
