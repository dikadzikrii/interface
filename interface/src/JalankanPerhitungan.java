import model.*;


public class JalankanPerhitungan {
    

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(5,7,0);


        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = s.hsltmbh(15, 5);
        System.out.println(hasiltambahnya);



        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = s.hslkli(35, 20);
        System.out.println(hasilkalinya);  
    }
}
