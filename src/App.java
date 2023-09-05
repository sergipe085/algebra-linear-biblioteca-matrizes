import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Matriz matrizTeste = new Matriz(3, 4);
        matrizTeste.FillInput(sc);

        System.out.println(matrizTeste.ToString());
        
        
        // Matriz transpostaTeste = LinearAlgebra.Tranposta(matrizTeste);
        // System.out.println(transpostaTeste.ToString());

        Matriz gaussTeste = LinearAlgebra.Gauss(matrizTeste);
        System.out.println(gaussTeste.ToString());
    }
}
