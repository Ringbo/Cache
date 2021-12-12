diff --git a/core/src/main/java/tachyon/conf/MasterConf.java b/core/src/main/java/tachyon/conf/MasterConf.java
index 6037abd..4d274fb 100644
--- a/core/src/main/java/tachyon/conf/MasterConf.java
+++ b/core/src/main/java/tachyon/conf/MasterConf.java
@@ -61,7 +61,7 @@
         (CommonConf.get().USE_ZOOKEEPER ? Constants.HEADER_FT : Constants.HEADER) + HOSTNAME + ":"
             + PORT;
     WEB_PORT = getIntProperty("tachyon.master.web.port", Constants.DEFAULT_MASTER_WEB_PORT);
-    WEB_THREAD_COUNT = getIntProperty("tachyon.master.web.threads", 5);
+    WEB_THREAD_COUNT = getIntProperty("tachyon.master.web.threads", 9);
     TEMPORARY_FOLDER = getProperty("tachyon.master.temporary.folder", "/tmp");
 
     HEARTBEAT_INTERVAL_MS =
