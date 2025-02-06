/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestion.modelo;

/**
 *
 * @author sahid
 */
public class GestorTareas {
    public Tarea[] tareas = new Tarea[10];
    public int cantidadTareas = 0;
    public int ultimoId = 0;

    public void agregarTarea(Tarea tarea) {
        if (cantidadTareas < tareas.length) {
            tareas[cantidadTareas] = tarea;
            cantidadTareas++;
        } else {
            System.out.println("Error, ya no hay mas espacio");
        }
    }

    public Tarea[] listarTareasPendientes() {
        Tarea[] pendientes = new Tarea[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (!tareas[i].completada) {
                pendientes[contador] = tareas[i];
                contador++;
            }
        }
        return pendientes;
    }

    public Tarea[] listarTareasCompletadas() {
        Tarea[] completadas = new Tarea[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].completada) {
                completadas[contador] = tareas[i];
                contador++;
            }
        }
        return completadas;
    }

    public void marcarComoCompletada(int id) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].id == id) {
                tareas[i].completada = true;
            }
        }
    }

    public int generarNuevoId() {
        ultimoId++;
        return ultimoId;
    }
}

