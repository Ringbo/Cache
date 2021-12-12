diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/ozone/storage/StorageContainerManager.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/ozone/storage/StorageContainerManager.java
index 6567ae4..5ffcef1 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/ozone/storage/StorageContainerManager.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/ozone/storage/StorageContainerManager.java
@@ -247,7 +247,7 @@
     for (int r = 0; r < reports.length; r++) {
       final BlockListAsLongs storageContainerList = reports[r].getBlocks();
       blockManager.processReport(registration, reports[r].getStorage(),
-          storageContainerList, context, r == (reports.length - 1));
+          storageContainerList, context);
     }
     return null;
   }
