package de.sbs.fswi1.models;

import java.util.Objects;

public abstract class Mensch {
    protected String vorname, nachname;
    protected final String geburtsdatum;

    public Mensch(String vorname, String nachname, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    @Override
    public boolean equals(Object other) {
        
        if (other == null)
            return false;

        if (other == this)
            return true;

        if (other.getClass() != this.getClass())
            return false;

        Mensch mensch = (Mensch) other;

        // Aus vereinfachungsgründen NUR vergleich der Nachnamen
        if (mensch.nachname.equals(this.nachname)) {
            return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, geburtsdatum);
    }


}