package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50; 
        int var9 = 51;
        boolean resultado = ((var1 * var2) + var3 - (var4/var5) + Math.pow(var6,var5) >= var7) || (var8 >= var8 - var8 + var9)  ;
        System.out.println("El resultado es: "+resultado);
    }
    
}
