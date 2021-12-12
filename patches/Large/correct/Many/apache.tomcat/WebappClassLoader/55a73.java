diff --git a/java/org/apache/catalina/loader/WebappClassLoader.java b/java/org/apache/catalina/loader/WebappClassLoader.java
index 7c54ffe..3cbf878 100644
--- a/java/org/apache/catalina/loader/WebappClassLoader.java
+++ b/java/org/apache/catalina/loader/WebappClassLoader.java
@@ -1822,12 +1822,12 @@
                     if (isRequestThread(thread)) {
                         log.error(sm.getString("webappClassLoader.warnRequestThread",
                                 getContextName(), threadName));
-                        log.error(sm.getString("webappClassLoader.stackTraceRequestThread",
+                        log.info(sm.getString("webappClassLoader.stackTraceRequestThread",
                                 threadName, getStackTrace(thread)));
                     } else {
                         log.error(sm.getString("webappClassLoader.warnThread",
                                 getContextName(), threadName));
-                        log.error(sm.getString("webappClassLoader.stackTrace",
+                        log.info(sm.getString("webappClassLoader.stackTrace",
                                 threadName, getStackTrace(thread)));
                     }
 
