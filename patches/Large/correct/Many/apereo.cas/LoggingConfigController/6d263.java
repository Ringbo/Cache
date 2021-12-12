diff --git a/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/LoggingConfigController.java b/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/LoggingConfigController.java
index ea92c83..fa34b40 100644
--- a/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/LoggingConfigController.java
+++ b/cas-server-support-reports/src/main/java/org/apereo/cas/web/report/LoggingConfigController.java
@@ -101,7 +101,7 @@
         }
                 
         outputFileNames.forEach(s -> {
-            final Tailer t = new Tailer(new File(s), new LogTailerListener(), 1000, false);
+            final Tailer t = new Tailer(new File(s), new LogTailerListener(), 1000, false, true);
             final Thread thread = new Thread(t);
             thread.setPriority(Thread.MIN_PRIORITY);
             thread.setName(s);
