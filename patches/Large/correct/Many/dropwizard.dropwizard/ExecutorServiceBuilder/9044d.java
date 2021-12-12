diff --git a/dropwizard-lifecycle/src/main/java/io/dropwizard/lifecycle/setup/ExecutorServiceBuilder.java b/dropwizard-lifecycle/src/main/java/io/dropwizard/lifecycle/setup/ExecutorServiceBuilder.java
index 4827c2a..3329d85 100644
--- a/dropwizard-lifecycle/src/main/java/io/dropwizard/lifecycle/setup/ExecutorServiceBuilder.java
+++ b/dropwizard-lifecycle/src/main/java/io/dropwizard/lifecycle/setup/ExecutorServiceBuilder.java
@@ -94,7 +94,7 @@
     }
 
     @VisibleForTesting
-    static void setLog(Logger newLog) {
+    static synchronized void setLog(Logger newLog) {
        log = newLog;
     }
 }
