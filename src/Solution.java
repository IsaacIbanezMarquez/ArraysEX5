import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {

        Scanner leer = new Scanner(System.in);


        Alumno a[] = new Alumno[10];
        /*
        a[0].setMatricula(12);
        a[0].setNombre("Juan");

        a[0].getMatricula();
        */

        String nombre = "";
        int matricula = 0;
        char grupo = ' ';
        int grado = 0;



        for( int i = 0; i < a.length; i++)
        {
            System.out.println("Ingresa tu Nombre");
            nombre = leer.nextLine();

            System.out.println("Ingresa tu Matricula");
            matricula = leer.nextInt();
            System.out.println("Ingresa tu Grupo");
            grupo = leer.next().charAt(0);
            System.out.println("Ingresa tu Grado");
            grado = leer.nextInt();
            leer.nextLine();

        }





    }
}
