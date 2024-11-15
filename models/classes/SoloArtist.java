package UTSS.models.classes;

import UTSS.models.enumm.Genre;

public class SoloArtist extends Artist {
    private String assistantName;

    public SoloArtist(String name, double performancefee, Genre genre, String assistantName) {
        super(name, performancefee, genre);
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }
    
    
}
