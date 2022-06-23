package Exe2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int impar =15 ;
		int diagonalPrincipal = 0;
		
        int [][] matriz = new int [2][2];
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz [i][j] = 0;
                if(i==j){
                    matriz[i][j] = impar;
                    diagonalPrincipal+=matriz[i][j];
                }
                impar+=2;
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("A soma da diagonal principal é: %d", diagonalPrincipal);
    }
}