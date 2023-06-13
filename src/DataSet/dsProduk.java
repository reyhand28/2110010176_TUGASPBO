/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class dsProduk {
    private ArrayList<String> id_produk;
    private ArrayList<String> id_kategori;
    private ArrayList<String> nama_produk;
    private ArrayList<String> produk_seo;
    private ArrayList<String> deskripsi;
    private ArrayList<String> harga;
    private ArrayList<String> stok;
    private ArrayList<String> ukuran;
    private ArrayList<String> berat;
    private ArrayList<String> tgl_masuk;
    private ArrayList<String> gambar;
    private ArrayList<String> dibeli;
    private ArrayList<String> diskon;
    private ArrayList<String> status;
    
    public dsProduk() {
        id_produk = new ArrayList<String>();
        id_kategori = new ArrayList<String>();
        nama_produk = new ArrayList<String>();
        produk_seo = new ArrayList<String>();
        deskripsi = new ArrayList<String>();
        harga= new ArrayList<String>();
        stok = new ArrayList<String>();
        ukuran = new ArrayList<String>();
        berat = new ArrayList<String>();
        tgl_masuk = new ArrayList<String>();
        gambar = new ArrayList<String>();
        dibeli = new ArrayList<String>();
        diskon = new ArrayList<String>();
        status = new ArrayList<String>();
    }
    
    public void insertid_produk(String isi){
        this.id_produk.add(isi);
    }
    public ArrayList<String> getRecordid_produk(){
        return this.id_produk;
    }
    
    public void insertid_kategori(String isi){
        this.id_kategori.add(isi);
    }
    public ArrayList<String> getRecordid_kategori(){
        return this.id_kategori;
    }
    
    public void insertnama_produk(String isi){
        this.nama_produk.add(isi);
    }
    public ArrayList<String> getRecordnama_produk(){
        return this.nama_produk;
    }
    
    public void insertproduk_seo(String isi){
        this.produk_seo.add(isi);
    }
    public ArrayList<String> getRecordproduk_seo(){
        return this.produk_seo;
    }
    
    public void insertdeskripsi(String isi){
        this.deskripsi.add(isi);
    }
    public ArrayList<String> getRecorddeskripsi(){
        return this.deskripsi;
    }
    public void insertharga(String isi){
    this.harga.add(isi);
    }
    public ArrayList<String> getRecordharga(){
        return this.harga;
    }
    
    public void insertstok(String isi){
        this.stok.add(isi);
    }
    public ArrayList<String> getRecordstok(){
        return this.stok;
    }
    
    public void insertukuran(String isi){
        this.ukuran.add(isi);
    }
    public ArrayList<String> getRecordukuran(){
        return this.ukuran;
    }
    
    public void insertberat(String isi){
        this.berat.add(isi);
    }
    public ArrayList<String> getRecordberat(){
        return this.berat;
    }
    
    public void inserttgl_masuk(String isi){
        this.tgl_masuk.add(isi);
    }
    public ArrayList<String> getRecordtgl_masuk(){
        return this.tgl_masuk;
    }
    public void insertgambar(String isi){
        this.gambar.add(isi);
    }
    public ArrayList<String> getRecordgambar(){
        return this.gambar;
    }
    
    public void insertdibeli(String isi){
        this.dibeli.add(isi);
    }
    public ArrayList<String> getRecorddibeli(){
        return this.dibeli;
    }
    public void insertdiskon(String isi){
        this.diskon.add(isi);
    }
    public ArrayList<String> getRecorddiskon(){
        return this.diskon;
    }
    public void insertstatus(String isi){
        this.status.add(isi);
    }
    public ArrayList<String> getRecordstatus(){
        return this.status;
    }
    
    public void insertBarang(String id_produk, String id_kategori, String nama_produk, String produk_seo, 
            String deskripsi, String harga, String stok, String ukuran, String berat, 
            String tgl_masuk, String gambar, String dibeli, String diskon, String status){
        
        this.id_produk.add(id_produk);
        this.id_kategori.add(id_kategori);
        this.nama_produk.add(nama_produk);
        this.produk_seo.add(produk_seo);
        this.deskripsi.add(deskripsi);
        this.harga.add(harga);
        this.stok.add(stok);
        this.ukuran.add(ukuran);
        this.berat.add(berat);
        this.tgl_masuk.add(tgl_masuk);
        this.gambar.add(gambar);
        this.dibeli.add(berat);
        this.diskon.add(diskon);
        this.status.add(status);
        
    }
}