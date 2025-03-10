# PemlanTugas1
> Daffa Ramadhan Jauhari

**code:**
1. [MainMobil.java](MainMobil.java)
2. [Mobil.java](Mobil.java)

## Analisa dan Dokumentasi
### 1. Membuat lebih interaktif dengan meminta inputan dari user
> - Menggunakan Scanner sebagai input dari user

</br>

### 2. Menambahkan method `setWaktu` pada class Mobil yang berparameter _double_
**inputan user dengan satuan waktu jam**
```java
    // method setWaktu dalam parameter double (no. 4) 
    public void setWaktu (double waktu){
        this.waktu = rubahsekon(waktu);
    }
```
</br>

### 3. Menambahkan method `rubahsekon`untuk mengubah satuan waktu dari jam menjadi detik
> - Method ini hanya dapat dipanggil di class mobil, artinya ini enkapsulasi **private** User tidak bisa mengubah satuan waktu secara langsung dari luar class Mobil
> - Method ini dipanggil pada display **setWaktu** dengan nilai parameter yang sama

```java
    // method ubah sekon yang hanya bisa dipanggil di class ini untuk merubah waktu dari jam ke sekon (no. 5)
    private double rubahsekon(double sekon){
        return sekon*3600;
    }
```
</br>

### 4. Menambahkan method `rubahkecepatan` untuk mengubah satuan kecepatan dari km/h menjadi m/s
> - Method ini hanya dapat dipanggil di class mobil, artinya ini enkapsulasi **private** User tidak bisa mengubah satuan waktu secara langsung dari luar class Mobil
> - Dipanggil pada method `display` untuk menampilkan kecepatan dalam satuan m/s

```java
    // menambah method untuk mengubah kecepatan dari km/h ke m/s (no.6)
    private double rubahkecepatan(double cpatan){
        return cpatan*(3.6);
    }
```

</br>

### 5. Menambahkan method `hitungJarak` yang berfungsi untuk menghitung jarak yang ditempuh oleh mobil dalam satuan meter
```java
     // menambah method untuk menghitung jarak (np. 7)
    public double hitungJarak(double kecepatanpermtr, double waktu){
        return (waktu*kecepatanpermtr);
    }
```

</br>

### 6. Menambahkan output pada method `display`, yaitu jarak tempuh mobil yang dikonversi menjadi satuan km dari meter
```java
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
```


## Output dari kode
![alt text](https://github.com/daffarj/PemlanTugas1/blob/main/public/Screenshot%202025-03-10%20213446.png?raw=true)
