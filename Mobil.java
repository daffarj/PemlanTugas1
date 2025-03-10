public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setwarna(String warna){
        this.warna = warna;
    }

    public void setmanufaktur(String manufaktur){
        this.manufaktur = manufaktur;
    }

    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    // method setWaktu dalam parameter double (no. 4) 
    public void setWaktu (double waktu){
        this.waktu = rubahsekon(waktu);
    }

    // method ubah sekon yang hanya bisa dipanggil di class ini untuk merubah waktu dari jam ke sekon (no. 5)
    private double rubahsekon(double sekon){
        return sekon*3600;
    }

    // menambah method untuk mengubah kecepatan dari km/h ke m/s (no.6)
    private double rubahkecepatan(double cpatan){
        return cpatan*(3.6);
    }

    // menambah method untuk menghitung jarak (np. 7)
    public double hitungJarak(double kecepatanpermtr, double waktu){
        return (waktu*kecepatanpermtr);
    }


    public void display(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");
        System.out.printf("Atau %.2f m/s %n", rubahkecepatan(kecepatan));
        System.out.println("dengan waktu tempuh " + waktu/3600 + " jam");
        System.out.println("Atau dengan waktu " + waktu + " detik");
        System.out.println("Atau dengan jarak meter " + hitungJarak(kecepatan, waktu/3600)*1000 + " m");
        
        // output jarak km (no. 8)
        System.out.println("Atau dengan jarak tempuh " + hitungJarak(kecepatan, waktu/3600) + " km");
        System.out.println();
    }
}
