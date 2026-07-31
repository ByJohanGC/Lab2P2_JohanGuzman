/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_johanguzman;

 
public class SuperHeroe {
    int id;String Apodo;String nombre;String descrip;boolean vuelo;double[]nHabilidades;double nPoder;

    
    public SuperHeroe(){
        
    }
    public SuperHeroe(int id,String Apodo,String nombre,String descrip,boolean vuelo,double[]nHabilidades,double nPoder){
        this.id=id;this.Apodo=Apodo;this.nombre=nombre;this.descrip=descrip;this.vuelo=vuelo;this.nHabilidades=nHabilidades;this.nPoder=nPoder;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean getVuelo() {
        return vuelo;
    }

    public void setVuelo(boolean vuelo) {
        this.vuelo = vuelo;
    }

    public double[] getnHabilidades() {
        return nHabilidades;
    }

    public void setnHabilidades(double[] nHabilidades) {
        this.nHabilidades = nHabilidades;
    }

    public double getnPoder() {
        return nPoder;
    }

    public void setnPoder(double nPoder) {
        this.nPoder = nPoder;
    }
    public String toString(){
        return "Indice"+id+" "+"Apodo: "+Apodo+" "+"Nombre: "+nombre+"Vuelo: "+vuelo+" "+ "Defensa: "+nHabilidades[0]+" "+"Agilidad: "+nHabilidades[1]+" "+"Carisma: "+nHabilidades[2]+" "+"Inteligencia: "+nHabilidades[3]+" "+"Ataque: "+nHabilidades[4];
    }
    
}
