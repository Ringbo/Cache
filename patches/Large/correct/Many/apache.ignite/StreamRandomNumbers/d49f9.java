diff --git a/examples/src/main/java8/org/apache/ignite/examples/java8/streaming/numbers/StreamRandomNumbers.java b/examples/src/main/java8/org/apache/ignite/examples/java8/streaming/numbers/StreamRandomNumbers.java
index 96472a3..a7dcef7 100644
--- a/examples/src/main/java8/org/apache/ignite/examples/java8/streaming/numbers/StreamRandomNumbers.java
+++ b/examples/src/main/java8/org/apache/ignite/examples/java8/streaming/numbers/StreamRandomNumbers.java
@@ -49,8 +49,9 @@
         // Mark this cluster member as client.
         Ignition.setClientMode(true);
 
-        try (Ignite ignite = Ignition.start("examples/config/example-compute.xml")) {
+        try (Ignite ignite = Ignition.start()) {
             // Create new cache or get existing one.
+            // The cache is configured with sliding window holding 1 second of the streaming data.
             try (IgniteCache<Integer, Long> stmCache = ignite.createCache(CacheConfig.configure())) {
                 if (!ExamplesUtils.hasServerNodes(ignite))
                     return;
