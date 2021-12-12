diff --git a/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java b/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
index 85d47e3..e4735d6 100644
--- a/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
+++ b/subprojects/scala/src/main/groovy/org/gradle/api/internal/tasks/scala/jdk6/ZincScalaCompiler.java
@@ -88,25 +88,26 @@
         }
     }
 
+    // TODO: change log levels
     private static class SbtLoggerAdapter implements xsbti.Logger {
         public void error(F0<String> msg) {
-            LOGGER.error(msg.apply());
+            LOGGER.lifecycle(msg.apply());
         }
 
         public void warn(F0<String> msg) {
-            LOGGER.warn(msg.apply());
+            LOGGER.lifecycle(msg.apply());
         }
 
         public void info(F0<String> msg) {
-            LOGGER.info(msg.apply());
+            LOGGER.lifecycle(msg.apply());
         }
 
         public void debug(F0<String> msg) {
-            LOGGER.debug(msg.apply());
+            LOGGER.lifecycle(msg.apply());
         }
 
         public void trace(F0<Throwable> exception) {
-            LOGGER.trace(exception.apply().toString());
+            LOGGER.lifecycle(exception.apply().toString());
         }
     }
 }
