package arbolbinario;

public class NodoABin {

    Object dato;
    NodoABin enlIzq, enlDer;

    public NodoABin(Object dato, NodoABin enlIzq, NodoABin enlDer) {
        this.dato = dato;
        this.enlIzq = enlIzq;
        this.enlDer = enlDer;
    }

    public NodoABin(Object dato) {
        this.dato = dato;
        this.enlDer = this.enlIzq = null;
    }

    public NodoABin buscar(Object dato) {
        if (this.dato.equals(dato)) {
            return this;
        }
        NodoABin encontrado = null;
        if (this.enlIzq != null) 
            encontrado = this.enlIzq.buscar(dato);
        if (encontrado == null && this.enlDer != null) 
            encontrado = this.enlDer.buscar(dato);
        return encontrado;

    }

    void imprimirPreorden() {
        if(this.dato!=null)
            System.out.println(this.dato);
        if(this.enlIzq!= null)
            this.enlIzq.imprimirPreorden();
        if(this.enlDer!= null)
            this.enlDer.imprimirPreorden();
    }
    
    void imprimirPosorden() {       
        if(this.enlIzq!= null)
            this.enlIzq.imprimirPreorden();
        if(this.enlDer!= null)
            this.enlDer.imprimirPreorden();
        if(this.dato!=null)
            System.out.println(this.dato);
    }
    void imprimirSimetrico() {       
        if(this.enlIzq!= null)
            this.enlIzq.imprimirPreorden();       
        if(this.dato!=null)
            System.out.println(this.dato);
        if(this.enlDer!= null)
            this.enlDer.imprimirPreorden();
    }
    boolean insertarLexicografico(Object dato){
        if((Integer)this.dato==(Integer)dato)
            return false;
        else if((Integer)this.dato < (Integer)dato)
            if(this.enlDer == null)
                try{
                    this.enlDer = new NodoABin(dato);
                    return true;
                }catch(Exception e){
                    return false;
                }
            else
                this.enlDer.insertarLexicografico(dato);
        else
            if(this.enlIzq== null)
                try{
                    this.enlIzq = new NodoABin(dato);
                    return true;
                }catch(Exception e){
                    return false;
                }
                
    }
    
}
