package lapangan;

import java.util.Scanner;

public class main_lapangan {

    public static int jumlahmahasiswa;
    public static int panjangLap;
    public static int lebarLap;
    public static int luasLap;
    public static double waktuu[] = new double[3];
    public static String namaa[] = new String[3];

   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        lapangan mahasiswa = new lapangan();
        lapangan mahasiswa2 = new lapangan();
        lapangan mahasiswa3 = new lapangan();

        jumlahmahasiswa = in.nextInt();
        panjangLap = in.nextInt();
        lebarLap = in.nextInt();
        luasLap = 2 * (panjangLap + lebarLap);

        //Mahasiswa 1
        String nim = in.next();
        String nama = in.next();
        int putaran = in.nextInt();
        int waktu = in.nextInt();
        mahasiswa.lapangan(nama, nim, putaran, waktu);
        waktuu[0] = mahasiswa.setJaraktempuh(luasLap)/waktu;
        namaa[0] = nama;

        //Mahasiswa 2
        nim = in.next();
        nama = in.next();
        putaran = in.nextInt();
        waktu = in.nextInt();
        mahasiswa2.lapangan(nama, nim, putaran, waktu);
        waktuu[1] = mahasiswa2.setJaraktempuh(luasLap)/waktu;
        namaa[1] = nama;

        //Mahasiswa 3
        nim = in.next();
        nama = in.next();
        putaran = in.nextInt();
        waktu = in.nextInt();
        mahasiswa3.lapangan(nama, nim, putaran, waktu);
        waktuu[2] = mahasiswa3.setJaraktempuh(luasLap)/waktu;
        namaa[2] = nama;

        System.out.println("");
        mahasiswa.displayPemain();
        mahasiswa2.displayPemain();
        mahasiswa3.displayPemain();

        //PEMENANG
        double max = waktuu[0];
        int k=0;
        for (int i = 0; i < jumlahmahasiswa; i++) {
            if (waktuu[i] > max) {
                max = waktuu[i];
            }
        }
        for (int i = 0; i <jumlahmahasiswa; i++) {
            if(max==waktuu[i]){
                k=i;
            }
        }
        System.out.println(namaa[k]);
           
            
        }
    }

