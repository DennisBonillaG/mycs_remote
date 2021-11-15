/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author denni
 */
public class ArbolBin {

    NodoABin raiz;

    public ArbolBin() {
        this.raiz = null;
    }
    
    
    public boolean insertar(Object dato, Object datoPadre) {
        NodoABin padre = this.buscar(datoPadre);
        if (padre != null) {
            try {
                if (padre.enlIzq == null) {
                    padre.enlIzq = new NodoABin(dato);
                    return true;
                } else if (padre.enlDer == null) {
                    padre.enlDer = new NodoABin(dato);
                    return true;
                } else if (padre.enlIzq != null && padre.enlDer != null) {
                    return false;

                }
            } catch (Exception e) {
                return false;
            }

        }
        return false;
    }

    public NodoABin buscar(Object dato) {
        if (this.raiz == null) {
            return null;
        }

        return this.raiz.buscar(dato);
    }
    
    public void imprimir(){
        if(this.raiz != null)
            this.raiz.imprimirPreorden();
    }
    void imprimirSimetrico(NodoABin nodo){
        if(nodo.enlIzq!= null){
            imprimirSimetrico(nodo.enlIzq);
            
        }
        System.out.println(nodo.dato);
        if(nodo.enlDer != null){
            imprimirSimetrico(nodo.enlDer);
        }
        
    }
}
