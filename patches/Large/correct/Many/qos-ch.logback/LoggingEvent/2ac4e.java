diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/spi/LoggingEvent.java b/logback-classic/src/main/java/ch/qos/logback/classic/spi/LoggingEvent.java
index c792217..6090f02 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/spi/LoggingEvent.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/spi/LoggingEvent.java
@@ -204,7 +204,7 @@
     this.getFormattedMessage();
     this.getThreadName();
     // fixes http://jira.qos.ch/browse/LBCLASSIC-104
-    if (mdcPropertyMap != null) {
+    if (mdcPropertyMap == null) {
         mdcPropertyMap = MDC.getCopyOfContextMap();
     }
   }
