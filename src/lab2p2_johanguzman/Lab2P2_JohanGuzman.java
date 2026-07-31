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
    static SuperHeroe t1=new SuperHeroe();
    static ArrayList<SuperHeroe> superheroe=new ArrayList<SuperHeroe>();
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
                    AgregarCiudad(ciudad);opt=0;
         
                    break;
                    
                case 2:
                    AgregarSuperHeroe(superheroe);opt=0;
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }
            
        }
    }
    public static void AgregarCiudad(ArrayList<Ciudad> ciudad){
        boolean t=false;int id=0; boolean vuelo=false;
        while(t==false){
            System.out.println("Ingrese ID de Ciudad: ");
            id=sc.nextInt();int index=-1;
            for(int x=0;x<ciudad.size();x++){
                if(id==ciudad.get(x).getId()){
                    index=x;
                }
            }
            if(index==-1){
                t=true;
            }else{
            System.out.println("ID Ya existe");
        }
        }
           
            System.out.println("Ingrese Nombre de la Ciudad: ");
            String nom=sc.next();
            t=false;
            while(t==false){
                System.out.println("¿Es necesario volar Para llegar ahi? 0: No , 1: Si ");
                int tvuelo=sc.nextInt ();
                if(tvuelo==0){
                    vuelo=false;t=true;
                }else if(tvuelo==1){
                    vuelo=true;t=true;
                }else{
                    System.out.println("Ingrese Un valor correcto");
            }
            }
            
            System.out.println("Ingrese nombre del Villano: ");
            String villano=sc.next();
            t=false;double nVillano=0;
            while(t==false){
                System.out.println("Ingrese nivel del Villano de la Ciudad: (1-100)");
                nVillano=sc.nextDouble();
                if(nVillano>=0&&nVillano<=100){
                    t=true;
                }else{
                    System.out.println("Ingrese nivel correcto");
                    
                }
            }
            
            Ciudad p1=new Ciudad(id,nom,vuelo,villano,nVillano);
            ciudad.add(p1);
        
        
    }
    public static void AgregarSuperHeroe(ArrayList<SuperHeroe> superheroe){
        double []rHabilidades=new double[5];boolean t=false;int id=0;
        while(t==false){
            System.out.println("Ingrese ID de SuperHeroe: ");
            id=sc.nextInt();int index=-1;
            for(int x=0;x<superheroe.size();x++){
                if(id==superheroe.get(x).getId()){
                    index=x;
                }
            }
            if(index==-1){
                t=true;
            }else{
            System.out.println("ID Ya existe");
        }
        }
        
        System.out.println("Ingrese Apodo: ");
        String apodo=sc.next();
        System.out.println("Ingrese el Nombre: ");
        String nombre=sc.next ();
        System.out.println("Ingrese Descripcion:  ");
        String descrip=sc.next();
        t=false;boolean vuelo=false;
        while(t==false){
            System.out.println("Ingrese Capacidad de Vuelo: true/false:  ");
            vuelo=sc.nextBoolean();
            if(vuelo==true){
                t=true;
            }else if(vuelo==false){
                t=true;
            }else{
                t=false;
            }
        }
        
        for(int x=0;x<rHabilidades.length;x++){
            if(x==0){
                rHabilidades[x]=r.nextInt(0,101)*0.20;
            }else if(x==1){
                rHabilidades[x]=r.nextInt(0,101)*0.15;
            }else if(x==2){
                rHabilidades[x]=r.nextInt(0,101)*0.10;
            }else if(x==3){
                rHabilidades[x]=r.nextInt(0,101)*0.30;
            }else if(x==4){
                rHabilidades[x]=r.nextInt(0,101)*0.25;
            }
            
        }
        t=false;int nPoder=0;
        while(t==false){
            System.out.println("Nivel de Poder: ");
            nPoder=sc.nextInt();
            if(nPoder>=0 && nPoder<=100){
                t=true;
            }else{
                System.out.println("Ingrese valor correcto");
            }
        }
        
        
        SuperHeroe p1=new SuperHeroe(id,apodo,nombre,descrip,vuelo,rHabilidades,nPoder);
    }
    public static void ListarCiudades(ArrayList<Ciudad> ciudad){
        String temp="";
        for(int x=0;x<ciudad.size();x++){
            temp+=ciudad.get(x).getId();
            temp+=ciudad.get(x).getNombre();
            temp+=ciudad.get(x).getVuelo();
            temp+=ciudad.get(x).getVillano();
            temp+=ciudad.get(x).getnVillano();
            temp+=" \n";
        }
        System.out.println(temp);
    }
    public static void ListarSuperHeroes(ArrayList<SuperHeroe> superheroe){
        String temp="";
        for(int x=0;x<superheroe.size();x++){
            temp+=superheroe.get(x).getId();
            temp+=superheroe.get(x).getApodo();
            if(superheroe.get(x).getnPoder()>80){
                temp+="SECRETO";
            }else{
                temp+=superheroe.get(x).getNombre();
            }
            temp+=superheroe.get(x).getVuelo();
            temp+=superheroe.get(x).getnHabilidades();
            temp+=superheroe.get(x).getnPoder();
            temp+=" \n";
        }
        System.out.println(temp);
    }
}
