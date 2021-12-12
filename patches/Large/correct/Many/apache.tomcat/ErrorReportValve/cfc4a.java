diff --git a/java/org/apache/catalina/valves/ErrorReportValve.java b/java/org/apache/catalina/valves/ErrorReportValve.java
index 3ff3f77..f32812a 100644
--- a/java/org/apache/catalina/valves/ErrorReportValve.java
+++ b/java/org/apache/catalina/valves/ErrorReportValve.java
@@ -152,7 +152,7 @@
         // Do nothing if there is no report for the specified status code
         String report = null;
         try {
-            report = sm.getString("http." + statusCode, message);
+            report = sm.getString("http." + statusCode);
         } catch (Throwable t) {
             ExceptionUtils.handleThrowable(t);
         }
