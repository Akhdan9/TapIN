package id.my.ojrek.absensifirebase;

import java.io.Serializable;

public class Users implements Serializable {
    private String uid;
    private String nama;
    private String angkatan;
    private String telepon;


    public Users(String nama, String angkatan, String telepon) {
        this.nama = nama;
        this.angkatan = angkatan;
        this.telepon = telepon;
    }

    public Users() {

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }


}
