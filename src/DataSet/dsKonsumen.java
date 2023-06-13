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
public class dsKonsumen {
    private ArrayList<String> id_konsumen;
    private ArrayList<String> nama_user;
    private ArrayList<String> password;
    private ArrayList<String> email_user;
    private ArrayList<String> alamat_user;
    private ArrayList<String> nama_produk;
    private ArrayList<String> kodepos_user;
    private ArrayList<String> kota_user;
    private ArrayList<String> telepon;
    private ArrayList<String> tanggal;
    private ArrayList<String> jumlah;
    
    public dsKonsumen() {
        id_konsumen = new ArrayList<String>();
        nama_user = new ArrayList<String>();
        password = new ArrayList<String>();
        email_user = new ArrayList<String>();
        alamat_user = new ArrayList<String>();
        nama_produk= new ArrayList<String>();
        kodepos_user = new ArrayList<String>();
        kota_user = new ArrayList<String>();
        telepon = new ArrayList<String>();
        tanggal = new ArrayList<String>();
        jumlah = new ArrayList<String>();
    }
    
    public void insertid_konsumen(String isi){
        this.id_konsumen.add(isi);
    }
    public ArrayList<String> getRecordid_konsumen(){
        return this.id_konsumen;
    }
    
    public void insertnama_user(String isi){
        this.nama_user.add(isi);
    }
    public ArrayList<String> getRecordnama_user(){
        return this.nama_user;
    }
    
    public void insertpassword(String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordpassword(){
        return this.password;
    }
    
    public void insertemail_user(String isi){
        this.email_user.add(isi);
    }
    public ArrayList<String> getRecordemail_user(){
        return this.email_user;
    }
    
    public void insertalamat_user(String isi){
        this.alamat_user.add(isi);
    }
    public ArrayList<String> getRecordalamat_user(){
        return this.alamat_user;
    }
    public void insertnama_produk(String isi){
    this.nama_produk.add(isi);
    }
    public ArrayList<String> getRecordnama_produk(){
        return this.nama_produk;
    }
    
    public void insertkodepos_user(String isi){
        this.kodepos_user.add(isi);
    }
    public ArrayList<String> getRecordkodepos_user(){
        return this.kodepos_user;
    }
    
    public void inserttelepon(String isi){
        this.telepon.add(isi);
    }
    public ArrayList<String> getRecordtelepon(){
        return this.telepon;
    }
    
    public void inserttanggal(String isi){
        this.tanggal.add(isi);
    }
    public ArrayList<String> getRecordtanggal(){
        return this.tanggal;
    }
    
    public void insertjumlah(String isi){
        this.jumlah.add(isi);
    }
    public ArrayList<String> getRecordjumlah(){
        return this.jumlah;
    }
    
    public void insertBarang(String id_konsumen, String nama_user, String password, String email_user, 
            String alamat_user, String nama_produk, String kodepos_user, String kota_user, String telepon, 
            String tanggal, String jumlah){
        
        this.id_konsumen.add(id_konsumen);
        this.nama_user.add(nama_user);
        this.password.add(password);
        this.email_user.add(email_user);
        this.alamat_user.add(alamat_user);
        this.nama_produk.add(nama_produk);
        this.kodepos_user.add(kodepos_user);
        this.kota_user.add(kota_user);
        this.telepon.add(telepon);
        this.tanggal.add(tanggal);
        this.jumlah.add(jumlah);
        
    }
}