diff --git a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingSQLExceptionMapper.java b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingSQLExceptionMapper.java
index 99b5a6e..504c190 100644
--- a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingSQLExceptionMapper.java
+++ b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingSQLExceptionMapper.java
@@ -24,7 +24,7 @@
     }
 
     @VisibleForTesting
-    static void setLogger(Logger newLogger) {
+    static synchronized void setLogger(Logger newLogger) {
         logger = newLogger;
     }
 }
