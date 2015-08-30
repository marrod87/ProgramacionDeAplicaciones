/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author joaco
 */
public class DataPromocional {
    private boolean DataActiva;
    private double DataDescuento;
    private String DataNombre;
    private String DataDescripcion;
    private double DataPrecio;
    private String DataImagen;
    //deveria tener una lista de DataIndividual los cuales componen la promo...
    
    public DataPromocional(boolean activa, double descuento, String nombre, String descripcion, double precio, String imagen/*aca podria ir una lista de dataindividual*/){
        this.DataActiva = activa;
        this.DataDescuento = descuento;
        this.DataNombre = nombre;
        this.DataDescripcion = descripcion;
        this.DataPrecio = precio;
        this.DataImagen = imagen;
        //y pasarsela obviamente
    }
    
    public void setActiva(boolean activa){
        this.DataActiva = activa;
    }
    
    public boolean getActiva(){
        return DataActiva;
    }

    public String getDataNombre() {
        return DataNombre;
    }

    public void setDataNombre(String DataNombre) {
        this.DataNombre = DataNombre;
    }

    public String getDataDescripcion() {
        return DataDescripcion;
    }

    public void setDataDescripcion(String DataDescripcion) {
        this.DataDescripcion = DataDescripcion;
    }

    public double getDataPrecio() {
        return DataPrecio;
    }

    public void setDataPrecio(double DataPrecio) {
        this.DataPrecio = DataPrecio;
    }

    public String getDataImagen() {
        return DataImagen;
    }

    public void setDataImagen(String DataImagen) {
        this.DataImagen = DataImagen;
    }
    
    public void setDescuento(double descuento){
        this.DataDescuento = descuento;
    }
    
    public double getDescuento(){
        return DataDescuento;
    }
    
    /*aca podriamos agregar uno x uno o pasarle un contenedor con los datos ya cargados
    y tambien devolverlos*/
}
