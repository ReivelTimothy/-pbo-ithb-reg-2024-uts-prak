package UTSS.models.classes;

import UTSS.models.enumm.TicketType;

public class Ticket {
    private TicketType ticketType;
    private double ticketPrice;
    private String ticketNum;

    public Ticket(TicketType ticketType, double ticketPrice, String ticketNum) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketNum = ticketNum;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }
    
    
}
