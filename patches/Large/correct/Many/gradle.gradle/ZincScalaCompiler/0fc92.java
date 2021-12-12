diff --git a/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java b/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
index e4735d6..85d47e3 100644
--- a/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
+++ b/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
@@ -88,26 +88,25 @@
         }
     }
 
-    // TODO: change log levels
     private static class SbtLoggerAdapter implements xsbti.Logger {
         public void error(F0<String> msg) {
-            LOGGER.lifecycle(msg.apply());
+            LOGGER.error(msg.apply());
         }
 
         public void warn(F0<String> msg) {
-            LOGGER.lifecycle(msg.apply());
+            LOGGER.warn(msg.apply());
         }
 
         public void info(F0<String> msg) {
-            LOGGER.lifecycle(msg.apply());
+            LOGGER.info(msg.apply());
         }
 
         public void debug(F0<String> msg) {
-            LOGGER.lifecycle(msg.apply());
+            LOGGER.debug(msg.apply());
         }
 
         public void trace(F0<Throwable> exception) {
-            LOGGER.lifecycle(exception.apply().toString());
+            LOGGER.trace(exception.apply().toString());
         }
     }
 }
