diff --git a/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java b/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
index 944f97c..a9237de 100644
--- a/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
+++ b/cas-server-support-jpa-ticket-registry/src/test/java/org/jasig/cas/ticket/registry/JpaTicketRegistryTests.java
@@ -156,7 +156,7 @@
             executor.shutdownNow();
         }
 
-        TicketGrantingTicket tgtFromDb = (TicketGrantingTicket) getTicketInTransaction(newTgt.getId());
+        final TicketGrantingTicket tgtFromDb = (TicketGrantingTicket) getTicketInTransaction(newTgt.getId());
         assertEquals(CONCURRENT_SIZE, tgtFromDb.getCountOfUses());
     }
 
