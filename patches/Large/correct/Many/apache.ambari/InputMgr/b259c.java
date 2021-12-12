diff --git a/ambari-logsearch/ambari-logsearch-logfeeder/src/main/java/org/apache/ambari/logfeeder/InputMgr.java b/ambari-logsearch/ambari-logsearch-logfeeder/src/main/java/org/apache/ambari/logfeeder/InputMgr.java
index c64a007..d83642e 100644
--- a/ambari-logsearch/ambari-logsearch-logfeeder/src/main/java/org/apache/ambari/logfeeder/InputMgr.java
+++ b/ambari-logsearch/ambari-logsearch-logfeeder/src/main/java/org/apache/ambari/logfeeder/InputMgr.java
@@ -161,7 +161,7 @@
       }
 
       if (isCheckPointFolderValid) {
-        logger.warn("Using folder " + checkPointFolderFile
+        logger.info("Using folder " + checkPointFolderFile
           + " for storing checkpoints");
       }
     }
