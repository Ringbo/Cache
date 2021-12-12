diff --git a/src/java/org/apache/cassandra/service/AntiEntropyService.java b/src/java/org/apache/cassandra/service/AntiEntropyService.java
index eafab67..f766303 100644
--- a/src/java/org/apache/cassandra/service/AntiEntropyService.java
+++ b/src/java/org/apache/cassandra/service/AntiEntropyService.java
@@ -849,7 +849,7 @@
                 allEndpoints.add(FBUtilities.getBroadcastAddress());
 
                 if (isSequential)
-                    makeSnapshots(endpoints);
+                    makeSnapshots(allEndpoints);
 
                 for (InetAddress endpoint : allEndpoints)
                     treeRequests.add(new TreeRequest(getName(), endpoint, range, new CFPair(tablename, cfname)));
