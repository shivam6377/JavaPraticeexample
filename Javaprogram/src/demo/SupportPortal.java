package demo;
class SupportTicket {
int resolved_ticket = 0;
int unresolved_ticket = 0;



synchronized void ticketRaised(int ticket) {
System.out.println(ticket + " ticket Created successfully");
unresolved_ticket+=ticket;
System.out.println(unresolved_ticket+" unresolved ticket left");

}
synchronized void ticketResolved(int ticket){
if (unresolved_ticket<ticket){
System.out.println("ticket "+ticket);
System.out.println(ticket + " ticket Not Resolved becouse the total ticket will be leass then "+unresolved_ticket);
System.out.println("unresolved_ticket"+unresolved_ticket);
}
else{
unresolved_ticket -= ticket;
System.out.println(ticket + " ticket Resolved successfully");
System.out.println(unresolved_ticket + " unResolved ");


}
}
}
public class SupportPortal extends Thread {

static SupportTicket m;
int ticket;



public void run() {
m.ticketRaised(ticket);
m.ticketResolved(ticket);
}

public static void main(String[] args) {

m = new SupportTicket();
SupportPortal user1 = new SupportPortal();
user1.ticket = 5;
user1.start();
SupportPortal user2 = new SupportPortal();
user2.ticket = 2;
user2.start();
}
}



