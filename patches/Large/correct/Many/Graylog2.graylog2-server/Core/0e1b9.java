diff --git a/graylog2-server/src/main/java/org/graylog2/Core.java b/graylog2-server/src/main/java/org/graylog2/Core.java
index 1844229..d7e38f4 100644
--- a/graylog2-server/src/main/java/org/graylog2/Core.java
+++ b/graylog2-server/src/main/java/org/graylog2/Core.java
@@ -438,7 +438,10 @@
         bootstrap.setOption("child.tcpNoDelay", true);
         bootstrap.setOption("child.keepAlive", true);
 
-        bootstrap.bind(new InetSocketAddress(configuration.getRestListenUri().getPort()));
+        bootstrap.bind(new InetSocketAddress(
+                configuration.getRestListenUri().getHost(),
+                configuration.getRestListenUri().getPort()
+        ));
         Runtime.getRuntime().addShutdownHook(new Thread() {
             @Override
             public void run() {
