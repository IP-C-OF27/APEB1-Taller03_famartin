package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 25;
        int var2 = 10; //se reutiliza
        int var3 = 100;
        boolean var4 = true;
        boolean var5 = false;
        int var6 = 5;
        int var7 = 2;
        boolean resultado = (Math.sqrt(var1) * var2 >= var3) && var4 || var5 || ((var2/var6 >= var7)) ;
        System.out.println("El resultado es: "+resultado);
    }
    
}
