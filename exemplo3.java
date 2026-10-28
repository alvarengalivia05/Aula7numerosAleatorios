public class exemplo3 {

    public static void main(String[] args) {
        System.out.println("realizando o calculo com dois numeros");
        calcular(50, 10);
        System.out.println("fim do calculo");    
    }

    public static void calcular(int n1, int n2) {
        int resultado = ((n1*n2) - (n1 + n2))/ (n1 - n2)
        ;
        System.out.println(" resultado da equação:" + resultado);
        
    }
    
}
