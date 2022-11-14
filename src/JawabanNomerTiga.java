import java.util.Scanner;

public class JawabanNomerTiga {
    public class check {
        static int jumlahplat = 10;
        static int Kudus = 0;
        static int Jakarta = 0;
        static int Jogja = 0;
        static int Karawang = 0;
        static int Solo = 0;
        static int sisakuota = 0;
        static boolean benar = false;
        String[] infoplat = new String[]{"k-kudus", "B-jakarta", "AB-jogja", "T-karawang", "AD-solo"};

        public static void main(String[] args) {
            String[] infoplat = new String[]{"k-kudus", "B-jakarta", "AB-jogja", "T-karawang", "AD-solo"};
            for (int i = 0; i < 8; i++) {
                Plat();
            }
        }

        public static void cekPlatNomor(String kodePlat) {
            if (kodePlat.contains("K")) {
                benar = true;
                Kudus++;
            } else if (kodePlat.contains("B")) {
                benar = true;
                Jakarta++;
            } else if (kodePlat.contains("AB")) {
                benar = true;
                Jogja++;
            } else if (kodePlat.contains("T")) {
                benar = true;
                Karawang++;
            } else if (kodePlat.contains("AD")) {
                benar = true;
                Solo++;
            } else {
                benar = false;
                System.out.println("kode yang anda isi salah harap isi kembali");
            }
        }

        static void Plat() {
            Scanner inputdata = new Scanner(System.in);
            System.out.println("masukkan plat nomor");
            String plat = inputdata.nextLine();

            cekPlatNomor(plat);

            if (benar) {
                printPlat();
            }
        }

        public static void printPlat() {
            sisakuota = jumlahplat - Kudus - Jakarta - Jogja - Karawang - Solo;
            System.out.println("Total Plat Kudus " + Kudus + " | " + " Total Plat Jakarta | " + Jakarta + " Total Plat Jogja | "
                    +Jogja +
                    " Total Plat Karawang | " + Karawang + " Total Plat Solo | " + Solo);
            System.out.println("jumlah plat : " + jumlahplat);
        }
    }

    public static void main(String[] args) {
        while (true){
            check.Plat();
        }
    }
}






