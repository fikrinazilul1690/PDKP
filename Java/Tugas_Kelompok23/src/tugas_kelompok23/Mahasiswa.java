package tugas_kelompok23;

public class Mahasiswa {
    private String name;
    private int semester,nim;
    private float ip1,ip2,ip3,ip4,ip5,ip6,ip7,ip8,ipk,totalip;
    
    public Mahasiswa (){
        this.name = "";
        this.nim = 0;
        this.semester = 0;
        this.totalip = 0;
        this.ipk = 0;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setnim (int nim){
        this.nim = nim;
    }
    public void setsemester (int semester){
        this.semester = semester;
    }
    public void setip1( float ip1){
        this.ip1 = ip1;
    }
    public void setip2( float ip2){
        this.ip2 = ip2;
    }
    public void setip3( float ip3){
        this.ip3 = ip3;
    }
    public void setip4( float ip4){
        this.ip4 = ip4;
    }
    public void setip5( float ip5){
        this.ip5 = ip5;
    }
    public void setip6( float ip6){
        this.ip6 = ip6;
    }
    public void setip7( float ip7){
        this.ip7 = ip7;
    }
    public void setip8( float ip8){
        this.ip8 = ip8;
    }
    public void setttlip(){
        this.totalip = this.ip1+this.ip2+this.ip3+this.ip4+this.ip5+this.ip6+this.ip7+this.ip8;
    }
    public void setipk(){
        this.ipk = this.totalip/(this.semester - 1);
    }
    public String getname(){
        return name;
    }
    public int getnim(){
        return nim;
    }
    public int getsemester(){
        return semester;
    }
    public float gettotalip(){
        return totalip;
    }
    public float getipk(){
        return ipk;
    }
}
