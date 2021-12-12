diff --git a/camel-core/src/main/java/org/apache/camel/processor/Logger.java b/camel-core/src/main/java/org/apache/camel/processor/Logger.java
index 984b774..9b57c99 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/Logger.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/Logger.java
@@ -255,7 +255,7 @@
             break;
         case INFO:
             if (log.isInfoEnabled()) {
-                log.debug(message, exception);
+                log.info(message, exception);
             }
             break;
         case TRACE:
