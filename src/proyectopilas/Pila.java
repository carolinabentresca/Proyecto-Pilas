/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;

public class Pila {

    Nodo nodo;

    //Método Apilar elementos a la pila
    public void Apilar(Empleado dato) {
        Nodo nuevo = new Nodo(dato);
        if (nodo == null) {
            nodo = nuevo;
        } else {
            if (dato != null) {
                nuevo.setSig(nodo);
                nodo = nuevo;
            }
        }
    }

    //Método Imprimir elementos de la pila
    public void Imprimir() {
        Nodo x = nodo;
        while (x != null) {
            System.out.println("CÓDIGO: " + x.getDato().getCódigo() + "\nNOMBRE: " + x.getDato().getNombre()
                    + "\nAPELLIDO: " + x.getDato().getApellido() + "\n");
            x = x.getSig();
        }
    }
}
