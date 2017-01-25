/*
Guillermo Campillo Moreno.
 */
package ExamenGuillermoCampillo;

import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class mainRuleta {
        public static void main(String[] args)
    {
        int opcion, opcion1;
        ListaEnlazaRuleta juego = new ListaEnlazaRuleta();
        
        juego.addNumeroRuleta(0, "verde");
        juego.addNumeroRuleta(32, "rojo");
        juego.addNumeroRuleta(15, "negro");
        juego.addNumeroRuleta(19, "rojo");
        juego.addNumeroRuleta(4, "negro");
        juego.addNumeroRuleta(21, "rojo");
        juego.addNumeroRuleta(2, "negro");
        juego.addNumeroRuleta(25, "rojo");
        juego.addNumeroRuleta(17, "negro");
        juego.addNumeroRuleta(34, "rojo");
        juego.addNumeroRuleta(6, "negro");
        juego.addNumeroRuleta(27, "rojo");
        juego.addNumeroRuleta(13, "negro");
        juego.addNumeroRuleta(36, "rojo");
        juego.addNumeroRuleta(11, "negro");
        juego.addNumeroRuleta(30, "rojo");
        juego.addNumeroRuleta(8, "negro");
        juego.addNumeroRuleta(23, "rojo");
        juego.addNumeroRuleta(10, "negro");
        juego.addNumeroRuleta(5, "rojo");
        juego.addNumeroRuleta(24, "negro");
        juego.addNumeroRuleta(16, "rojo");
        juego.addNumeroRuleta(33, "negro");
        juego.addNumeroRuleta(1, "rojo");
        juego.addNumeroRuleta(20, "negro");
        juego.addNumeroRuleta(14, "rojo");
        juego.addNumeroRuleta(31, "negro");
        juego.addNumeroRuleta(9, "rojo");
        juego.addNumeroRuleta(22, "negro");
        juego.addNumeroRuleta(18, "rojo");
        juego.addNumeroRuleta(29, "negro");
        juego.addNumeroRuleta(7, "rojo");
        juego.addNumeroRuleta(28, "negro");
        juego.addNumeroRuleta(12, "rojo");
        juego.addNumeroRuleta(35, "negro");
        juego.addNumeroRuleta(3, "rojo");
        juego.addNumeroRuleta(26, "negro");
        
        //a.deletePrimero();
        System.out.println("Estos son los numeros de la ruleta:");
        juego.mostrar();
        
       JOptionPane.showMessageDialog(null, "Ruleta Insertada", "Informacion", 1);
       JOptionPane.showMessageDialog(null, juego.size(), "Informacion", 1);
       juego.deletePrimero();
       
       
    do{  
        opcion = ListaEnlazaRuleta.menuPrincipal();//llamada a metodo estatico para menu principal
    
    
        switch(opcion)
        {
            case 1:
            {
                do{
                    opcion1 = ListaEnlazaRuleta.menuSecundario();//llamada a metodo estatico para menu secundario

                    switch(opcion1)
                    {
                        case 1:
                        {
                            int numApuesta;
                            do{
                                numApuesta=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de la ruleta para jugar (del 0 al 36):"));
                           
                            }while(numApuesta < 0||numApuesta > 36);
                            
                           juego.resultNumero(numApuesta);
                            
                            break;
                        }

                        case 2:
                        {
                            
                            String getColor = JOptionPane.showInputDialog("Introduce un color para jugar (rojo/negro/verde)");
                            
                            juego.colorFinal(getColor);
                            break;
                        }

                        case 3:
                        {
                            
                            int parImpar;
                            do {
                                
                                String varParImpar = JOptionPane.showInputDialog("Elige 0 para jugar números pares y 1 para los impares:");
                                parImpar = Integer.parseInt(varParImpar);
                                
                                
                            }while (parImpar < 0  ||  parImpar > 1);
                            
                            
                            
                            juego.resultParImpar(parImpar);
                            break;
                        }

                        case 4:
                        {
                                JOptionPane.showMessageDialog(null, "Ha salido del menu de apuestas", "Informacion", 1);
                            
                            break;
                        }
                    }
                    
                }while(opcion1!=4);
                
                break;
            }
            
            case 2:
            {
                JOptionPane.showMessageDialog(null, "Gracias por jugar con la ruleta Guillermo Campillo", "Informacion", 1);
            }
        }
        
    }while(opcion!=2);
    
        
        
                
        
    }
}
