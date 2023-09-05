public class LinearAlgebra {
    public static Matriz Tranposta(Matriz matriz) {
        Matriz transposta = new Matriz(matriz);

        int linhas = transposta.GetLinhas();
        int colunas = transposta.GetColunas();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta.SetValue(j, i, matriz.GetValue(i, j));
            }
        }

        return transposta;
    }

    public static Matriz Gauss(Matriz matriz) {
        Matriz solucao = new Matriz(matriz.GetLinhas(), 1);

        int n = matriz.GetLinhas();

        // Fase de Eliminação
        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                double fator = matriz.GetValue(i, k) / matriz.GetValue(k, k);
                for (int j = k; j < n + 1; j++) {
                    matriz.SetValue(i, j, matriz.GetValue(i, j) - fator * matriz.GetValue(k, j));
                }
            }
        }

        // Fase de Retrosubstituição
        solucao.SetValue(n - 1, 0, matriz.GetValue(n-1, n) / matriz.GetValue(n-1, n-1));
        for (int i = n - 2; i >= 0; i--) {
            double soma = 0.0;
            for (int j = i + 1; j < n; j++) {
                soma += matriz.GetValue(i, j) * solucao.GetValue(j, 0);
            }
            solucao.SetValue(i, 0, (matriz.GetValue(i, n) - soma) / matriz.GetValue(i, i));
        }

        return solucao;
    }
}
