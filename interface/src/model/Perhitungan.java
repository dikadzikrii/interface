package model;
import interfaces.interfaces;
public class Perhitungan implements interfaces  {
    public int a;  //the value of the field perhitungan  
    private int b; //the value of the field perhitungan  
    private int hasil; //the value of the field perhitungan  

    // public Perhitungan(int a, int b, int hasil) {
    //     this.a =a ;
    //     this.b =b ;
    //     this.hasil =hasil ;
    //     printJudulClass("jadi judul dalam class perhitungan ");
    // }
   public Perhitungan (int a, int b, int hasil){
        this.a =a ;
        this.b =b ;
        this.hasil =hasil ;
        printJudulClass("jadi judul dalam class perhitungan ");
    }
    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Dalam Interfaces");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
    }
    
    //Method Return dari hasil tambah dengan parameter
    public int hsltmbh(int a1,int b2){
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.hasil;
    }

    //Method return dari hasil kali
    public int hslkli(int _a,int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.hasil;
    }
}
