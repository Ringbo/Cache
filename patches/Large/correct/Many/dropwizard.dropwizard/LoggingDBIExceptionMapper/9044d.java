diff --git a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingDBIExceptionMapper.java b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingDBIExceptionMapper.java
index eb35d13..3e06ebb 100644
--- a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingDBIExceptionMapper.java
+++ b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/jersey/LoggingDBIExceptionMapper.java
@@ -29,7 +29,7 @@
     }
 
     @VisibleForTesting
-    static void setLogger(Logger newLogger) {
+    static synchronized void setLogger(Logger newLogger) {
         logger = newLogger;
     }
 }
