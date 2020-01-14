public abstract class VozniPark {
    private String adresa;
    VozniPark(){ }
    abstract double porezNaCeneRegistracije(int godina);
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
