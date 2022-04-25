import java.util.Scanner;
//mainclass
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+======================+=========================+");
        System.out.println("|                SHOWROOM MOTOR                  |");
        System.out.println("+======================+=========================+");
        System.out.println("--------------------------------------------------");
        System.out.println("                  Menu Showroom");
        System.out.println("--------------------------------------------------");
            System.out.println("1. Suzuki");
            System.out.println("2. Honda");
            System.out.println("3. Yamaha");
            System.out.println("4. Kawasaki");
            System.out.print("Masukkan pilihanmu : ");
        int pilih = input.nextInt();
        
        //seleksi kondisi switch untuk menentukan pilihan brand motor
        //nanti akan memunculkan jenis motor 
        switch(pilih){
            case 1:
                System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>+++ Motor Suzuki +++<<<<<<<<<<<<<");
            System.out.println("Jenis Matic");
            System.out.println("Suzuki Address FI (Kode : AF1)");
            System.out.println("\nJenis Bebek");
            System.out.println("Suzuki Satria Fu (Kode : FU2)");
            System.out.println("\nJenis Skuter");
            System.out.println("Suzuki Skywave (Kode : SK3)");
            System.out.println("\nJenis Dual Sport");
            System.out.println("Suzuki RMZ450X (Kode : RM4)");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
            System.out.print("Masukkan Kode Motor pilihanmu : ");
            String pilih1=input.next();
            
            //seleksi kondisi switch menentukan pilihan motor
            switch(pilih1){
            case "AF1":
                //membuat objek dan mengisi Scanner
             suzuki a =new suzuki("Suzuki Address FI","Putih",2020,"Matic",15000000);
             //memanggil method dengan objek
             a.detailMotor();
             a.display();
               break;
             case "FU2":
            suzuki b =new suzuki("Suzuki Satria FU","Hitam",2019,"Bebek",17000000);
             b.detailMotor();
             b.display();
               break;
              case "SK3":
             suzuki c =new suzuki("Suzuki Skywave","Biru",2020,"Skuter",16000000);
             c.detailMotor();
             c.display();
               break;
             case "RM4":
             suzuki d = new suzuki("Suzuki RMZ450X", "Hitam", 2021, "Dual Sport", 45000000);
             d.detailMotor();
             d.display();
            break;
            default:
                 System.out.println("Kode yang anda masukkan salah");
            }
            break;
            
            case 2:
                System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>>+++ Motor Honda +++<<<<<<<<<<<<<");
            System.out.println("Jenis Matic");
            System.out.println("Honda Scoopy (Kode : HS1)");
            System.out.println("\nJenis Bebek");
            System.out.println("Honda Supra (Kode : SP2)");
            System.out.println("\nJenis Skuter");
            System.out.println("Honda Giorno (Kode : HG3)");
            System.out.println("\nJenis Dual Sport");
            System.out.println("Honda CRF (Kode : HC4)");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
            System.out.print("Masukkan Kode Motor pilihanmu : ");
        String pilih2=input.next();

            switch(pilih2){
            case "HS1":
             honda a =new honda("Honda Scoopy","Stylish Brown",2021,"Matic",21000000);
            a.detailMotor();
            a.display();
               break;
             case "SP2":
            honda b =new honda("Honda Supra","Red Doff",2020,"Bebek",17500000);
             b.detailMotor();
             b.display();
               break;
              case "HG3":
             honda c =new honda("Honda Giorno","Blue Ice",2021,"Skuter",16000000);
             c.detailMotor();
             c.display();
               break;
             case "HC4":
             honda d = new honda("Honda CRF", "Sportiy Black", 2022, "Dual Sport", 35000000);
             d.detailMotor();
             d.display();
             break;
             default:
                 System.out.println("Kode yang anda masukkan salah");
            }
            break;
    case 3:
    System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>>+++ Motor Yamaha +++<<<<<<<<<<<<");
            System.out.println("Jenis Matic");
            System.out.println("Yamaha Mio (Kode : YM1)");
            System.out.println("\nJenis Bebek");
            System.out.println("nYamaha Jupiter (Kode : YJ2)");
            System.out.println("\nJenis Skuter");
            System.out.println("Yamaha Fazzio (Kode : YF3)");
            System.out.println("\nJenis Dual Sport");
            System.out.println("Yamaha XT250 (Kode : YX4)");
            System.out.print("Masukkan Kode Motor pilihanmu : ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
        String pilih3=input.next();
 
            switch(pilih3){
            case "YM1":
             yamaha a =new yamaha("Yamaha Mio","Prestige White",2021,"Matic",18000000);
             a.detailMotor();
             a.display();
               break;
             case "SP2":
            yamaha b =new yamaha("Yamaha Jupiter","Green Stylish",2020,"Bebek",15000000);
             b.detailMotor();
             b.display();
               break;
              case "HG3":
             yamaha c =new yamaha("Yamaha Fazzio","Classic Cream",2021,"Skuter",30000000);
             c.detailMotor();
             c.display();
               break;
             case "HC4":
             yamaha d = new yamaha("Yamaha XT250", "Red Doff", 2022, "Dual Sport", 40000000);
             d.detailMotor();
             d.display();
              break;
              default:
                 System.out.println("Kode yang anda masukkan salah");
            }
            break;
            case 4:
                System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>+++ Motor Kawasaki +++<<<<<<<<<<<");
            System.out.println("Jenis Matic");
            System.out.println("Kawasaki J300 (Kode : KJ1)");
            System.out.println("\nJenis Bebek");
            System.out.println("nKawasaki Kaze (Kode : KZ2)");
            System.out.println("\nJenis Skuter");
            System.out.println("YKawasaki J125 (Kode : JK3)");
            System.out.println("\nJenis Dual Sport");
            System.out.println("Kawasaki KLX (Kode : KL4)");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
            System.out.print("Masukkan Kode Motor pilihanmu : ");
        String pilih4=input.next();

            switch(pilih4){
            case "KJ1":
             kawasaki a =new kawasaki("Kawasaki J300","White Sporty",2021,"Matic",19000000);
            a.detailMotor();
            a.display();
               break;
             case "KZ2":
            kawasaki b =new kawasaki("Kawasaki Kaze","Green",2020,"Bebek",16500000);
             b.detailMotor();
             b.display();
               break;
              case "JK3":
             kawasaki c =new kawasaki("Kawasaki J125","brown",2021,"Skuter",29000000);
             c.detailMotor();
             c.display();
               break;
             case "KL4":
             kawasaki d = new kawasaki("Kawasaki KLX", "Green sport", 2022, "Dual Sport", 40000000);
             d.detailMotor();
             d.display();
              break;
              default:
                 System.out.println("Kode yang anda masukkan salah");
            }
            break;
        }
    }
}