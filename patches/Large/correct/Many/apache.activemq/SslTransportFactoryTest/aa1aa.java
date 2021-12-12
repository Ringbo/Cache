diff --git a/activemq-core/src/test/java/org/apache/activemq/transport/tcp/SslTransportFactoryTest.java b/activemq-core/src/test/java/org/apache/activemq/transport/tcp/SslTransportFactoryTest.java
index 793b81b..eec7b0b 100644
--- a/activemq-core/src/test/java/org/apache/activemq/transport/tcp/SslTransportFactoryTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/transport/tcp/SslTransportFactoryTest.java
@@ -117,7 +117,7 @@
             }
 
             if (verbose) {
-                log.info();
+                log.info("");
                 log.info("Iteration: " + i);
                 log.info("Map settings: " + options);
                 for (int x = 0; x < optionSettings.length; x++) {
