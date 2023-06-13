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
public class dsModul{
    private ArrayList<String> id_modul;
    private ArrayList<String> nama_modul;
    private ArrayList<String> link;
    private ArrayList<String> static_konten;
    private ArrayList<String> gambar;
    private ArrayList<String> status;
    private ArrayList<String> aktif;
    private ArrayList<String> urutan;
    
    public dsModul() {
        id_modul = new ArrayList<String>();
        nama_modul = new ArrayList<String>();
        link = new ArrayList<String>();
        static_konten = new ArrayList<String>();
        gambar = new ArrayList<String>();
        status = new ArrayList<String>();
        aktif = new ArrayList<String>();
        urutan = new ArrayList<String>();
    }
    
    public void insertid_modul(String isi){
        this.id_modul.add(isi);
    }
    public ArrayList<String> getRecordid_modul(){
        return this.id_modul;
    }
    
    public void insertnama_modul(String isi){
        this.nama_modul.add(isi);
    }
    public ArrayList<String> getRecordnama_modul(){
        return this.nama_modul;
    }
    
    public void insertlink(String isi){
        this.link.add(isi);
    }
    public ArrayList<String> getRecordlink(){
        return this.link;
    }
    
    public void insertstatic_konten(String isi){
        this.static_konten.add(isi);
    }
    public ArrayList<String> getRecordstatic_konten(){
        return this.static_konten;
    }
    
    public void insertgambar(String isi){
        this.gambar.add(isi);
    }
    public ArrayList<String> getRecordgambar(){
        return this.gambar;
    }
    public void insertstatus(String isi){
    this.status.add(isi);
    }
    public ArrayList<String> getRecordstatus(){
        return this.status;
    }
    
    public void insertaktif(String isi){
        this.aktif.add(isi);
    }
    public ArrayList<String> getRecordaktif(){
        return this.aktif;
    }
    
    public void inserturutan(String isi){
        this.urutan.add(isi);
    }
    public ArrayList<String> getRecordurutan(){
        return this.urutan;
    }
    
    public void insertBarang(String id_modul, String nama_modul, String link, String static_konten, 
            String gambar, String status, String aktif, String urutan){
        this.id_modul.add(id_modul);
        this.nama_modul.add(nama_modul);
        this.link.add(link);
        this.static_konten.add(static_konten);
        this.gambar.add(gambar);
        this.status.add(status);
        this.aktif.add(aktif);
        this.urutan.add(urutan);
        
    }
}