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
public class dsKota {
    private ArrayList<String> id_kota;
    private ArrayList<String> nama_kota;
    private ArrayList<String> ongkos_kirim;
    
    public dsKota() {
        id_kota = new ArrayList<String>();
        nama_kota = new ArrayList<String>();
        ongkos_kirim = new ArrayList<String>();

    }
    
    public void insertid_kota(String isi){
        this.id_kota.add(isi);
    }
    public ArrayList<String> getRecordid_kota(){
        return this.id_kota;
    }
    
    public void insertnama_kota(String isi){
        this.nama_kota.add(isi);
    }
    public ArrayList<String> getRecordnama_kota(){
        return this.nama_kota;
    }
    
    public void insertongkos_kirim(String isi){
        this.ongkos_kirim.add(isi);
    }
    public ArrayList<String> getRecordSongkos_kirim(){
        return this.ongkos_kirim;
    }
    
    public void insertBarang(String id_kota, String nama_kota, String ongkos_kirim){
        this.id_kota.add(id_kota);
        this.nama_kota.add(nama_kota);
        this.ongkos_kirim.add(ongkos_kirim);
        
    }
}