/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestion.controlador;

import espcoh.ec.edu.gestion.Vista.Vista;
import espcoh.ec.edu.gestion.modelo.GestorTareas;
import espcoh.ec.edu.gestion.modelo.Tarea;

/**
 *
 * @author user
 */
public class Controlador {
    
    public GestorTareas gestor; 
    public Vista vista;         

    // Constructor: Inicializa el Modelo y la Vista
    public Controlador() {
        gestor = new GestorTareas();
        vista = new Vista();
    }

    // Método principal que inicia la aplicación
    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu(); 
            procesarOpcion(opcion);      
        } while (opcion != 4); 
    }


    public void agregarTarea() {
        String[] datosTarea = vista.solicitarDatosTarea(); 
        int nuevoId = gestorTareas.generarNuevoId();             
        Tarea tarea = new Tarea(nuevoId, datosTarea[0], datosTarea[1]);
        gestor.agregarTarea(tarea);                      
    }

    
    public void listarTareasPendientes() {
        Tarea[] pendientes = gestor.listarTareasPendientes();
        vista.mostrarTareas(pendientes, "Pendientes");
    }

    // Lista tareas completadas
    public void listarTareasCompletadas() {
        Tarea[] completadas = gestor.listarTareasCompletadas();
        vista.mostrarTareas(completadas, "Completadas");
    }
    }
    
    
    

   
    
    
    
    
    
    
    
}
