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
public class dsKategori {
    private ArrayList<String> id_kategori;
    private ArrayList<String> nama_kategori;
    private ArrayList<String> kategori_seo;
    
    public dsKategori() {
        id_kategori = new ArrayList<String>();
        nama_kategori = new ArrayList<String>();
        kategori_seo = new ArrayList<String>();

    }
    
    public void insertid_kategori(String isi){
        this.id_kategori.add(isi);
    }
    public ArrayList<String> getRecordid_kategori(){
        return this.id_kategori;
    }
    
    public void insertnama_kategori(String isi){
        this.nama_kategori.add(isi);
    }
    public ArrayList<String> getRecordnama_kategori(){
        return this.nama_kategori;
    }
    
    public void insertkategori_seo(String isi){
        this.kategori_seo.add(isi);
    }
    public ArrayList<String> getRecordSkategori_seo(){
        return this.kategori_seo;
    }
    
    public void insertBarang(String id_kategori, String nama_kategori, String kategori_seo){
        this.id_kategori.add(id_kategori);
        this.nama_kategori.add(nama_kategori);
        this.kategori_seo.add(kategori_seo);
        
    }
}