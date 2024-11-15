package UTSS.controller;

import java.sql.Date;
import java.util.ArrayList;

import UTSS.models.classes.*;
import UTSS.models.enumm.*;

public class Controller {
    static ArrayList<PerformanceSchedule> listPerformanceSchedules = generateDataDummy();

    public static void main(String[] args) {
        System.out.println(
                listPerformanceSchedules.get(0).getTickets()[0].getTicketPrice());
    }

    public static ArrayList<PerformanceSchedule> generateDataDummy() {
        Vendor concertVendor1 = new Vendor("Harmony Sound Systems", "Audio Equipment", 15000.00);
        Vendor concertVendor2 = new Vendor("Brilliant Lights Co.", "Lighting", 20000.00);
        Vendor concertVendor3 = new Vendor("SafeSec", "Security Services", 12000.00);

        Artist rockBand = new Band("Rock Legends", 80000.00, Genre.ROCK, 5);
        Artist jazzBand = new Band("Blue Note Collective", 60000.00, Genre.JAZZ_AND_BLUES, 7);
        Artist classicalBand = new Band("Orchestra Grande", 100000.00, Genre.CLASSICAL, 30);
        Artist popBand = new Band("Pop Vibes", 75000.00, Genre.POP, 4);

        Artist rockSolo = new SoloArtist("Rock Star", 70000.00, Genre.ROCK, "Alex");
        Artist jazzSolo = new SoloArtist("Jazz Virtuoso", 50000.00, Genre.JAZZ_AND_BLUES, "Jamie");
        Artist classicalSolo = new SoloArtist("Classical Prodigy", 90000.00, Genre.CLASSICAL, "Emma");
        Artist popSolo = new SoloArtist("Pop Idol", 65000.00, Genre.POP, "Chris");

        Stage stage1 = new Stage("Mini Stage 1", 10, "Downtown Studio");
        Stage stage2 = new Stage("Intimate Open Air", 10, "Rooftop Venue");
        Stage stage3 = new Stage("Private Lounge", 10, "Exclusive Clubhouse");

        Ticket[] tickets1 = new Ticket[10];

        tickets1[0] = new Ticket(TicketType.REGULAR, 150.000, "T001");
        tickets1[1] = new Ticket(TicketType.REGULAR, 150.000, "T002");
        tickets1[2] = new Ticket(TicketType.REGULAR, 150.000, "T003");
        tickets1[3] = new Ticket(TicketType.REGULAR, 150.000, "T004");
        tickets1[4] = new Ticket(TicketType.REGULAR, 150.000, "T005");

        tickets1[5] = new Ticket(TicketType.VIP, 350.000, "T006");
        tickets1[6] = new Ticket(TicketType.VIP, 350.000, "T007");
        tickets1[7] = new Ticket(TicketType.VIP, 350.000, "T008");

        tickets1[8] = new Ticket(TicketType.INVITATION, 10.000, "T009");
        tickets1[9] = new Ticket(TicketType.INVITATION, 10.000, "T010");

        Ticket[] tickets2 = new Ticket[9];
        tickets2[0] = new Ticket(TicketType.REGULAR, 150.000, "T001");
        tickets2[1] = new Ticket(TicketType.REGULAR, 150.000, "T002");
        tickets2[2] = new Ticket(TicketType.REGULAR, 150.000, "T003");
        tickets2[3] = new Ticket(TicketType.REGULAR, 150.000, "T004");
        tickets2[4] = new Ticket(TicketType.REGULAR, 150.000, "T005");

        tickets2[5] = new Ticket(TicketType.VIP, 350.000, "T006");
        tickets2[6] = new Ticket(TicketType.VIP, 350.000, "T007");
        tickets2[7] = new Ticket(TicketType.VIP, 350.000, "T008");

        tickets2[8] = new Ticket(TicketType.INVITATION, 10.000, "T009");

        PerformanceSchedule schedule1 = new PerformanceSchedule(rockBand, new Date(0), new Date(0),
                new Vendor[] { concertVendor1, concertVendor2, concertVendor3 }, stage3, tickets1);
        PerformanceSchedule schedule2 = new PerformanceSchedule(classicalBand, new Date(0), new Date(0),
                new Vendor[] { concertVendor1, concertVendor2, concertVendor3 }, stage1, tickets2);
        PerformanceSchedule schedule3 = new PerformanceSchedule(classicalSolo, new Date(0), new Date(0),
                new Vendor[] { concertVendor1, concertVendor2, concertVendor3 }, stage2, tickets1);
        PerformanceSchedule schedule4 = new PerformanceSchedule(popBand, new Date(0), new Date(0),
                new Vendor[] { concertVendor1, concertVendor2, concertVendor3 }, stage3, tickets1);
        PerformanceSchedule schedule5 = new PerformanceSchedule(popSolo, null, null,
                new Vendor[] { concertVendor1, concertVendor2, concertVendor3 }, stage1, tickets2);

        ArrayList<PerformanceSchedule> listPerformanceSchedule = new ArrayList<>();
        listPerformanceSchedule.add(schedule5);
        listPerformanceSchedule.add(schedule4);
        listPerformanceSchedule.add(schedule3);
        listPerformanceSchedule.add(schedule2);
        listPerformanceSchedule.add(schedule1);

        return listPerformanceSchedule;
    }

    public void GenerateRevenueRecord() {
        System.out.print("\033[H\033[2J");  
        double totalReguler = 0;
        double totalVIP = 0;
        double totalInvited = 0;

        for (PerformanceSchedule performanceSchedule : listPerformanceSchedules) {
            for (int i = 0; i < performanceSchedule.getTickets().length; i++) {
                if (performanceSchedule.getTickets()[i].getTicketType() == TicketType.REGULAR) {
                    totalReguler += performanceSchedule.getTickets()[i].getTicketPrice();
                } else if (performanceSchedule.getTickets()[i].getTicketType() == TicketType.VIP) {
                    totalVIP += performanceSchedule.getTickets()[i].getTicketPrice();
                } else {
                    totalInvited += performanceSchedule.getTickets()[i].getTicketPrice();
                }
                
            } 
        }
            System.out.println("total pendapatan penjualan Tiket Reguler : " + totalReguler);
            System.out.println("total pendapatan penjualan Tiket VIP : " + totalVIP);
            System.out.println("total pendapatan penjualan Tiket Invitation : " + totalInvited);
    }
    
}
