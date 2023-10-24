/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_10;

/**
 *
 * @author HP
 */
public class Smartphone implements Camara, ReproductorDeMusica, NavegadorDeInternet{
    public String marca;
    public String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void grabarVideo(){
        System.out.println("Grabar video");
    }
        
    @Override
    public void tomarFoto(){
        System.out.println("Tomar foto");
    }
    
    @Override
    public void reproducir(){
        System.out.println("Reproducir música");
    }
    
    @Override
    public void detener(){
        System.out.println("Detener música");
    }
    
    @Override
    public void buscar(){
        System.out.println("Buscar");
    }
    
    @Override
    public void actualizar(){
        System.out.println("Actualizar pestaña");
    }
}
