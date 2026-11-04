public class exemplo2Vetores {
    public static void main(String[] args) {
        
        int maior = 0;
        int[] numeros = new int []{90, 234, 567, 34, 6};

        //encontrar o maior numeo
        for (int i = 0; i <6; i++) {
            if (numeros [i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: "+ maior);
    }    
}
