diff --git a/src/main/java/org/acra/builder/ReportExecutor.java b/src/main/java/org/acra/builder/ReportExecutor.java
index 77751f2..599c10e 100644
--- a/src/main/java/org/acra/builder/ReportExecutor.java
+++ b/src/main/java/org/acra/builder/ReportExecutor.java
@@ -89,7 +89,7 @@
 
     public void handReportToDefaultExceptionHandler(Thread t, Throwable e) {
         if (defaultExceptionHandler != null) {
-            ACRA.log.e(LOG_TAG, "ACRA is disabled for " + context.getPackageName()
+            ACRA.log.i(LOG_TAG, "ACRA is disabled for " + context.getPackageName()
                     + " - forwarding uncaught Exception on to default ExceptionHandler");
             defaultExceptionHandler.uncaughtException(t, e);
         } else {
