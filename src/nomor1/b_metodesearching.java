
package nomor1;

import java.util.Scanner;

public class b_metodesearching {
    
public static void bubble(int[]A){
        int i=1,j,n=A.length;
        int temp;
        while(i<n){
            j=n-1;
            while(j>=i){
                if (A[j-1]>A[j]){
                    temp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
                j=j-1;
            }
            i=i+1;
            }
        }
    public static void tampil(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int []A={3, 10, 4, 2, 8, 13 };
       b_metodesearching.tampil(A);
       b_metodesearching.bubble(A);
       b_metodesearching.tampil(A);

        int cari;
        int awal = 0;
        int akhir=A.length-1;
        int ketemu=0;
        int point=0;

        System.out.println("isi data adalah: ");
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin di cari: ");
        cari=input.nextInt();
        while((awal<=akhir)&&(ketemu==0)){
            point=(awal+akhir)/2;
            System.out.println("Indeks pointer" +point);
            if(cari==A[point]){
                ketemu=1;
                System.out.println("Data" + cari +"telah ditemukan indeks ke" + point + "baris ke" + (point+1));
            }
            else if(cari<A[point]){
                System.out.println("cari dari kiri");
            }
            else{
                awal=point+1;
                System.out.println("cari dari kanan");
            }
        }
        if(ketemu==1){
            System.out.println("Data ditemukan ");
        }
        else{
            System.out.println("Data tidak ditemukan ");
            }
        }
    }
