diff --git a/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java b/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
index a1f0511..435df51 100644
--- a/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
+++ b/cas-server-integration-memcached/src/test/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistryTests.java
@@ -95,7 +95,7 @@
         when(ticket.getExpirationPolicy()).thenReturn(new AlwaysExpiresExpirationPolicy());
         when(ticket.getId()).thenReturn(id);
         registry.addTicket(ticket);
-        Thread.sleep(500);
+        Thread.sleep(1000);
         Assert.assertNull(registry.getTicket(id, ServiceTicket.class));
     }
 
