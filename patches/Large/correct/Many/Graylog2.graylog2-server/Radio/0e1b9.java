diff --git a/graylog2-radio/src/main/java/org/graylog2/radio/Radio.java b/graylog2-radio/src/main/java/org/graylog2/radio/Radio.java
index e7c18a3..068120b 100644
--- a/graylog2-radio/src/main/java/org/graylog2/radio/Radio.java
+++ b/graylog2-radio/src/main/java/org/graylog2/radio/Radio.java
@@ -189,7 +189,10 @@
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
