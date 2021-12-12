diff --git a/hbase-backup/src/main/java/org/apache/hadoop/hbase/backup/util/BackupUtils.java b/hbase-backup/src/main/java/org/apache/hadoop/hbase/backup/util/BackupUtils.java
index 12f2f2f..da11756 100644
--- a/hbase-backup/src/main/java/org/apache/hadoop/hbase/backup/util/BackupUtils.java
+++ b/hbase-backup/src/main/java/org/apache/hadoop/hbase/backup/util/BackupUtils.java
@@ -327,7 +327,7 @@
       if (expMsg.contains("No FileSystem for scheme")) {
         newMsg =
             "Unsupported filesystem scheme found in the backup target url. Error Message: "
-                + newMsg;
+                + expMsg;
         LOG.error(newMsg);
         throw new IOException(newMsg);
       } else {
