package ejercios_clase;
/**
 *
 * @author yadir
 */
import java.util.*;
public class Ejercios_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota1=0, i, n; 
        int nota2, nota;
       // String Nombre;
       Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantas notas desea procesar: ");
         n=entrada.nextInt();
        //String nombre=entrada.nextLine();
        if (n > 0){
            System.out.println("Ingrese el nombre del alumno:");
            String nombre=entrada.nextLine();
            for( i=1; i<=n; i++){
                System.out.println("Ingrese la   nota  " + i +": ");
                nota=entrada.nextInt();
                nota1=(nota+nota);
             }
            nota2=(nota1/n);
            System.out.println("El promedio del alumno es: "+ nota2);
        }
    }
}
