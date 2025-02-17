package org.example.introduce;

public class BigO {
    int colunas;
    int linhas;

public BigO(int colunas, int linhas){
    this.colunas = 0;
    this.linhas = 0;
}

public void returnMatiz(int colunas, int linhas, int numero, int[][] matriz){
    for (int i = 0; i<linhas;i++){
        for (int j = 0; j<colunas;j++){
            if (matriz[i][j] == 0){
                matriz[i][j] = numero;
            }
        }
    }
    //Esse algorítmo serve para adicionar números a uma matriz. Ele faz a leitura de dados da matriz e inserção de dados. Logo é O(n)
}
public void returnMidMatriz(int colunas, int[][] matriz){
    for (int j = 0; j < colunas; j++){
        {
            System.out.println(matriz[j][j]);
        }
    }
    //O(n)
}

}
