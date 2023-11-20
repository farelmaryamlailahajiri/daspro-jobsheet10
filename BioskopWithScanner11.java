import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris,kolom;
        String nama,next;
        String[][] penonton = new String[4][2];
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris/kolom kursi tidak tersedia.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            System.out.println("Silakan memasukkan baris dan kolom kembali.");
                              continue;  
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.print("Input penonton lainnya? (y/n): ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("n")) {
                                break;
                            } 
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    boolean dftrPenonton = false;
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                dftrPenonton = true;
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                case 3:
                    exit = true;
                    System.out.println("Terima kasih dan silahkan datang di lain waktu");
                    break;
            }
        }
    }
}
