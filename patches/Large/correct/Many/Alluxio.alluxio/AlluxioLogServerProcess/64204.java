diff --git a/logserver/src/main/java/alluxio/logserver/AlluxioLogServerProcess.java b/logserver/src/main/java/alluxio/logserver/AlluxioLogServerProcess.java
index c6e8e6e..b78d1e9 100644
--- a/logserver/src/main/java/alluxio/logserver/AlluxioLogServerProcess.java
+++ b/logserver/src/main/java/alluxio/logserver/AlluxioLogServerProcess.java
@@ -53,7 +53,7 @@
  */
 public class AlluxioLogServerProcess implements Process {
   private static final String LOGSERVER_CLIENT_LOGGER_APPENDER_NAME = "LOGSERVER_CLIENT_LOGGER";
-  private static final Logger LOG = LoggerFactory.getLogger(AlluxioLogServer.class);
+  private static final Logger LOG = LoggerFactory.getLogger(AlluxioLogServerProcess.class);
   private static final long STOP_TIMEOUT_MS = 60000;
   private static final int BASE_SLEEP_TIME_MS = 50;
   private static final int MAX_SLEEP_TIME_MS = 30000;
