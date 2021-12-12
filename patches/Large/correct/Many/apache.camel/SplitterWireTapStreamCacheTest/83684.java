diff --git a/camel-core/src/test/java/org/apache/camel/processor/SplitterWireTapStreamCacheTest.java b/camel-core/src/test/java/org/apache/camel/processor/SplitterWireTapStreamCacheTest.java
index 0c7ffd4..f6881ed 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/SplitterWireTapStreamCacheTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/SplitterWireTapStreamCacheTest.java
@@ -53,7 +53,7 @@
             @Override
             public void configure() throws Exception {
                 StreamCachingStrategy streamCachingStrategy = new DefaultStreamCachingStrategy();
-                streamCachingStrategy.setSpoolThreshold(1l);
+                streamCachingStrategy.setSpoolThreshold(1L);
 
                 context.setStreamCachingStrategy(streamCachingStrategy);
                 context.setStreamCaching(true);
