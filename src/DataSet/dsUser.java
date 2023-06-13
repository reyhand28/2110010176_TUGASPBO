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
public class dsUser{
    private ArrayList<Integer> id_user;
    private ArrayList<String> nama_user;
    private ArrayList<Integer> login_user;
    private ArrayList<Integer> pass_user;
    private ArrayList<Integer> email_user;
    private ArrayList<Integer> alamat_user;
    private ArrayList<Integer> kodepos_user;
    private ArrayList<Integer> telepon;
    private ArrayList<Integer> status;
    
    public dsUser() {
        id_user = new ArrayList<Integer>();
        nama_user = new ArrayList<String>();
        login_user = new ArrayList<Integer>();
        pass_user = new ArrayList<Integer>();
        email_user = new ArrayList<Integer>();
        alamat_user = new ArrayList<Integer>();
        kodepos_user = new ArrayList<Integer>();
        telepon = new ArrayList<Integer>();
        status = new ArrayList<Integer>();
    }
    
    public void insertid_user(int isi){
        this.id_user.add(isi);
    }
    public ArrayList<Integer> getRecordid_user(){
        return this.id_user;
    }
    
    public void insertnama_user(String isi){
        this.nama_user.add(isi);
    }
    public ArrayList<String> getRecordnama_user(){
        return this.nama_user;
    }
    
    public void insertlogin_user(int isi){
        this.login_user.add(isi);
    }
    public ArrayList<Integer> getRecordlogin_user(){
        return this.login_user;
    }
    
    public void insertpass_user(int isi){
        this.pass_user.add(isi);
    }
    public ArrayList<Integer> getRecordpass_user(){
        return this.pass_user;
    }
    
    public void insertemail_user(int isi){
        this.email_user.add(isi);
    }
    public ArrayList<Integer> getRecordemail_user(){
        return this.email_user;
    }
    public void insertalamat_user(int isi){
        this.alamat_user.add(isi);
    }
    public ArrayList<Integer> getRecordalamat_user(){
        return this.alamat_user;
    }
    public void insertkodepos_user(int isi){
        this.kodepos_user.add(isi);
    }
    public ArrayList<Integer> getRecordkodepos_user(){
        return this.kodepos_user;
    }
    public void inserttelepon(int isi){
        this.telepon.add(isi);
    }
    public ArrayList<Integer> getRecordtelepon(){
        return this.telepon;
    }
    public void insertstatus(int isi){
    this.status.add(isi);
    }
    public ArrayList<Integer> getRecordstatus(){
        return this.status;
    }
    
    public void insertBarang(int id_user, String nama_user, int login_user, int pass_user, 
            int email_user, int alamat_user, int kodepos_user, int telepon, int status){
        this.id_user.add(id_user);
        this.nama_user.add(nama_user);
        this.login_user.add(login_user);
        this.pass_user.add(pass_user);
        this.email_user.add(email_user);
        this.alamat_user.add(alamat_user);
        this.kodepos_user.add(kodepos_user);
        this.telepon.add(telepon);
        this.status.add(status);
        
    }
}