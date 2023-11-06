package buAul;

import java.util.Scanner;

public class soalMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Baris: " );
        int baris = input.nextInt();
        System.out.println("Masukkan kolom: ");
        int kolom = input.nextInt();
        int matrik [][] = new int[baris][kolom];

        for (int index = 0; index < matrik.length; index++){
            for (int i = 0; i < matrik[index].length; i++) {
                System.out.print("masukkan nilai baris"+index+ " kolom "+i+ " : ");
                matrik[index][i] = input.nextInt();
            }
          System.out.println();  
        }


       
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j]+ " ,");
            }
            System.out.println();
        }
        
        
    }
}
