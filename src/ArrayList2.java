/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
import java.util.ArrayList;

public class ArrayList2 {
    private static ArrayList2 instance;
    ArrayList<Ticket> tickets;

    private ArrayList2() {
        tickets = new ArrayList<>();
    }
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    
    public static ArrayList2 getInstance() {
        if (instance == null) {
            instance = new ArrayList2();
        }
        return instance;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    public void updateTicket(Ticket oldTicket, Ticket newTicket) {
        int index = tickets.indexOf(oldTicket);
        if (index != -1) {
            tickets.set(index, newTicket);
        }
    }

    public Ticket getTicket(String ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(ticketId)) {  
                return ticket;
            }
        }
        return null;
    }

    public int size() {
        return tickets.size();
    }
}