diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index df09171..b541332 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -1144,7 +1144,7 @@
                 {
                     nextRange = ranges.get(i);
                     nextEndpoints = getLiveSortedEndpoints(table, nextRange.right);
-                    nextFilteredEndpoints = consistency_level.filterForQuery(table, liveEndpoints);
+                    nextFilteredEndpoints = consistency_level.filterForQuery(table, nextEndpoints);
 
                     List<InetAddress> merged = intersection(liveEndpoints, nextEndpoints);
 
