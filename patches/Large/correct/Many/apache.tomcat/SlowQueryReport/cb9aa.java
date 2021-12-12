diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport.java
index 7ee7910..5c11f21 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport.java
@@ -234,7 +234,7 @@
         final String logfailed = "logFailed";
         InterceptorProperty p1 = properties.get(threshold);
         InterceptorProperty p2 = properties.get(maxqueries);
-        InterceptorProperty p3 = properties.get(logSlow);
+        InterceptorProperty p3 = properties.get(logslow);
         InterceptorProperty p4 = properties.get(logfailed);
         if (p1!=null) {
             setThreshold(Long.parseLong(p1.getValue()));
