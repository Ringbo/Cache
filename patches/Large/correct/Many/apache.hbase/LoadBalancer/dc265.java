diff --git a/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java b/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
index 92acb35..9f01a96 100644
--- a/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
+++ b/src/main/java/org/apache/hadoop/hbase/master/LoadBalancer.java
@@ -243,7 +243,7 @@
         "servers=" + numServers + " " +
         "regions=" + numRegions + " average=" + average + " " +
         "mostloaded=" + serversByLoad.lastKey().getLoad() +
-        " leastloaded=" + serversByLoad.lastKey().getLoad());
+        " leastloaded=" + serversByLoad.firstKey().getLoad());
       return null;
     }
     int min = numRegions / numServers;
