package UTSS.models.classes;
import UTSS.models.enumm.*;
public abstract class Artist implements Ipayable {
    private String name;
    private double Performancefee; 
    private Genre genre;
    
    public Artist(String name, double performancefee, Genre genre) {
        this.name = name;
        this.Performancefee = performancefee;
        this.genre = genre;
    }

    @Override
    public double calculatePayment() { // untuk Artis
        return this.Performancefee;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPerformancefee() {
        return Performancefee;
    }
    public void setPerformancefee(double performancefee) {
        Performancefee = performancefee;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void getDetails(){
        System.out.println("name : " + this.name);
        System.out.println("performance fee : " + this.Performancefee);
        System.out.println("genre : " + this.genre);
    }
    
}
