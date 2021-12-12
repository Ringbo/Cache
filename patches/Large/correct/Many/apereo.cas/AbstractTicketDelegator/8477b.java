diff --git a/cas-server-core-tickets/src/main/java/org/jasig/cas/ticket/registry/AbstractTicketDelegator.java b/cas-server-core-tickets/src/main/java/org/jasig/cas/ticket/registry/AbstractTicketDelegator.java
index 78fd81d..10a4e89 100644
--- a/cas-server-core-tickets/src/main/java/org/jasig/cas/ticket/registry/AbstractTicketDelegator.java
+++ b/cas-server-core-tickets/src/main/java/org/jasig/cas/ticket/registry/AbstractTicketDelegator.java
@@ -73,7 +73,7 @@
             return old;
         }
 
-        return this.ticketRegistry.getTicket(old.getId(), Ticket.class);
+        return this.ticketRegistry.getTicket(old.getId(), TicketGrantingTicket.class);
     }
 
     @Override
