
package uts;

public class binarySearching {

    public static void main(String[] args) {
        // TODO code application logic here
        int A[]= {3, 10, 4, 2, 8, 13};
        int cari= 8;
        int indeksAwal =0;
        int indeksAkhir =A.length-1;
        int ketemu=0;
        int point=0;
        
        System.out.println("isi data adalah ");
        for(int i=0; i<A.length; i++){
            
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((indeksAwal <= indeksAkhir) && (ketemu ==0)){
            point =(indeksAwal + indeksAkhir )/2;
            System.out.println("indeks pointer" + point);
            if(cari == A[point]){
                ketemu=1;
                System.out.println("data" +cari+ "Telah ditemukan indeks ke " +point);
            }
            else if(cari < A[point]){
                System.out.println("Cari dikiri ");
                indeksAkhir = point-1;
            }
            else{
                indeksAwal=point+1;
                System.out.println("Cari dikanan ");
            }
        }
        if(ketemu ==1){
            System.out.println("kesimpulan data ditemukan");
        }
        else{
            System.out.println("kesimpulan data tidak ditemukan");
                
            }
        }
        
    }
    

