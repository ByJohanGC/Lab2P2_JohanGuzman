/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_johanguzman;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Lab2P2_JohanGuzman {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    static Ciudad t=new Ciudad();
    static ArrayList<Ciudad> ciudad=new ArrayList<Ciudad>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt=0;
        while (opt==0){
            System.out.println("MENU \n"
                    + "1.Agregar Ciudad \n"
                    + "2. Agregar Superheroe \n"
                    + "3. Listar \n"
                    + "4. Historial"
                    + "5. Modificar Villano\n"
                    + "6. Eliminar Ciudad"
                    + "7. Eliminar SuperHeroe \n"
                    + "8.Simulacion \n"
                    + "9. Salir");
            opt=sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Ingrese ID de Ciudad: ");
                    int id=sc.nextInt();
                    System.out.println("Ingrese Nombre de la Ciudad: ");
                    String nom=sc.next();
                    System.out.println("¿Es necesario volar Para llegar ahi? 0: No , 1: Si ");
                    int vuelo=sc.nextInt ();
                    System.out.println("Ingrese nombre del Villano: ");
                    String villano=sc.next();
                    System.out.println("Ingrese nivel del Villano de la Ciudad: ");
                    double nVillano=sc.nextDouble();
                    Ciudad p1=new Ciudad(id,nom,vuelo,villano,nVillano);
                    ciudad.add(p1);opt=0;
         
                    break;
                    
                case 2:
                    
                    break;
            }
            
        }
    }
    
}
