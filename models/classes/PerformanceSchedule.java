package UTSS.models.classes;

import java.sql.Date;

public class PerformanceSchedule {
    private Date startTime;
    private Date endTime;
    private Vendor[] vendor;
    private Stage stage;
    private Ticket[] tickets;
    private Artist artist;

    public PerformanceSchedule(Artist artist, Date startTime, Date endTime, Vendor[] vendor, Stage stage,
            Ticket[] tickets) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.vendor = vendor;
        this.stage = stage;
        this.tickets = tickets;
        this.artist = artist;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Vendor[] getVendor() {
        return vendor;
    }

    public void setVendor(Vendor[] vendor) {
        this.vendor = vendor;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
