public class Zamowienie {

    private int id;
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    Klient getKlient() {
        return this.klient;
    }

    void setKlient(Klient klient) {
        this.klient = klient;
    }

    Produkt[] getProdukt() {
        return this.produkt;
    }

    void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }

    int[] getIlosci() {
        return this.ilosci;
    }

    void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    String getDataZamowienia() {
        return this.dataZamowienia;
    }

    void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    String getStatus() {
        return this.status;
    }

    void setStatus(String status) {
        this.status = status;
    }

    public Zamowienie(int id, Klient klient, Produkt[] produkt,
    int[] ilosci, String dataZamowienia, String status) {}




    public double obliczWartoscZamowienia() {

        double wartoscZamowienia = 0;

        return wartoscZamowienia;
    }

    public boolean zastosujZnizke () {

        if (klient.isCzyStaly()) {
            return true;
        } else {
            return false;
        }
    }

    public void wyswietlSzczegoly () {
        System.out.println();
    }



}
