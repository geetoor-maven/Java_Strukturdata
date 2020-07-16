
package Arraylist;


public class Mobil {
    
    private String merekmobil;
    private String namapemilik;
    private Integer tahunkeluar;
    private Integer harga;

    public Mobil(String merekmobil, String namapemilik, Integer tahunkeluar, Integer harga) {
        this.merekmobil = merekmobil;
        this.namapemilik = namapemilik;
        this.tahunkeluar = tahunkeluar;
        this.harga = harga;
    }

    public String getMerekmobil() {
        return merekmobil;
    }

    public void setMerekmobil(String merekmobil) {
        this.merekmobil = merekmobil;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    public Integer getTahunkeluar() {
        return tahunkeluar;
    }

    public void setTahunkeluar(Integer tahunkeluar) {
        this.tahunkeluar = tahunkeluar;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    
    
    
}
