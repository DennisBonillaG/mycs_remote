
package arbolbinario;

public class ArbolBinario {

    public static void main(String[] args) {
        ArbolBin a = new ArbolBin();
        a.raiz = new NodoABin("A");
        a.raiz.enlIzq = new NodoABin("C");
        a.raiz.enlDer = new NodoABin("D");
        a.raiz.enlIzq.enlIzq = new NodoABin("E");
        a.raiz.enlIzq.enlDer = new NodoABin("F");
        
        a.imprimir();
        /*
        System.out.println("El valor almacenado en la raiz del arbol es: "+a.raiz.dato);
        System.out.println("El valor almacenado en el enlace izquierdo de la raiz del arbol es: "+a.raiz.enlIzq.dato);
        System.out.println("El valor almacenado en el enlace derecho de la raiz del arbol es: "+a.raiz.enlDer.dato);
        System.out.println("El valor almacenado en el enlace derecho del enlace derecho de la raiz del arbol es: "+a.raiz.enlDer.enlDer.dato);
        */
    }
    
}
