diff --git a/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java b/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
index 901be8b..cd83b05 100644
--- a/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
+++ b/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
@@ -173,7 +173,7 @@
       LOG.info("Skipping load balancing.  servers=" + numServers + " " +
           "regions=" + numRegions + " average=" + average + " " +
           "mostloaded=" + serversByLoad.lastKey().getLoad().getNumberOfRegions() +
-          " leastloaded=" + serversByLoad.lastKey().getLoad().getNumberOfRegions());
+          " leastloaded=" + serversByLoad.firstKey().getLoad().getNumberOfRegions());
       return null;
     }
 
