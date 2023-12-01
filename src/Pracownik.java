public class Pracownik {
    private String nazwisko;
    private String imie;
    private String pesel;
    private int staz;
    private double pensja;

    private char plec;

    Pracownik() {

    }

    Pracownik(String nazwisko, String imie, String pesel, int staz, double pensja) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.pesel = pesel;
        this.staz = staz;
        this.pensja = pensja;
        plec(pesel);
    }

    public void wyswietl() {
        System.out.println("|" + String.format("%-15s", nazwisko) + "|" + String.format("%-15s", imie) + "|" + String.format("%-15s", pesel) + "|" + String.format("%15s", plec) + "|" + String.format("%15s", staz) + "|" + String.format("%15s", pensja) + "|");
//        String.format("");
    }

    public String toString() {
        return (nazwisko + " " + imie + " " + pesel +" "+  plec + " " + staz + " " + pensja);

    }

    public void plec (String pesel) {
        if (Integer.parseInt(String.valueOf(pesel.charAt(9))) % 2 == 0) {
            this.plec = 'K';
        } else this.plec = 'M';

    }
        public void podwyzka (){
        if (staz == 50 ){
            pensja = pensja + 0.1 * pensja;
        }
    }

    public void setStaz(int staz) {

        this.staz = staz;
         podwyzka();
    }

    public void zwiekszStaz(){
        staz++;
        podwyzka();
    }
}
