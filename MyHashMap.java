
/**
 * Write a description of class MyHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHashMap
{
    // instance variables - replace the example below with your own
 private String clavePrin;
 private int[] valorPri;
 

    /**
     * Constructor for objects of class MyHashMap
     */
    public MyHashMap()
    {
        // initialise instance variables
        
        valorPri = new int[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int put(String clave, int valor)
    {
       int valorClave = -1;
       if(clave.equals(clavePrin)){
           valorClave = valorPri[valor];
        }
        return valorClave;
    }
    
    
    public int get(String clave){
        int valorClave = -1;
        for(int i = 0; i <= valorPri.length; i++){
            if(clave != null){
                valorClave = valorPri[i];
            }
        }
        return valorClave;
    
    }
    
}
