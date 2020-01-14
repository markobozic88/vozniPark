public class Vozilo {
    private String tipVozila;
    private int zapreminaMotora;
    private int godinaProizvodnje;
    Vozilo(){ }
    Vozilo(Vozilo v){
        this.tipVozila = v.tipVozila;
        this.zapreminaMotora = v.zapreminaMotora;
        this.godinaProizvodnje = v.godinaProizvodnje;
    }
    public int getZapreminaMotora() {
        return zapreminaMotora;
    }
    public void setZapreminaMotora(int zapreminaMotora) {
        this.zapreminaMotora = zapreminaMotora;
    }
    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }
    public String getTipVozila() {
        return tipVozila;
    }
    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }
    @Override
    public String toString() {
        if (this.getTipVozila().equals("p")){
            return "Vozilo je tipa putnicko, ima zapreminu motora " + this.getZapreminaMotora() + " cmm i proizvedeno je " + this.getGodinaProizvodnje() + ". godine.";
        } else {
            if (this.getTipVozila().equals("m")){
                return "Vozilo je tipa motocikl, ima zapreminu motora " + this.getZapreminaMotora() + " cmm i proizvedeno je " + this.getGodinaProizvodnje() + ". godine.";
            } else {
                return "Unesite p za putnicko ili m za motocikl";
            }
        }
    }
}
