package matriks;

import java.util.Scanner;

public class Pengurangan {
        
    Scanner sc = new Scanner(System.in);//inisiasi scanner
    int matriks1[][];//inisiasi matriks pertama
    int matriks2[][];//inisiasi matriks kedua
    int row, column, hasil;//deklarasi baris, kolom, dan hasil
    
    void inputMatriks1(){//method input matriks pertama
        System.out.println("Matriks pertama");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();//masukan baris matriks
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();//masukan kolom matriks
        matriks1 = new int[row][column];//inisiasi baris dan kolom matriks1
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {//pengulangan masukan baris
            for(int j=0; j<column; j++) {//pengulangan masukan kolom
                matriks1[i][j] = sc.nextInt();//pembentukan matriks1
            }
        }
    }
    void inputMatriks2(){//method input matriks kedua
        System.out.println("Matriks kedua");
	System.out.print("Masukkan jumlah baris : ");
        row = sc.nextInt();//masukan baris matriks
        System.out.print("Masukkan jumlah kolom : ");
        column = sc.nextInt();//masukan kolom matriks
        matriks2 = new int[row][column];//inisiasi baris dan kolom matriks2
        System.out.println("Enter the data :");
        for(int i=0; i<row; i++) {//pengulangan masukan baris
            for(int j=0; j<column; j++) {//pengulangan masukan kolom
                matriks2[i][j] = sc.nextInt();//pembentukan matriks2
            }
        }
    }
    
    void pengurangan(){//method pengurangan matriks
        System.out.println("\nHasilnya adalah : ");
        for (int i = 0; i < matriks1.length; i++){//pengulangan dengan menghitung panjang matriks1
            for (int j = 0; j < matriks1[0].length; j++){//pengulangan dengan menghitung nilai anggota pertama matriks1
                int hasil = matriks1[i][j] - matriks2[i][j];//pengurangan matriks1 - matriks2
                System.out.print( hasil + " ");//mendapatkan hasil pengurangan
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
        Pengurangan obj = new Pengurangan();//inisialisasi objek pengurangan
        obj.inputMatriks1();//memanggil method inputmatriks1
        obj.display1();//memanggil method display1
        obj.inputMatriks2();//memanggil method inputmatriks2
        obj.display2();//memanggil method display1
        obj.pengurangan();//memanggil method pengurangan
    }
}