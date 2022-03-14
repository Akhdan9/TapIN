package id.my.ojrek.absensifirebase;

import java.io.Serializable;

public class Users implements Serializable {
    private String uid;
    private String nama;
    private String email;
    private String telepon;
    private String instagram;
    private String facebook;
    private String twitter;

    public Users(String nama, String email, String telepon, String instagram, String facebook, String twitter) {
        this.nama = nama;
        this.email = email;
        this.telepon = telepon;
        this.instagram = instagram;
        this.facebook = facebook;
        this.twitter = twitter;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook){
        this.facebook = facebook;
    }

    public String getTwitter(){
        return twitter;
    }

    public void setTwitter(){
        this.twitter = twitter;
    }

}
