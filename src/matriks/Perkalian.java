package matriks;

import java.util.Scanner;
public class Perkalian {
        
    Scanner sc = new Scanner(System.in);
    int matriks1[][];
    int matriks2[][];
    int rowA, columnA, rowB, columnB, hasil;
    
    void inputMatriks1(){
        System.out.println("Matriks pertama");
	System.out.print("Masukkan jumlah baris : ");
        rowA = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        columnA = sc.nextInt();
        matriks1 = new int[rowA][columnA];
        System.out.println("Enter the data :");
        for(int i=0; i<rowA; i++) {
            for(int j=0; j<columnA; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
    }
    void inputMatriks2(){
        System.out.println("Matriks kedua");
	System.out.print("Masukkan jumlah baris : ");
        rowB = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        columnB = sc.nextInt();
        matriks2 = new int[rowB][columnB];
        System.out.println("Enter the data :");
        for(int i=0; i<rowB; i++) {
            for(int j=0; j<columnB; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }
    }
    
    void perkalian(){
        System.out.println("\nHasilnya adalah : ");
        int matriks3[][] = new int[rowA][columnB]; 
        for (int i = 0; i < matriks1.length; i++){
            for (int j = 0; j < matriks1[0].length; j++){
                hasil = 0;
                for (int k = 0; k < matriks1.length; k++){
                    hasil = hasil +  (matriks1[i][k] * matriks2[k][j]);
                }
                matriks3[i][j] = hasil;
            }
        }

        for (int i = 0; i < matriks3.length; i++){
            for (int j = 0; j < matriks3[0].length; j++){
                System.out.print( matriks3[i][j] + " ");
            }       
            System.out.println();
        }
    }
    
    void display1() {
      System.out.println("\nMatriks pertama adalah :");
      for(int i=0; i<rowA; i++) {
        for(int j=0; j<columnA; j++) {
            System.out.print("\t" + matriks1[i][j]);
        }
        System.out.println();
        }
    }
    void display2() {
      System.out.println("\nMatriks kedua adalah :");
      for(int i=0; i<rowB; i++) {
        for(int j=0; j<columnB; j++) {
            System.out.print("\t" + matriks2[i][j]);
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Perkalian obj = new Perkalian();
        obj.inputMatriks1();
        obj.display1();
        obj.inputMatriks2();
        obj.display2();
        obj.perkalian();
    }
}
