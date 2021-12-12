diff --git a/src/java/org/apache/cassandra/net/OutboundTcpConnection.java b/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
index ee30073..cb168bc 100644
--- a/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
+++ b/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
@@ -293,7 +293,7 @@
         catch (Exception e)
         {
             disconnect();
-            if (e instanceof IOException)
+            if (e instanceof IOException || e.getCause() instanceof IOException)
             {
                 if (logger.isDebugEnabled())
                     logger.debug("error writing to {}", poolReference.endPoint(), e);
