/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamatailo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class PruebaMatailo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de vendedores");
        int numVendedores=LecturaDatos.LeerEntero();
        ArrayList<String> Vendedores = new ArrayList<String>();
        float[] ventas=new float[numVendedores];
        float total=0;
        for (int i = 0; i < numVendedores; i++) {
         System.out.println("ingrese el nombre del vendedor "+ (i+1));  
         String nombre=sc.nextLine();  
         Vendedores.add(nombre);
         System.out.println("ingrese la venta "+ (i+1));  
         float venta=LecturaDatos.LeerFloat();
         ventas[i]=venta;
         total+=venta;
        }
        System.out.println("Vendedor\t\tVenta\t\t");  
        for (int i = 0; i < numVendedores; i++) {
          System.out.println(Vendedores.get(i)+"\t\t\t"+ventas[i]);    
        }
        System.out.println("==============================================");  
        float promedio=total/numVendedores;
        System.out.println("\t\tTotal "+total);  
        System.out.println("\t\tPromedio "+ promedio);  
 
        }
        }
    
            
        
        
    
    

