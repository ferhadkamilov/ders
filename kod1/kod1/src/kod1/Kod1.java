/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kod1;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Kod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
          
        
      
      
      
  int i;
  
  
  
        int a;
        int b=0;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int j=2;j<=n;j++)
        {
            a=0;
            for(i=1;i<=j;i++){

                if(j%i==0) {

                    a++;
                }
            }
            if(a==2) {
               b+=j;
            }
        }
        System.out.println(b); 
        
        
  
    }
    
}
