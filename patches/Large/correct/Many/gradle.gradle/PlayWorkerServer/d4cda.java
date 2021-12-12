diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/internal/run/PlayWorkerServer.java b/subprojects/platform-play/src/main/java/org/gradle/play/internal/run/PlayWorkerServer.java
index f94498e..f00ec09 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/internal/run/PlayWorkerServer.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/internal/run/PlayWorkerServer.java
@@ -72,7 +72,7 @@
         disableUrlConnectionCaching();
         final Thread thread = Thread.currentThread();
         final ClassLoader previousContextClassLoader = thread.getContextClassLoader();
-        final ClassLoader classLoader = new URLClassLoader(new DefaultClassPath(runSpec.getClasspath()).getAsURLArray());
+        final ClassLoader classLoader = new URLClassLoader(new DefaultClassPath(runSpec.getClasspath()).getAsURLArray(), null);
         thread.setContextClassLoader(classLoader);
         try {
             ClassLoader docsClassLoader = classLoader;
