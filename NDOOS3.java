package nodos;
import java.util.Scanner;
public class NDOOS3 {
        Scanner sc = new Scanner(System.in);
    static class Nodo {
        String dato;
        Nodo sig; 
    } 
    Nodo fin = null;
    Nodo inicio=null;
//METODOS: AGREGAR, MOSTRAR Y ELIMINAR NUEVO METODO
    public void agregar() { 
        Nodo temp=new Nodo();
        System.out.println("agregar el dato ");
        temp.dato=sc.nextLine();
        if (fin == null) {
            fin = temp;
            //fin.dato = sc.nextLine();
            fin.sig = null;
            inicio=temp;
        } else { 
            inicio.sig=temp;
            //temp.dato = sc.nextLine();
            //temp.sig = fin;
            //fin = temp;
            temp.sig=null;
            inicio= temp;
            System.out.println("dato agregago"+inicio.dato);  
        }    
    }
//AQUI TERMINA EL METODO DE AGREGAR 
    // DONDE NOS AGREGARIA LOS DATOS QUE INGRESEMOS UNA VEZ QUE YA PASAMOS POR  EL MENU
    public void mostrar() {
        Nodo actual =new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                if(actual.dato!=null){
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                };
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");//imprimimos que esta vacio
        }
    }
       ///AQUI TERMINA EL METODO MOSTRAR
        //DONDE NOS MOSTRARA LOS DATOS UNA VEZ INGRESADOS O AGREGADOS POR EL OTRO METODO
    public void eliminarprimer(){
        Nodo actual= fin;
        while(actual.sig!=inicio){
            actual = actual.sig;
        }
        System.out.println("Dato eliminado: "+inicio.dato);
   actual.sig=null;
   inicio=actual;
    }
    public void eliminarultimo() {
    	if(fin!=null) {
    		fin=fin.sig;
    	}else {
    		System.out.print("No hay nada que eliminar en el nodo");
    	}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        NDOOS3 n = new NDOOS3();
        do {
            System.out.println("1 Agregar \n"
                    + "2 Mostrar dato \n"
                    + "3 Eliminar el primer dato\n"
                    + "4 Eliminar el ultimo dato"
                    + "5 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar(); 
                    break;
                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.eliminarprimer();
                    break;
                case 4: 
                    n.eliminarultimo();
                    break;
                case 5: 
                    System.out.println("fin");
                    break;
                    default:
                        System.out.println("Invalido");
                    
            }
        } while (opt != 5);
    }
    }

