package edd_tarea2;

/**
 * @author hbmg9
 */
public class Bolsa {
    // Declaramos los enteros x, y que vamos a utilizar
    int x, y ;
    Bolsa Siguiente; // nos ayudara a recorrer la lista
    Bolsa Inicio= null, Fin= null; // Nos ayudara a reconocer el fondo y la cabeza de la lista
    int contador=1, numE; // Contadores que usaremos para ver el numero de elementos que tendremos
    
    // Metodo para insertar elementos en una bolsa
    public void Insertar(Bolsa b, int x, int y){
        // Si no se han creado bolsas, se crea una bolsa
        if (Inicio==null){
            Bolsa Nueva = new Bolsa();
            Nueva.x=x;
            Nueva.y=y;
            Inicio = Nueva;
            Fin = Inicio;
            Fin.Siguiente=Inicio;
            numE++;
            System.out.println(" Bolsa creada, elementos insertados");
            
        }
        //Si ya hay bolsas creadas, se crea otra bolsa que sera la siguiente
        else{
            Bolsa Nueva = new Bolsa();
            Nueva.x=x;
            Nueva.y=y;
            Nueva.Siguiente = Inicio;
            Inicio = Nueva;
            Fin.Siguiente=Inicio;
            numE++;
            System.out.println(" Ya Habian mas bolsas, elementos insertados");
            
        }
    }
     
    public boolean EsVacia(Bolsa b){
        // Si el inicio es null, no hay bolsas ni elementos
        if (Inicio==null){
            System.out.println(" La bolsa Si esta vacia");
            return true;
        }else{
             System.out.println(" La bolsa No esta vacia, contiene elementos");
             return false;
        }
    }
    public int Cuantos(Bolsa b, int x, int y){
        // Si el inicio es nulo, no hay elementos en la bolsa
        if(Inicio ==null){
            System.out.println(" En la bolsa no hay elementos");
            return 0;
            // Cuando ya hay elementos en la bolsa 
        }else {
            Bolsa Aux = Inicio;
            
            if (Aux.Siguiente == Inicio ){
                   if (Aux.x == x && Aux.y == y) 
                {
                    System.out.println("La bolsa posee solo un elemento");   
                }else
                {
                    System.out.println("Los elementos no estan en la bolsa");
                    contador = contador-1;
                }
            }
            else  //Contamos cuando hay dos o mas elementos en la bolsa
            {
                while(Aux.x != x && Aux.y != y)
                {
                    if (Aux.Siguiente!= Inicio) 
                    {
                        Aux = Aux.Siguiente;
                    }else{
                        System.out.println("No se encuentra el valor en la bolsa");
                        contador = contador-1;
                        break;
                    }
                }
                if (Aux.x == x && Aux.y == y&& Aux.Siguiente!= Inicio) {
                    //contador = 0;
                    while(Aux.Siguiente!= Inicio)
                    {
                        
                        contador++;
                        Aux = Aux.Siguiente;
                    }
                }
            }
        }
       
        System.out.println("El numero de elementos a partir de la bolsa es :   "+contador+" ");
        return contador;   
    }
     
    public void Print()
    {
        Bolsa temporal = Inicio;
        // Comprobamos si la bolsa tiene elementos
        if (Inicio == null)
        {
            System.out.println(" La bolsa esta Vacia ");
        }else
        {
            // Imprimimos el primer elemento de la bolsa
            System.out.println(" Las coordenadas en (x,y) de elementos dentro de la bolsa son: ");
            System.out.println("( "+temporal.x+","+temporal.y+" )");
            temporal = temporal.Siguiente;
            
            // imprimimos el resto de elementos de la bolsa
            while(temporal != Inicio)
            {
            System.out.println("( "+temporal.x+","+temporal.y+" ) ");
            temporal = temporal.Siguiente;
            } 
        }
      }
}
