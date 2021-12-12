diff --git a/src/java/org/apache/cassandra/gms/Gossiper.java b/src/java/org/apache/cassandra/gms/Gossiper.java
index b4d453a..343d7e9 100644
--- a/src/java/org/apache/cassandra/gms/Gossiper.java
+++ b/src/java/org/apache/cassandra/gms/Gossiper.java
@@ -995,7 +995,7 @@
      */
     public void addSavedEndpoint(InetAddress ep)
     {
-        if (ep == FBUtilities.getBroadcastAddress())
+        if (ep == FBUtilities.getLocalAddress())
         {
             logger.debug("Attempt to add self as saved endpoint");
             return;
