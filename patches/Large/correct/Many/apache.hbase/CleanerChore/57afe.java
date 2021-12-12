diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/cleaner/CleanerChore.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/cleaner/CleanerChore.java
index 6d32122..8711c82 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/cleaner/CleanerChore.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/cleaner/CleanerChore.java
@@ -218,7 +218,7 @@
     }
     // delete this file if it passes all the cleaners
     LOG.debug("Removing:" + filePath + " from archive");
-    if (this.fs.delete(filePath, false)) {
+    if (!this.fs.delete(filePath, false)) {
       LOG.warn("Attempted to delete:" + filePath
           + ", but couldn't. Run cleaner chain and attempt to delete on next pass.");
     }
