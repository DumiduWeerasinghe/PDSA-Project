/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Ticket {
    private int ticketId;
    private String customerName;
    private String issueDescription;
    private String status;

    public Ticket(String ticketId, String customerName, String issueDescription) {
    this.ticketId = Integer.parseInt(ticketId);
    this.customerName = customerName;
    this.issueDescription = issueDescription;
    this.status = "Open";
}

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        setStatus(newStatus);
    }

    public void updateDescription(String newDescription) {
        setIssueDescription(newDescription);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ticket ticket = (Ticket) obj;
        return ticketId == ticket.ticketId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(ticketId);
    }
    
    public String getId() {
        return String.valueOf(ticketId);
    }
}
