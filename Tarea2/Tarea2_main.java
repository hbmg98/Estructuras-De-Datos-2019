package edd_tarea2;

/**
 *
 * @author hbmg98
 */
public class EDD_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Los elementos son mostrados en forma de pila
        Bolsa prueba = new Bolsa();
        prueba.EsVacia(prueba);
        prueba.Insertar(prueba, 40, 40);
        prueba.Insertar(prueba, 30, 30);
        prueba.Insertar(prueba, 20, 20);
        prueba.Insertar(prueba, 10, 10);
        prueba.Insertar(prueba, 5, 5);
        prueba.EsVacia(prueba);
        prueba.Imprimir();
        prueba.Cuantos(prueba, 20, 20);
        prueba.EsVacia(prueba);
        Bolsa prueba2 = new Bolsa();
        prueba2.EsVacia(prueba2);
        prueba2.Imprimir();
        prueba2.Insertar(prueba2, 1, 0);
        prueba2.EsVacia(prueba2);
        prueba2.Cuantos(prueba2, 1, 0);
        prueba2.Imprimir();
        
     
    }
    
}
