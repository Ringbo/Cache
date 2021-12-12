diff --git a/src/java/org/apache/cassandra/service/NativeTransportService.java b/src/java/org/apache/cassandra/service/NativeTransportService.java
index d63b2b6..28e7dac 100644
--- a/src/java/org/apache/cassandra/service/NativeTransportService.java
+++ b/src/java/org/apache/cassandra/service/NativeTransportService.java
@@ -158,7 +158,7 @@
      */
     public static boolean useEpoll()
     {
-        final boolean enableEpoll = Boolean.valueOf(System.getProperty("cassandra.native.epoll.enabled", "true"));
+        final boolean enableEpoll = Boolean.parseBoolean(System.getProperty("cassandra.native.epoll.enabled", "true"));
         return enableEpoll && Epoll.isAvailable();
     }
 
