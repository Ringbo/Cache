diff --git a/graylog2-inputs/src/main/java/org/graylog2/inputs/transports/SyslogTcpTransport.java b/graylog2-inputs/src/main/java/org/graylog2/inputs/transports/SyslogTcpTransport.java
index 805cdb1..a4c043b 100644
--- a/graylog2-inputs/src/main/java/org/graylog2/inputs/transports/SyslogTcpTransport.java
+++ b/graylog2-inputs/src/main/java/org/graylog2/inputs/transports/SyslogTcpTransport.java
@@ -62,7 +62,7 @@
         return new InstrumentedExecutorService(
                 Executors.newCachedThreadPool(threadFactory),
                 metricRegistry,
-                name(HttpTransport.class, executorName, "executor-service"));
+                name(SyslogTcpTransport.class, executorName, "executor-service"));
     }
 
 
