diff --git a/src/main/java/org/acra/file/BulkReportDeleter.java b/src/main/java/org/acra/file/BulkReportDeleter.java
index 3b1c3e6..a7423b4 100644
--- a/src/main/java/org/acra/file/BulkReportDeleter.java
+++ b/src/main/java/org/acra/file/BulkReportDeleter.java
@@ -32,7 +32,7 @@
 
         for (int i = 0; i < files.length - nrToKeep; i++) {
             if (!files[i].delete()) {
-                ACRA.log.e(LOG_TAG, "Could not delete report : " + files[i]);
+                ACRA.log.w(LOG_TAG, "Could not delete report : " + files[i]);
             }
         }
     }
