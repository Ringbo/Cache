diff --git a/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java b/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
index 43616cc..fe0faa1 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
@@ -201,7 +201,7 @@
       resilientFOS.postIOFailure(e);
     }
     finally {
-      if (fileLock != null) {
+      if (fileLock != null && fileLock.isValid()) {
         fileLock.release();
       }
 
