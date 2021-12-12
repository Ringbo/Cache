diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/common/Storage.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/common/Storage.java
index 4a019b7..cef7d23 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/common/Storage.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/common/Storage.java
@@ -433,7 +433,7 @@
         if (!root.exists()) {
           // storage directory does not exist
           if (startOpt != StartupOption.FORMAT) {
-            LOG.info("Storage directory " + rootPath + " does not exist");
+            LOG.warn("Storage directory " + rootPath + " does not exist");
             return StorageState.NON_EXISTENT;
           }
           LOG.info(rootPath + " does not exist. Creating ...");
@@ -442,15 +442,15 @@
         }
         // or is inaccessible
         if (!root.isDirectory()) {
-          LOG.info(rootPath + "is not a directory");
+          LOG.warn(rootPath + "is not a directory");
           return StorageState.NON_EXISTENT;
         }
         if (!root.canWrite()) {
-          LOG.info("Cannot access storage directory " + rootPath);
+          LOG.warn("Cannot access storage directory " + rootPath);
           return StorageState.NON_EXISTENT;
         }
       } catch(SecurityException ex) {
-        LOG.info("Cannot access storage directory " + rootPath, ex);
+        LOG.warn("Cannot access storage directory " + rootPath, ex);
         return StorageState.NON_EXISTENT;
       }
 
