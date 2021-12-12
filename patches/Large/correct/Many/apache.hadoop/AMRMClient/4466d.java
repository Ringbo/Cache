diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/AMRMClient.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/AMRMClient.java
index f343311..8c20b5f 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/AMRMClient.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/AMRMClient.java
@@ -159,7 +159,7 @@
       Preconditions.checkArgument(containerCount > 0,
           "The number of containers to request should larger than 0");
       Preconditions.checkArgument(
-              (!relaxLocality && (racks == null || racks.length == 0) 
+              !(!relaxLocality && (racks == null || racks.length == 0) 
                   && (nodes == null || nodes.length == 0)),
               "Can't turn off locality relaxation on a " + 
               "request with no location constraints");
