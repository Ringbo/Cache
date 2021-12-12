diff --git a/camel-core/src/test/java/org/apache/camel/impl/DefaultProducerCacheTest.java b/camel-core/src/test/java/org/apache/camel/impl/DefaultProducerCacheTest.java
index 1737a89..5ad0f42 100644
--- a/camel-core/src/test/java/org/apache/camel/impl/DefaultProducerCacheTest.java
+++ b/camel-core/src/test/java/org/apache/camel/impl/DefaultProducerCacheTest.java
@@ -30,7 +30,7 @@
  */
 public class DefaultProducerCacheTest extends ContextTestSupport {
 
-    private static final AtomicInteger counter = new AtomicInteger();
+    private static final AtomicInteger COUNTER = new AtomicInteger();
 
     public void testCacheProducerAcquireAndRelease() throws Exception {
         ProducerCache cache = new ProducerCache(this, context);
@@ -64,15 +64,15 @@
         assertEquals("Size should be 5", 5, cache.size());
 
         // should have stopped the 3 evicted
-        assertEquals(3, counter.get());
+        assertEquals(3, COUNTER.get());
 
         cache.stop();
 
         // should have stopped all 8
-        assertEquals(8, counter.get());
+        assertEquals(8, COUNTER.get());
     }
 
-    private class MyEndpoint extends DefaultEndpoint {
+    private final class MyEndpoint extends DefaultEndpoint {
 
         private int number;
 
@@ -101,7 +101,7 @@
         }
     }
 
-    private class MyProducer extends DefaultProducer {
+    private final class MyProducer extends DefaultProducer {
 
         public MyProducer(Endpoint endpoint) {
             super(endpoint);
@@ -114,7 +114,7 @@
 
         @Override
         protected void doStop() throws Exception {
-            counter.incrementAndGet();
+            COUNTER.incrementAndGet();
         }
     }
 
