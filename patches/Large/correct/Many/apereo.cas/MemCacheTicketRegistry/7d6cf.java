diff --git a/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistry.java b/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistry.java
index a996af8..d76174c 100644
--- a/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistry.java
+++ b/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/MemCacheTicketRegistry.java
@@ -186,7 +186,7 @@
     private static int getTimeout(final Ticket ticket) {
         final int ttl = ticket.getExpirationPolicy().getTimeToLive().intValue();
         if (ttl == 0) {
-            return -1;
+            return 1;
         }
         return ttl;
     }
