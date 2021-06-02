import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o tamanho do lado da matriz: ");
        int n = ler.nextInt();

        List<Integer> negativos = new ArrayList<>();
        List<Integer> diagonal = new ArrayList<>();

        int[][] matrix = new int[n][n];

        System.out.printf("Insira os %d elementos da matriz separados por espaço: ", n * n);

        for(int i=0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                int num = ler.nextInt();
                if(num < 0){
                    negativos.add(num);
                }
                if(i == j){
                    diagonal.add(num);
                }
                matrix[i][j] = num;
            }
        }

        for (int[] num: matrix) {
            for(int m: num){
                System.out.print("["+m+"] ");
            }
            System.out.println();
        }
        System.out.println("Diagonal principal: " + diagonal);
        System.out.printf("Quantidade de negativos %d %n", negativos.size());
        System.out.println("Negativos: " + negativos);
    }
}
