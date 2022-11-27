/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package type_casting;

/**
 *
 * @author BRAVIN
 */
public class Type_casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i=22 ;
      int v1=(i++ * ++i);
      int v2=(i++ * i++);
      int v3=(++i * ++i);
      int v4=(++i * i++);
      int v5=(++i + --i);
    
         
      System.out.println(v1);
      System.out.println(v2);
      System.out.println(v3);
      System.out.println(v4);
      System.out.println(v5);
      
      
       int j=10 ;
      int v6=(j-- * --j);
      int v7=(j-- * j--);
      int v8=(--j * --j);
      int v9=(--j * j--);
      int v10=(--j + ++j);
       
      System.out.println("v6" + v6);
      System.out.println("v7" + v7);
      System.out.println("v8" + v8);
      System.out.println("v9" + v9);
      System.out.println("v10" + v10);
      
    }
    
}
