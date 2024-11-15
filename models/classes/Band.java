package UTSS.models.classes;

import UTSS.models.enumm.Genre;

public class Band extends Artist {
    private int numberOfMember;

    public Band(String name, double performancefee, Genre genre, int numberOfMember) {
        super(name, performancefee, genre);
        this.numberOfMember = numberOfMember;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("jumlah member : " + this.numberOfMember);
    }

}
