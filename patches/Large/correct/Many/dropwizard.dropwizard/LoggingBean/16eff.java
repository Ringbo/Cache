diff --git a/dropwizard-core/src/main/java/com/yammer/dropwizard/logging/LoggingBean.java b/dropwizard-core/src/main/java/com/yammer/dropwizard/logging/LoggingBean.java
index 44ca89e..eec0383 100644
--- a/dropwizard-core/src/main/java/com/yammer/dropwizard/logging/LoggingBean.java
+++ b/dropwizard-core/src/main/java/com/yammer/dropwizard/logging/LoggingBean.java
@@ -17,7 +17,7 @@
 public class LoggingBean implements LoggingMXBean {
     @Override
     public String getLoggerLevel(String loggerName) {
-        return Logger.getLogger(loggerName).getLevel().toString();
+        return Logger.getLogger(loggerName).getEffectiveLevel().toString();
     }
 
     @Override
