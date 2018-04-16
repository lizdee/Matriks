package matriks;

import java.util.Scanner;

public class Penjumlahan {
    
    Scanner sc = new Scanner(System.in);//inisialisasi scanner
    int matriks1[][];//inisialisasi matriks1
    int matriks2[][];//inisialisasi matriks2
    int row, column, hasil;//deklarasi baris, kolom, dan hasil
    
    void inputMatriks1(){//method input matriks1
        System.out.println("Matriks pertama");
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
    void inputMatriks2(){//method input matriks2
        System.out.println("Matriks kedua");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();//masukan baris matriks2
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();//masukan kolom matriks2
        matriks2 = new int[row][column];//inisialisasi baris dan kolom matriks2
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {//pengulangan masukan baris matriks2
            for(int j=0; j<column; j++) {//pengulangan masukan kolom matriks2
                matriks2[i][j] = sc.nextInt();//pembentukan matriks2
            }
        }
    }
    
    void penjumlahan(){//method penjumlahan
        System.out.println("\nHasilnya adalah : ");
        for (int i = 0; i < matriks1.length; i++){//pengulangan dengan menghitung panjang matriks1
            for (int j = 0; j < matriks1[0].length; j++){//pengulangan dengan menghitung nilai anggota pertama matriks1
                int hasil = matriks1[i][j] + matriks2[i][j];//penjumlahan matriks1 dan matriks2
                System.out.print( hasil + " ");//mendapatkan hasil penjumlahan
            }
            System.out.println();
        }
    }
    
    void display1() {//method untuk menampilkan matriks1
      System.out.println("\nMatriks pertama adalah :");
      for(int i=0; i<row; i++) {//pengulangan untuk menghitung panjang baris matriks1
        for(int j=0; j<column; j++) {//pengulangan untuk menghitung panjang kolom matriks1
            System.out.print("\t" + matriks1[i][j]);//print nilai matriks1
        }
        System.out.println();
        }
    }
    void display2() {//method untuk menampilkan matriks2
      System.out.println("\nMatriks kedua adalah :");
      for(int i=0; i<row; i++) {//pengulangan untuk meghitung panjang baris matriks2
        for(int j=0; j<column; j++) {//pengulangan untuk menghitung panjang kolom matriks2
            System.out.print("\t" + matriks2[i][j]);//print nilai matriks2
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Penjumlahan obj = new Penjumlahan();//inisialisasi objek penjumlahan
        obj.inputMatriks1();//memanggil method inputmatriks1
        obj.display1();//memanggil method dispay1
        obj.inputMatriks2();//memanggil method inputmatriks2
        obj.display2();//memanggil method display2
        obj.penjumlahan();//memanggil method penjumlahan
    }
}
