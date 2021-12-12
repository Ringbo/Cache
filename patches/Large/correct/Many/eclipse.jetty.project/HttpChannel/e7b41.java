diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
index df4dceb..9ab2ba4 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpChannel.java
@@ -566,7 +566,7 @@
             if (LOG.isDebugEnabled())
                 LOG.debug(_request.getRequestURI(), failure);
             else
-                LOG.warn("{} {}",_request.getRequestURI(), failure);
+                LOG.warn(_request.getRequestURI(), failure);
         }
         else
         {
