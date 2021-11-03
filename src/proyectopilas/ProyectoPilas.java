/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;


public class ProyectoPilas {

    
    public static void main(String[] args) {
       Pila pila = new Pila();
       //Apilamos Elementos a la pila
       pila.Apilar(new Empleado(10,"Mery","Shelly"));
       pila.Apilar(new Empleado(20,"Coco","Pereyra"));
       pila.Apilar(new Empleado(30,"Federico","Reyes"));
       pila.Apilar(new Empleado(40,"Mimi","King"));
       
       //Imprimimos los elementos de la pila
       System.out.println("PILA DE EMPLEADOS");
       System.out.println("**********************");
       pila.Imprimir();
       System.out.println("**********************");
    }
    
}
