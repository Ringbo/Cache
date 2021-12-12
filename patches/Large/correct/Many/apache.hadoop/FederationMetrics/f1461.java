diff --git a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/metrics/FederationMetrics.java b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/metrics/FederationMetrics.java
index a99a26a..970bd4f 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/metrics/FederationMetrics.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/metrics/FederationMetrics.java
@@ -456,7 +456,7 @@
         dev = (float) Math.sqrt(dev / usages.length);
       }
     } catch (IOException e) {
-      LOG.info("Cannot get the live nodes: {}", e.getMessage());
+      LOG.error("Cannot get the live nodes: {}", e.getMessage());
     }
 
     final Map<String, Object> innerInfo = new HashMap<>();
