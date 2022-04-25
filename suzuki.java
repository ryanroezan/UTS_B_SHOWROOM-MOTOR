import java.util.Scanner;
//superclass
public class suzuki {
    //Atribut
    public String nama;
    public String warna;
    public int tahunProduksi;
    public String TipeMotor;
    public String name, alamat,nomerTelepon;
    public int harga;
    Scanner in = new Scanner(System.in);
    
    //constructor
    suzuki(String nama, String warna, int tahunProduksi, String TipeMotor,int harga){
      this.nama=nama;
      this.warna =warna;
      this.tahunProduksi=tahunProduksi;
      this.TipeMotor=TipeMotor;
      this.harga=harga;
    }
    
    //Method
    void detailMotor(){
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("|                 Detail Motor                   |");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama Motor     : "+nama);
        System.out.println("Warna Motor    : "+warna);
        System.out.println("Tahun Produksi : "+tahunProduksi);
        System.out.println("Tipe Motor     : "+TipeMotor);
        System.out.println("Harga Motor    : "+harga);
        System.out.println("--------------------------------------------------");
    }
    
    //method
    void display(){
        System.out.print("Buat Pesanan? YA/TIDAK : ");
        String pesan=in.next();
        switch (pesan){
            case "YA":
        System.out.println("");
        System.out.print("Masukkan nama Anda     : ");
        name = in.next();
        System.out.print("Masukkan alamat        : ");
        alamat = in.next();
        System.out.print("Masukkan nomer telepon : ");
        nomerTelepon=in.next();
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("+======================+=========================+");
        System.out.println(">Pesanan Anda<");
        System.out.println("Nama Pembeli   : "+name);
        System.out.println("Alamat Pembeli : "+alamat);
        System.out.println("Nomer telepon  : "+nomerTelepon);
        System.out.println("");
        System.out.println("Nama Motor     : "+nama);
        System.out.println("Warna Motor    : "+warna);
        System.out.println("Tahun Produksi : "+tahunProduksi);
        System.out.println("Tipe Motor     : "+TipeMotor);
        System.out.println("Harga Motor    : "+harga);
        System.out.println("+======================+=========================+");
        System.out.println("*Terima kasih karena telah melakukan pembelian di Showroom kami*");
        
        break;
            case "TIDAK":
                System.out.println("Terimakasih telah menggunakan aplikasi ini");
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }
    }
}
        