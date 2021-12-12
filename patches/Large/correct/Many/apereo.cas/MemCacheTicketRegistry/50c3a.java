diff --git a/cas-server-support-memcached-ticket-registry/src/main/java/org/apereo/cas/ticket/registry/MemCacheTicketRegistry.java b/cas-server-support-memcached-ticket-registry/src/main/java/org/apereo/cas/ticket/registry/MemCacheTicketRegistry.java
index 0626f24..90c8ceb 100644
--- a/cas-server-support-memcached-ticket-registry/src/main/java/org/apereo/cas/ticket/registry/MemCacheTicketRegistry.java
+++ b/cas-server-support-memcached-ticket-registry/src/main/java/org/apereo/cas/ticket/registry/MemCacheTicketRegistry.java
@@ -47,7 +47,7 @@
         final Ticket ticket = encodeTicket(ticketToUpdate);
         logger.debug("Updating ticket {}", ticket);
         try {
-            if (!this.client.replace(ticket.getId(), getTimeout(ticket), ticket).get()) {
+            if (!this.client.replace(ticket.getId(), getTimeout(ticketToUpdate), ticket).get()) {
                 logger.error("Failed to update {}", ticket);
             }
         } catch (final InterruptedException e) {
@@ -68,7 +68,7 @@
         final Ticket ticket = encodeTicket(ticketToAdd);
         logger.debug("Adding ticket {}", ticket);
         try {
-            if (!this.client.add(ticket.getId(), getTimeout(ticket), ticket).get()) {
+            if (!this.client.add(ticket.getId(), getTimeout(ticketToAdd), ticket).get()) {
                 logger.error("Failed to add {}", ticket);
             }
         } catch (final InterruptedException e) {
