package matriks;

import java.util.Scanner;

public class Transpose {
        
    Scanner sc = new Scanner(System.in);
    int matriks1[][];
    int row, column;
    
    void inputMatriks1(){
        System.out.println("Matriks");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();
        matriks1 = new int[row][column];
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
    }
    
    void transpose(){
        System.out.println("\nTransposenya adalah : ");
        for(int i=0; i<column; i++) {
        for(int j=0; j<row; j++) {
            System.out.print("\t" + matriks1[j][i]+ " ");
        }
        System.out.println();
        }
    }
    
    void display1() {
      System.out.println("\nMatriksnya adalah :");
      for(int i=0; i<row; i++) {
        for(int j=0; j<column; j++) {
            System.out.print("\t" + matriks1[i][j]);
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Transpose obj = new Transpose();
        obj.inputMatriks1();
        obj.display1();
        obj.transpose();
    }
}
