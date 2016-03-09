package lapangan;

public class lapangan {

    //Atribute
    
    
    
    int jumlah_putaran;
    int jumlah_waktu;
    int jarakTempuh;
    int waktu;
    String nim;
    String nama;

    //Behaviour
    
    public void lapangan(String nama, String nim, int jumlah_putaran, int jumlah_waktu) {
        this.nama = nama;
        this.nim = nim;
        this.jumlah_putaran = jumlah_putaran;
        this.jumlah_waktu = jumlah_waktu;
    }

    public int setJaraktempuh(int luasLap) {
        jarakTempuh = luasLap * jumlah_putaran;
       return jarakTempuh;
    }
    public void displayPemain(){
        System.out.println(nama +" , "+jarakTempuh+"");
               
    }
}
