
package Tugas;

public class buku {
     public String novel;
    public String komik;
    public String dongeng;

    public buku(String novel, String komik, String dongeng) {
        this.novel = novel;
        this.komik = komik;
        this.dongeng = dongeng;
    }

    public void setNovel(String novel) {
        this.novel = novel;
    }

    public void setKomik(String komik) {
        this.komik = komik;
    }

    public void setDongeng(String dongeng) {
        this.dongeng = dongeng;
    }
}
