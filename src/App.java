import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("=== TESTANDO A ELIMINACAO POR GAUSS ===");
        System.out.println("=======================================");

        System.out.println("Preencha a matriz (3x4)");

        Matriz matriz_gauss = new Matriz(3, 4);
        matriz_gauss.FillInput(sc);
        
        System.out.println("=== RESULTADO DO SISTEMA ===");  
        System.out.println("============================");            
        System.out.println("");
        Matriz gauss_resultado = LinearAlgebra.Gauss(matriz_gauss);
        System.out.println(gauss_resultado.ToString());
        System.out.println("============================");  
        
        System.out.println("");
        System.out.println("====================================");
        System.out.println("=== TESTANDO A MATRIZ.TIMES() ===");
        System.out.println("====================================");

        Matriz matriz_transposta = new Matriz(2, 2);
        matriz_transposta.FillInput(sc);

        System.out.println("Digite o valor escalar a se multiplicar");
        double quantity = sc.nextDouble();

        Matriz transposta_resultado = LinearAlgebra.Times(matriz_transposta, quantity);

        System.out.println("=== RESULTADO TIMES() ===");  
        System.out.println("=========================");            
        System.out.println("");
        System.out.println(transposta_resultado.ToString());
        System.out.println("=========================");   

        System.out.println("");
        System.out.println("====================================");
        System.out.println("=== TESTANDO A MATRIZ.SOMA() ===");
        System.out.println("====================================");

        Matriz matriz_soma_1 = new Matriz(2, 2);
        matriz_soma_1.FillInput(sc);

        Matriz matriz_soma_2 = new Matriz(2, 2);
        matriz_soma_2.FillInput(sc);

        Matriz soma_resultado = LinearAlgebra.Soma(matriz_soma_1, matriz_soma_2);

        System.out.println("=== RESULTADO SOMA() ===");  
        System.out.println("=========================");            
        System.out.println("");
        System.out.println(soma_resultado.ToString());
        System.out.println("=========================");   

        System.out.println("");
        System.out.println("====================================");
        System.out.println("=== TESTANDO A MATRIZ.DOT() ===");
        System.out.println("====================================");

        Matriz matriz_dot_1 = new Matriz(2, 2);
        matriz_dot_1.FillInput(sc);

        Matriz matriz_dot_2 = new Matriz(2, 2);
        matriz_dot_2.FillInput(sc);

        Matriz dotTeste = LinearAlgebra.Dot(matriz_dot_1, matriz_dot_2);

        System.out.println("=== RESULTADO SOMA() ===");  
        System.out.println("=========================");            
        System.out.println("");
        System.out.println(dotTeste.ToString());
        System.out.println("=========================");   

        System.out.println("");
        System.out.println("====================================");
        System.out.println("=== TESTANDO A MATRIZ.MULTIPLICACAO() ===");
        System.out.println("====================================");

        Matriz matriz_mult_1 = new Matriz(2, 2);
        matriz_mult_1.FillInput(sc);

        Matriz matriz_mult_2 = new Matriz(2, 2);
        matriz_mult_2.FillInput(sc);

        Matriz multiplicacaoTeste = LinearAlgebra.Multiplicacao(matriz_mult_1, matriz_mult_2);
        System.out.println("=== RESULTADO SOMA() ===");  
        System.out.println("=========================");            
        System.out.println("");
        System.out.println(multiplicacaoTeste.ToString());
        System.out.println("=========================");   
    }
}
