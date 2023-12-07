public class Main {
    public static void main(String[] args){
        String mesaj = "Bugun hava çok güzel";
        String yeniMesaj =sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(5,7,9,7,5);
        System.out.println(toplam);


    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void güncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1 + sayi1;
    }
    public static String sehirVer(){
        return "İstanbul";
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayı : sayilar){
            toplam += sayı;
        }
        return toplam;
    }
}