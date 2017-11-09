package com.company;

/**
 * Created by uriel on 08/11/2017.
 */
public class pilas {

    private nodo top;
    private int tamaño;

    public pilas()
    {
        top = null;
    }

    public boolean vacio()
    {
        return (top==null);
    }
    public int getTamaño() {
        return tamaño;
    }


    public void push (int valor) //inserta valor en la pila
    {
        nodo nuevoNodo;
        if (vacio() )
            top = new nodo (valor);
        else{
            nuevoNodo = new nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
        tamaño++;
    }


   public void peek() //muestra los datos de la pila
   {
       nodo temp = top;
       if (temp !=null){
           System.out.println("la pila es:");
           while (temp != null){
               System.out.println(temp.getValor());
               temp=temp.getProx();
           }
       }
       else System.out.println("pila vacia");
   }

   public void cima (){ //metodo para buscar muestra la cima de la pila
   if (!vacio())
       System.out.println("cima: "+top.getValor());
   else
       System.out.println("la pila esta vacia");
   }

   public void pop(){//metodo para borrar
       if ( !vacio()){
           System.out.println("dato extraido: "+top.getValor());
           top = top.getProx();

       }
       else
           System.out.println("la pila esta vacia");
   }



}
