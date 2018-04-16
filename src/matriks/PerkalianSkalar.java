package matriks;

import java.util.Scanner;

public class PerkalianSkalar {
    Scanner sc = new Scanner(System.in);//inisialisasi scanner
    int matriks1[][];//deklarasi matriks1
    int row, column, nilaiSkalar;//deklarasi baris, kolom, dan nilai skalar
    
    void inputMatriks1(){//method input matriks1
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
    
    void skalar(){//method perkalian skalar
        System.out.print("Masukkan nilai skalarnya : ");
        nilaiSkalar = sc.nextInt();//masukan nilai skalar
        System.out.println("\nHasilnya adalah : ");
        for(int i=0; i<row; i++) {//pengulangan masukan baris matriks1
        for(int j=0; j<column; j++) {//pengulangan masukan kolom matriks1
            System.out.print("\t" + matriks1[i][j]* nilaiSkalar +" ");//perkalian masing masing nilai matriks1 dengan skalar
        }
        System.out.println();
        }
    }
    
    void display1() {//method untuk menampilkan matriks1
      System.out.println("\nMatriksnya adalah :");
      for(int i=0; i<row; i++) {//pengulangan masukan kolom matriks1
        for(int j=0; j<column; j++) {//pengulangan masukan kolom matriks1
            System.out.print("\t" + matriks1[i][j]);//print nilai matriks1
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        PerkalianSkalar obj = new PerkalianSkalar();//inisialisasi objek perkalian skalar
        obj.inputMatriks1();//memanggil method inputmatriks1
        obj.display1();//memanggil method display1
        obj.skalar();//memanggil method skalar
    }
}
