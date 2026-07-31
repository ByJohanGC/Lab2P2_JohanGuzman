/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_johanguzman;

/**
 *
 * @author DELL
 */
public class Historial {
    String ciudad;String villano;String suceso;String superheroe;

    
    public Historial(){
        
    }
    public Historial(String ciudad,String villano,String suceso,String superheroe){
        this.ciudad=ciudad;this.villano=villano;this.suceso=suceso;this.superheroe=superheroe;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public String getSuceso() {
        return suceso;
    }

    public void setSuceso(String suceso) {
        this.suceso = suceso;
    }

    public String getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(String superheroe) {
        this.superheroe = superheroe;
    }
}
