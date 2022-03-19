
package calculadora;

import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("ingrese el primer numero a operar");
        int pnumero = lectura.nextInt();
        System.out.println("ingrese el segundo numero a operar");
        int snumero = lectura.nextInt();
        
        Suma Suma1=new Suma();
        System.out.println(Suma1.sumar(pnumero, snumero));
        
        System.out.println(Suma1.restar(pnumero, snumero));
        
        System.out.println(Suma1.multiplicar(pnumero, snumero));
        
        System.out.println(Suma1.dividir(pnumero, snumero));
        
      

    }
    
}
        