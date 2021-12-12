diff --git a/api/cas-server-core-api-ticket/src/main/java/org/apereo/cas/ticket/TicketGrantingTicket.java b/api/cas-server-core-api-ticket/src/main/java/org/apereo/cas/ticket/TicketGrantingTicket.java
index a79173f..382cdb2 100644
--- a/api/cas-server-core-api-ticket/src/main/java/org/apereo/cas/ticket/TicketGrantingTicket.java
+++ b/api/cas-server-core-api-ticket/src/main/java/org/apereo/cas/ticket/TicketGrantingTicket.java
@@ -113,6 +113,6 @@
      * @since 5.1
      */
     default Collection<String> getDescendantTickets() {
-        return new HashSet<>();
+        return new HashSet<>(0);
     }
 }
