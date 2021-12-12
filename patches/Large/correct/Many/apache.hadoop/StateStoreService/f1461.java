diff --git a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/StateStoreService.java b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/StateStoreService.java
index ccbde09..a0744a6 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/StateStoreService.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/StateStoreService.java
@@ -183,7 +183,7 @@
     } catch (NotCompliantMBeanException e) {
       throw new RuntimeException("Bad StateStoreMBean setup", e);
     } catch (MetricsException e) {
-      LOG.info("Failed to register State Store bean {}", e.getMessage());
+      LOG.error("Failed to register State Store bean {}", e.getMessage());
     }
 
     super.serviceInit(this.conf);
