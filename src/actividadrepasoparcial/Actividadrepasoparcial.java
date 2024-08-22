
package actividadrepasoparcial;
import java.util.Scanner;


public class Actividadrepasoparcial {

   
    public static void main(String[] args) { // notas con for y if y porcentajes
         Scanner entrada = new Scanner(System.in);
         
         double a,b=0,c,d=0;
         
         for (int i = 1; i <= 5; i++) {
             System.out.print("Ingrese una nota:");
             a= entrada.nextDouble();
             
             b++;
             
             if (b==1){
                 c=(a*0.20);
                 d=d+c;// d es el acumulador 
                 
             }
             if (b==2){
                 c=(a*0.15);
                 d=d+c;
                 
             }
             if (b==3){
                 c=(a*0.10);
                 d=d+c;
             }
             if (b==4){
                 c=(a*0.25);
                 d=d+c;
                 
                
             }
             
             if (b==5){
                 
                 c=(a*0.30);
                 d=d+c;
                 
                 
                 
             
            
        }
         
         
       
    }
         System.out.println(+ d );
    
}
}