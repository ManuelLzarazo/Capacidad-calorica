package capacidadcalorica;

import java.util.Scanner;

public class Capacidadcalorica {

 
    public static void main(String[] args) {

      
            Scanner Teclado =new Scanner(System.in);

        double Cantidad =0;

        double CalorEspecifico =0;

        double TempF =0; 

        double TempI =0;
        
        double CantEnergia =0;

         
    System.out.println("Diguite la cantidad de material");

            Cantidad = Teclado.nextInt();
       

    System.out.println("Digite el calor específico de ese material");

            CalorEspecifico = Teclado.nextInt();

          

    System.out.println("Digite la temperatura final del agua");

            TempF = Teclado.nextInt();

         System.out.println("Diguite la tempera inicial del agua");

            TempI = Teclado.nextInt();
 
       
        CantEnergia = (double)(Cantidad*CalorEspecifico*(TempF-TempI));

       
     System.out.print("La cantidad de energia necesaria es:"+CantEnergia);

     System.out.print("Grados centigrados:");


}

    }