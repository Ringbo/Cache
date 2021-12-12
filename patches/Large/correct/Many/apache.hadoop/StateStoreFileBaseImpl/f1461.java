diff --git a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/driver/impl/StateStoreFileBaseImpl.java b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/driver/impl/StateStoreFileBaseImpl.java
index 6638d1c..15fc9c1 100644
--- a/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/driver/impl/StateStoreFileBaseImpl.java
+++ b/hadoop-hdfs-project/hadoop-hdfs-rbf/src/main/java/org/apache/hadoop/hdfs/server/federation/store/driver/impl/StateStoreFileBaseImpl.java
@@ -361,7 +361,7 @@
           try {
             writer.close();
           } catch (IOException e) {
-            LOG.error("Cannot close the writer for {}", recordPathTemp);
+            LOG.error("Cannot close the writer for {}", recordPathTemp, e);
           }
         }
       }
