package matriks;

import java.util.Scanner;

public class Transpose {
        
    Scanner sc = new Scanner(System.in);//inisialisasi scanner
    int matriks1[][];//deklarasi matriks1
    int row, column;//deklarasi baris dan kolom
    
    void inputMatriks1(){
        System.out.println("Matriks");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();//masukan baris matriks1
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();//masukan kolom matriks1
        matriks1 = new int[row][column];//inisialisasi baris dan kolom matriks1
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {//pengulangan masukan baris matriks1
            for(int j=0; j<column; j++) {//pengulangan masukan kolom matriks1
                matriks1[i][j] = sc.nextInt();//pembentukan matriks1
            }
        }
    }
    
    void transpose(){//method transpos
        System.out.println("\nTransposenya adalah : ");
        for(int i=0; i<column; i++) {//pengulangan masukan kolom matriks1
        for(int j=0; j<row; j++) {//pengulangan masuka baris atriks1
            System.out.print("\t" + matriks1[j][i]+ " ");//pembentukan transpos matriks1
        }
        System.out.println();
        }
    }
    
    void display1() {//method untuk menampilkan matriks1
      System.out.println("\nMatriksnya adalah :");
      for(int i=0; i<row; i++) {//pengulangan masukan baris matriks1
        for(int j=0; j<column; j++) {//pengulangan masukan kolom matriks1
            System.out.print("\t" + matriks1[i][j]);//print nilai matriks1
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Transpose obj = new Transpose();//inisialisasi objek transpose
        obj.inputMatriks1();//memanggil method inputmatriks1
        obj.display1();//memanggil method display1
        obj.transpose();//memanggil method transpose
    }
}
