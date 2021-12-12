diff --git a/src/main/java/org/graylog2/Main.java b/src/main/java/org/graylog2/Main.java
index 57246a0..46e7060 100644
--- a/src/main/java/org/graylog2/Main.java
+++ b/src/main/java/org/graylog2/Main.java
@@ -131,7 +131,7 @@
             configuration.setIsMaster(false);
         }
         
-        if (commandLineArguments.isLocal()) {
+        if (commandLineArguments.isLocal() || commandLineArguments.isDebug()) {
             // In local mode, systemstats are sent to localhost for example.
             LOG.info("Running in local mode");
             server.setLocalMode(true);
