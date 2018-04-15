package matriks;

import java.util.Scanner;

public class PerkalianSkalar {
    Scanner sc = new Scanner(System.in);
    int matriks1[][];
    int row, column, nilaiSkalar;
    
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
    
    void skalar(){
        System.out.print("Masukkan nilai skalarnya : ");
        nilaiSkalar = sc.nextInt();
        System.out.println("\nHasilnya adalah : ");
        for(int i=0; i<row; i++) {
        for(int j=0; j<column; j++) {
            System.out.print("\t" + matriks1[i][j]* nilaiSkalar +" ");
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
        PerkalianSkalar obj = new PerkalianSkalar();
        obj.inputMatriks1();
        obj.display1();
        obj.skalar();
    }
}
