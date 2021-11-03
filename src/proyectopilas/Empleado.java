/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;


public class Empleado {
    private int código;
    private String nombre;
    private String apellido;

    public Empleado() {
    }

    public Empleado(int código, String nombre, String apellido) {
        this.código = código;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
