package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Imenik {
    private Map<String, TelefonskiBroj> brojevi;

    public Imenik() {
        this.brojevi = new HashMap<>();
    }

    public Map<String, TelefonskiBroj> getBrojevi() {
        return brojevi;
    }

    public void setBrojevi(Map<String, TelefonskiBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        this.brojevi.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = brojevi.get(ime);
        if(broj != null)
            return broj.ispisi();
        return null;
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String, TelefonskiBroj> entry : brojevi.entrySet()) {
            if(entry.getValue().ispisi().equals(broj.ispisi())) { // koristimo metodu ispisi() zbog toga sto nemamo implementiranu equals() metodu
                return entry.getKey();
            }
        }
        return null;
    }

    public String naSlovo(char s) {
        
    }

    public Set<String> izGrada(Grad g) {

    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {

    }
}
