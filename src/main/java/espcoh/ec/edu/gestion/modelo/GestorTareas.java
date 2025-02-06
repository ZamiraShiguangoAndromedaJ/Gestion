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
    private Tarea[] tareas = new Tarea[10]; 
    private int cantidadTareas = 0;
    private int ultimoId = 0;


    public Tarea[] listarTareasPendientes() {
        Tarea[] pendientes = new Tarea[cantidadTareas];
        int contador = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (!tareas[i].completada) {
                pendientes[contador] = tareas[i];
                contador++;
            }
        }
        // Recortar el arreglo al tamaño real
        return recortarArreglo(pendientes, contador);
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
        return recortarArreglo(completadas, contador);
    }

    public void marcarComoCompletada(int id) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].id == id) {
                tareas[i].completada = true;
                break; // Salir del bucle cuando se encuentra
            }
        }
    }

    public int generarNuevoId() {
        ultimoId++;
        return ultimoId;
    }

    private Tarea[] recortarArreglo(Tarea[] arreglo, int nuevoTamano) {
        Tarea[] resultado = new Tarea[nuevoTamano];
        for (int i = 0; i < nuevoTamano; i++) {
            resultado[i] = arreglo[i];
        }
        return resultado;
    }
}

