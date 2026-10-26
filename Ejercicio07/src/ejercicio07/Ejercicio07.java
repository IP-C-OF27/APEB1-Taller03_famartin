package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = 81;
        int var2 = 9; //se reutiliza
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100; // se reutiliza
        int var7 = 25;
        boolean resultado = ((Math.sqrt(var1)+ var2) / var3 == var2) || (var4 > var5) && (var6 / var7 >= Math.sqrt(var6))  ;
        System.out.println("El resultado es: "+resultado);
    }
    
}
