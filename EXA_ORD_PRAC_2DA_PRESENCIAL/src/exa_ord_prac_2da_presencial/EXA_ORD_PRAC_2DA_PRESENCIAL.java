/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa_ord_prac_2da_presencial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXA_ORD_PRAC_2DA_PRESENCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int player; 
        double cpu = 0;
        cpu = Math.random();
        Scanner input = new Scanner(System.in);
        System.out.println("piedra 1 papel 2 o tijeras 3?");
        player = input.nextInt();
            switch (player) {
                case 1:
                    System.out.println("piedra");
                    break;
                case 2:
                    System.out.println("papel");
                    break;
                case 3:
                    System.out.println("tijeras");
                    break;    
                default:
                    System.out.println("no existe");
                    break;
            }
            System.out.println(cpu);
            if(cpu <= .333)
            System.out.println("piedra");
        else if (cpu <= .666)
            System.out.println("papel");         
        else if (cpu <= .999)
            System.out.println("tijeras");
            
            
                
            
            
            }
            
            
}
            
  



        


    
    


       
    


               
    

