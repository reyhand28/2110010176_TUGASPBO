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
public class dsAdmin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> nama;
    private ArrayList<String> level;
    private ArrayList<String> email;
    
    public dsAdmin() {
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        nama = new ArrayList<String>();
        level = new ArrayList<String>();
        email = new ArrayList<String>();
    }
    
    public void insertusername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordusername(){
        return this.username;
    }
    
    public void insertpassword(String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordpassword(){
        return this.password;
    }
    
    public void insertnama(String isi){
        this.nama.add(isi);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    public void insertlevel(String isi){
        this.level.add(isi);
    }
    public ArrayList<String> getRecordlevel(){
        return this.level;
    }
    
    public void insertemail(String isi){
        this.email.add(isi);
    }
    public ArrayList<String> getRecordemail(){
        return this.email;
    }
    
    public void insertBarang(String username, String password, String nama, String level, 
            String email){
        this.username.add(username);
        this.password.add(password);
        this.nama.add(nama);
        this.level.add(level);
        this.level.add(level);
        
    }

   
}