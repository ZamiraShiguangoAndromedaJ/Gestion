/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestion.modelo;

/**
 *
 * @author sahid
 */
public class Tarea {
    int id;
    private String titulo;
    private String descripcion;
    boolean completada;
    
    public Tarea(int id, String titulo, String descripcion, boolean completada){
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.completada=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
}
