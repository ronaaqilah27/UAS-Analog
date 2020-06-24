/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

/**
 *
 * @author Asus
 */
public class Kendaraan {
    String nomorpolisi;
    String namapemilik;
    String alamat;
    String merk;
    String tahunpembuatan;
    String bahanbakar;
    boolean jenis;
    boolean warnaplat;
    int isisilinder;
    int nomorrangka;
    int nomormesin;

    Kendaraan(String text, String text0, String text1, String text2, String text3, String text4, String jeniss, String warna, int isilinder, int nomorrangka, int nomormesin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNomorPolisi(String nomorpolisi) {
        this.nomorpolisi = nomorpolisi;
    }
    public String getNomorPolisi() {
        return this.nomorpolisi;
    }
    public void setNamaPemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }
    public String getNamaPemilik() {
        return this.namapemilik;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return this.merk;
    }
    public void setTahunPembuatan(String tahunpembuatan) {
        this.tahunpembuatan = tahunpembuatan;
    }
    public String getTahunPembuatan() {
        return this.tahunpembuatan;
    }
    public void setBahanBakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }
    public String getBahanBakar() {
        return this.bahanbakar;
    }
    public void setJenis(boolean jenis) {
        this.jenis = jenis;
    }
    public boolean isJenis() {
        return this.jenis;
    }
    public void setWarnaPlat(boolean warnaplat) {
        this.warnaplat = warnaplat;
    }
    public boolean isWarnaPlat() {
        return this.warnaplat;
    }
    public void setIsiSilinder(int isisilinder) {
        this.isisilinder = isisilinder;
    }
    public int getIsiSilinder() {
        return this.isisilinder;
    }
    public void setNomorRangka(int nomorrangka) {
        this.nomorrangka = nomorrangka;
    }
    public int getNomorRangka() {
        return this.nomorrangka;
    }
    public void setNomorMesin(int nomormesin) {
        this.nomormesin = nomormesin;
    }
    public int getNomorMesin() {
        return this.nomormesin;
    }
    
    public Kendaraan(String nomorpolisi, String namapemilik, String alamat, int isisilinder,
            int nomorrangka, int nomormesin) {
        this.nomorpolisi = nomorpolisi;
        this.namapemilik = namapemilik;
        this.alamat = alamat;
        this.isisilinder = isisilinder;
        this.nomorrangka = nomorrangka;
        this.nomormesin = nomormesin;
    }
    
    public Kendaraan(String nomorpolisi, String namapemilik,  String alamat, String merk, String tahunpembuatan,  String bahanbakar, boolean jenis, 
            boolean warnaplat, int isisilinder, int nomorrangka, int nomormesin) {
        this(nomorpolisi,namapemilik,alamat,isisilinder,nomorrangka,nomormesin);
        this.jenis = jenis;
        this.warnaplat = warnaplat;
    }

    void setJenis(String jeniss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setWarnaPlat(String warna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
