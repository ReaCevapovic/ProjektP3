package ffos.p3.serijeapk;

public class Serije {

    private int sifra;
    private String nazivSerije;
    private String zanr;
    private String redatelj;
    private String jezik;
    private String anotacija;

    public Serije(int sifra, String nazivSerije, String zanr, String redatelj, String jezik, String anotacija) {
        this.sifra = sifra;
        this.nazivSerije = nazivSerije;
        this.zanr = zanr;
        this.redatelj = redatelj;
        this.jezik = jezik;
        this.anotacija = anotacija;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNazivSerije() {
        return nazivSerije;
    }

    public void setNazivSerije(String nazivSerije) {
        this.nazivSerije = nazivSerije;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getRedatelj() {
        return redatelj;
    }

    public void setRedatelj(String redatelj) {
        this.redatelj = redatelj;
    }

    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getAnotacija() {
        return anotacija;
    }

    public void setAnotacija(String anotacija) {
        this.anotacija = anotacija;
    }
}
