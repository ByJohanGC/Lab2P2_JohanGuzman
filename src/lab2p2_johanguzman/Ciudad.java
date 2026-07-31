/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_johanguzman;

/**
 *
 * @author DELL
 */
public class Ciudad {
    int id;String nombre;boolean vuelo;String villano;double nVillano;

    
    public Ciudad(){
        
    }
    public Ciudad(int id,String nombre,boolean vuelo,String villano,double nVillano){
        this.id=id;this.nombre=nombre;this.vuelo=vuelo;this.villano=villano;this.nVillano=nVillano;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getVuelo() {
        return vuelo;
    }

    public void setVuelo(boolean vuelo) {
        this.vuelo = vuelo;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public double getnVillano() {
        return nVillano;
    }

    public void setnVillano(double nVillano) {
        this.nVillano = nVillano;
    }
    public String toString(){
        return "Id: "+id+ " Nombre: "+ nombre+ " Vuelo: "+vuelo+" Villano: "+villano+" Nivel Villano: "+nVillano +"%";
    }
}
