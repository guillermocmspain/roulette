/*
Guillermo Campillo Moreno
 */
package ExamenGuillermoCampillo;

import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class ListaEnlazaRuleta {
    nodoRul  cabeza;
    int size=0;
    

    
   public boolean listaVacia(){    
    
        if(cabeza==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   public void addNumeroRuleta(int getNum, String getcolor)
    {
        nodoRul temporal = new nodoRul();

            temporal.numero = getNum;
            temporal.color = getcolor;
            
            if(listaVacia())
            {
                cabeza = temporal;
                cabeza.siguiente = cabeza;
            }
            else
            {
                temporal.siguiente = cabeza.siguiente; 
                cabeza.siguiente = temporal;
            }
            size++;
    }
   public String size(){
       return"El tamaño de la lista es  "+size;
   }
    
  public  void resultNumero(int numApuesta)
    {
        int result, cont1 = 0;
        nodoRul  temporal = cabeza;
        result = (int)(Math.random()*1000)+1;
        
        System.out.println("Número generado: "+result);
        
        if(!listaVacia())
        {
           /*El cont1 lo utilizo para que vaya pasando de nodo a nodo hasta llegar al número generado (result)
            cuando llega a ese número se sale y lo muestra, luego lo comparo. Hago lo mismo en el resto de métodos.*/
            while(cont1<result)
            {
                temporal = temporal.siguiente;
                cont1++;
            }
           JOptionPane.showMessageDialog(null, "Numero: " + temporal.numero+ "\nColor: " + temporal.color, "Numero ganador", 1);
        }
        
        
        if(temporal.numero == numApuesta)
        {
            JOptionPane.showMessageDialog(null,"Acierto!!!!!", "Numero ganador", JOptionPane.PLAIN_MESSAGE);
           
        }else{
             JOptionPane.showMessageDialog(null, "FALLO!!!Intentalo de nuevo", "information", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    
    public void colorFinal(String getColor)
    {
        int result,cont1 = 0;
        nodoRul  temporal = cabeza;
        result = (int)(Math.random()*1000)+1;
        
        System.out.println("Número generado: "+result);
        
        if(!listaVacia())
        {
           while(cont1<result)
            {
                temporal = temporal.siguiente;
                cont1++;
            }
            JOptionPane.showMessageDialog(null, "Numero que tocó: " + temporal.numero+ "\nColor: " + temporal.color, "Numero ganador", 1);
            
        }
        
        if(temporal.color.compareTo(getColor)==0)
        {
            JOptionPane.showMessageDialog(null,"Acierto!!!!!", "Numero ganador",  JOptionPane.PLAIN_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(null, "FALLO!!!Intentalo de nuevo", "information", JOptionPane.ERROR_MESSAGE);
        }
        
      
               
    }
    
    public void resultParImpar(int parImpar)
    {
        int result,cont1 = 0;
        nodoRul  temporal = cabeza;
        result = (int)(Math.random()*1000)+1;
        
        JOptionPane.showMessageDialog(null,"Numero generado"+result, "Numero generado", 1);
        
        if(!listaVacia())
        {
           while(cont1<result)
            {
                temporal = temporal.siguiente;
                cont1++;
            }
            
            JOptionPane.showMessageDialog(null, "Numero que tocó: " + temporal.numero+ "\nColor: " + temporal.color, "Numero ganador", 1);
        }
        /*Utilizo esta variable (comprobar) para guardar el 0 o el 1 de la división, luego lo comparo con el 0 o el 1 que he 
        introducido yo.*/
        int comprobar;
        if(temporal.numero%2==0)
        {
           comprobar = 0;
        }
        else
        {
            comprobar = 1;
        }
        
        if(parImpar == comprobar)
        {
          JOptionPane.showMessageDialog(null,"Acierto!!!!!", "Numero ganador", JOptionPane.PLAIN_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(null, "FALLO!!!Intentalo de nuevo", "information", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }
    
    public void mostrar()
    {
        nodoRul  temporal = cabeza;
        
         if(!listaVacia())
            {
             while(cabeza!=temporal.siguiente)
             {   
                 temporal = temporal.siguiente;
                 System.out.println("Número: "+temporal.numero+" Color: "+temporal.color);        
             }
             System.out.println("Número: "+cabeza.numero+" Color: "+cabeza.color);
              
            }
    }

    public void deletePrimero(){
       
        
        cabeza = cabeza.siguiente;
        size--;
        
    }
    
    /******************Menu principal********************/
    
    public static int menuPrincipal (){
        int opcion;
        do
        {
             opcion=Integer.parseInt(JOptionPane.showInputDialog("---.JUEGO DE LA RULETA.--- \n1.- Apostar.\n2.- Salir."));
            
        }while(opcion<1||opcion>2);
        
        return opcion;
    
    }
    
    /*********************Menu Secundario********************************/
    
    public static int menuSecundario(){
        
    int opcion1;
    do{
        
        opcion1=Integer.parseInt(JOptionPane.showInputDialog("\t---.APOSTAR A:.--- \n1.- Un número.\n2.- Color.\n3.- Par o impar.\n4.- Salir.\n\nElija una opción:"));
                    
    }while(opcion1<1||opcion1>4);
    
      return opcion1;
    }
    




}
