
package boletin9_2word;

public class calculo {
    public class SumaProducto {
        
    public void SumaProducto(){
        
        int suma=0;
        double multiplicacion=1;
        for(int i=10;i<91;i++){
            suma+=i;
            multiplicacion*=i;
        }
        
         System.out.println("Suma = "+suma+"\nProducto = "+multiplicacion);
    }
    }
}
