package matriks;

import java.util.Scanner;
public class Perkalian {
        
    Scanner sc = new Scanner(System.in);//inisialisasi scanner
    int matriks1[][];//inisialisasi matriks1
    int matriks2[][];//inisialisasi matriks2
    int rowA, columnA, rowB, columnB, hasil;//deklarasi barisA, kolomA, barisB, dan kolomB, serta hasil
    
    void inputMatriks1(){//method input matriks1
        System.out.println("Matriks pertama");
	System.out.print("Masukkan jumlah baris : ");
        rowA = sc.nextInt();//masukan barisA matriks1
        System.out.print("Masukkan jumlah kolom : ");
        columnA = sc.nextInt();//masukan kolomA matriks1
        matriks1 = new int[rowA][columnA];//inisialisasi barisA dan kolomA matriks1
        System.out.println("Enter the data :");
        for(int i=0; i<rowA; i++) {//pengulangan masukan barisA matriks1
            for(int j=0; j<columnA; j++) {//pengulangan masukan kolomA matriks1
                matriks1[i][j] = sc.nextInt();//pembentukan matriks1
            }
        }
    }
    void inputMatriks2(){//method input matriks2
        System.out.println("Matriks kedua");
	System.out.print("Masukkan jumlah baris : ");
        rowB = sc.nextInt();//masukan barisB matriks2
        System.out.print("Masukkan jumlah kolom : ");
        columnB = sc.nextInt();//masukan kolomB matriks2
        matriks2 = new int[rowB][columnB];//inisialisasi barisB dan kolomB matriks2
        System.out.println("Enter the data :");
        for(int i=0; i<rowB; i++) {//pengulangan masukan barisB matriks2
            for(int j=0; j<columnB; j++) {//pengulangan masukan kolomB matriks2
                matriks2[i][j] = sc.nextInt();
            }
        }
    }
    
    void perkalian(){//method perkalian
        System.out.println("\nHasilnya adalah : ");
        int matriks3[][] = new int[rowA][columnB];//inisialisasi matriks ketiga dengan barisA dan kolomB
        for (int i = 0; i < matriks1.length; i++){//pengulangan dengan menghitung panjang matriks1
            for (int j = 0; j < matriks1[0].length; j++){//pengulangan dengan menghitung nilai anggota pertama matriks1
                hasil = 0;//deklarasi hasil = 0
                for (int k = 0; k < matriks1.length; k++){//pengulangan dengan menghitung panjang matriks1
                    hasil = hasil +  (matriks1[i][k] * matriks2[k][j]);//perkalian matriks
                }
                matriks3[i][j] = hasil;//penyimpanan hasil kedalam matriks3
            }
        }

        for (int i = 0; i < matriks3.length; i++){
            for (int j = 0; j < matriks3[0].length; j++){
                System.out.print( matriks3[i][j] + " ");//mendapatkan hasil perkalian
            }       
            System.out.println();
        }
    }
    
    void display1() {//method untuk menampilkan matriks1
      System.out.println("\nMatriks pertama adalah :");
      for(int i=0; i<rowA; i++) {//pengulangan untuk menghitung panjang barisA matriks1
        for(int j=0; j<columnA; j++) {//pengulangan untuk menghitung panjang kolomA matriks1
            System.out.print("\t" + matriks1[i][j]);//print nilai matriks1
        }
        System.out.println();
        }
    }
    void display2() {//method untuk menampilkan matriks2
      System.out.println("\nMatriks kedua adalah :");
      for(int i=0; i<rowB; i++) {//pengulangan untuk meghitung panjang barisB matriks2
        for(int j=0; j<columnB; j++) {//pengulangan untuk menghitung panjang kolomB matriks2
            System.out.print("\t" + matriks2[i][j]);//print nilai matriks2
        }
        System.out.println();
        }
    }
  
    public static void main(String[] args){
        Perkalian obj = new Perkalian();//inisialisasi objek perkalian
        obj.inputMatriks1();//memanggil method inputmatriks1
        obj.display1();//memanggil method dispay1
        obj.inputMatriks2();//memanggil method inputmatriks2
        obj.display2();//memanggil method display2
        obj.perkalian();//memanggil method perkalian
    }
}
