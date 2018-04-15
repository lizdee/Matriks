package matriks;

import java.util.Scanner;

public class Pengurangan {
        
    Scanner sc = new Scanner(System.in);
    int matriks1[][];
    int matriks2[][];
    int row, column, hasil;
    
    void inputMatriks1(){
        System.out.println("Matriks pertama");
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
    void inputMatriks2(){
        System.out.println("Matriks kedua");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();
        matriks2 = new int[row][column];
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }
    }
    
    void pengurangan(){
        System.out.println("\nHasilnya adalah : ");
        for (int i = 0; i < matriks1.length; i++){
            for (int j = 0; j < matriks1[0].length; j++){
                int hasil = matriks1[i][j] - matriks2[i][j]; 
                System.out.print( hasil + " ");
            }
            System.out.println();
        }
    }
    
    void display1() {
      System.out.println("\nMatriks pertama adalah :");
      for(int i=0; i<row; i++) {
        for(int j=0; j<column; j++) {
            System.out.print("\t" + matriks1[i][j]);
        }
        System.out.println();
        }
    }
    void display2() {
      System.out.println("\nMatriks kedua adalah :");
      for(int i=0; i<row; i++) {
        for(int j=0; j<column; j++) {
            System.out.print("\t" + matriks2[i][j]);
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Pengurangan obj = new Pengurangan();
        obj.inputMatriks1();
        obj.display1();
        obj.inputMatriks2();
        obj.display2();
        obj.pengurangan();
    }
}