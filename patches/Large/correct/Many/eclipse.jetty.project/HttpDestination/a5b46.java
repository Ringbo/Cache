diff --git a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpDestination.java b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpDestination.java
index 0939423..dcd4f98 100644
--- a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpDestination.java
+++ b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpDestination.java
@@ -371,7 +371,7 @@
         if (removed)
         {
             int open = connectionCount.decrementAndGet();
-            LOG.info("Removed connection {} for {} - open: {}", connection, this, open);
+            LOG.debug("Removed connection {} for {} - open: {}", connection, this, open);
         }
 
         // We need to execute queued requests even if this connection failed.
