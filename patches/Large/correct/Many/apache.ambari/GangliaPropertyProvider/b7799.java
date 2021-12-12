diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/ganglia/GangliaPropertyProvider.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/ganglia/GangliaPropertyProvider.java
index 6f5d025..e786681 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/ganglia/GangliaPropertyProvider.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/ganglia/GangliaPropertyProvider.java
@@ -455,7 +455,7 @@
 
         //Check if Ganglia server component is live
         if (!hostProvider.isGangliaCollectorComponentLive(clusterName)) {
-          LOG.info("Ganglia server component is not live");
+          LOG.debug("Ganglia server component is not live");
           return Collections.emptySet();
         }
 
