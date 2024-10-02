/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author ACER NITRO 5
 */
public class Recursion {

    public static void Printstar(int n){
            System.out.println("*");
            switch(n){
                case 1:
                    return;
                default:
                    Printstar(n - 1);
                
        }
            
    }
    public static void main(String[] args) {
        Printstar(5);
       }
    
}   
    
    

        
    

