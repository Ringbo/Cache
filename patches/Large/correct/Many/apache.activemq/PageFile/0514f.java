diff --git a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/disk/page/PageFile.java b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/disk/page/PageFile.java
index 17d6a54..dbd7dc8 100644
--- a/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/disk/page/PageFile.java
+++ b/activemq-kahadb-store/src/main/java/org/apache/activemq/store/kahadb/disk/page/PageFile.java
@@ -1091,7 +1091,7 @@
             if (enableDiskSyncs) {
                 // Sync to make sure recovery buffer writes land on disk..
                 if (enableRecoveryFile) {
-                    writeFile.sync();
+                    recoveryFile.sync();
                 }
                 writeFile.sync();
             }
