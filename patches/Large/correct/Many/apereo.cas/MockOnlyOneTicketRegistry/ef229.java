diff --git a/cas-server-core/src/test/java/org/jasig/cas/MockOnlyOneTicketRegistry.java b/cas-server-core/src/test/java/org/jasig/cas/MockOnlyOneTicketRegistry.java
index 45d6e9b..03c00ec 100644
--- a/cas-server-core/src/test/java/org/jasig/cas/MockOnlyOneTicketRegistry.java
+++ b/cas-server-core/src/test/java/org/jasig/cas/MockOnlyOneTicketRegistry.java
@@ -65,6 +65,6 @@
 
     @Override
     public Collection<Ticket> getTickets() {
-        throw new IllegalArgumentException("Not implemented");
+        throw new UnsupportedOperationException("Not implemented");
     }
 }
