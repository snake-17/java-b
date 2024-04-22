
package primos.sumprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author snake-17
 */
public class SumPrimos {

    //metodo si es primo o no; a es el numero que evalua
    
 public int esPrimo(int a) {
     int primo = 1;
  
        int residuo=0;
        for(int i=2 ; i<=a ; i++){
        residuo = a%i;
            if (a==i || i==1) {
                
            }
            else{
                if(residuo == 0){
                   primo = 0;
                   i=a;
                }
            }    
        }
        
        
        //aqui ya se sabe si es primo o no
        if(primo == 1){
            
            return a;
        }
        else{
         return 0;   
        }
        
    }
 
    public void suma(int number){
        int total=0;
         SumPrimos ejemplo = new SumPrimos();
         
         for (int i = 2; i <= number; i++) {
            int resultado=ejemplo.esPrimo(i);
            if (resultado !=0){
            total = total+i;
            }
            
            
        }
        System.out.println("the sum is: "+total);
    }
    
    
    public static void main(String[] args) {
       
       SumPrimos ejemplo2 = new SumPrimos();
        
        //ya sabe si es un primo o no
        String numero = JOptionPane.showInputDialog("enter a number");
        //transformamos el string a int
        int num = Integer.parseInt(numero);
        
        int comprobar = ejemplo2.esPrimo(num);
        if (comprobar == 0) {
            System.out.println("No es primo");
    
        }else{
            ejemplo2.suma(num);
        }
       
        
    }
}
