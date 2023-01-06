/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationbucles9;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Matriz {
    
  
   private int filas;
   private int columnas;

    public Matriz() {
    }
    
    public void solicitud(){
    Scanner read = new Scanner(System.in);
    
    
        System.out.println("Ingrese la dimension de la matriz");
        System.out.println("Ingrese las filas de la matriz");
        this.filas = read.nextInt();
        System.out.println("Ingrese las columnas de la matriz");
        this.columnas = read.nextInt();
        
    }
    
   
   
   public void recorrido(){
         char matriz[][] = new char[this.filas][this.columnas]; 
    for (int i = 0; i< this.filas; i++){
            for (int j = 0; j<this.columnas; j++){
               
                if (i == j){
                matriz[i][j]='0';
                }else{
                matriz[i][j]='*';
                }
           }
        }
        
        for (int i = 0; i< this.filas; i++){
            for (int j = 0; j<this.columnas; j++){
                System.out.print(" "+matriz[i][j]);
            
            }
            System.out.println();
        }
   
   }
       
}
