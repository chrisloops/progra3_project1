/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlventas.controladores;

import java.util.Scanner;


/**
 *
 * @author chrisloops
 */
public class CajaControlador {
    
    public static CajaControlador instance;
    
     public static CajaControlador instance(){
        if(instance == null){
            instance = new CajaControlador();
        }
        
        return instance;
    }
     
     
     public void mostrarMenu(){
         int option;
         do{
         
            Scanner sc = new Scanner(System.in);
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.println("Caja\n\n\n");
            System.out.println("1. Registrar Factura.");
            System.out.println("2. Mostrar Reporte.");
            System.out.println("3. Salir");

           option = sc.nextInt();
         }while(option != 3);
     }
}
