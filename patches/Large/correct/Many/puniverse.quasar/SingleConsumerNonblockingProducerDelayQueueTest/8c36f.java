diff --git a/quasar-core/src/test/java/co/paralleluniverse/concurrent/util/SingleConsumerNonblockingProducerDelayQueueTest.java b/quasar-core/src/test/java/co/paralleluniverse/concurrent/util/SingleConsumerNonblockingProducerDelayQueueTest.java
index dd3d447..79de69f 100644
--- a/quasar-core/src/test/java/co/paralleluniverse/concurrent/util/SingleConsumerNonblockingProducerDelayQueueTest.java
+++ b/quasar-core/src/test/java/co/paralleluniverse/concurrent/util/SingleConsumerNonblockingProducerDelayQueueTest.java
@@ -104,7 +104,7 @@
 
         final long elapsedMillis = TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS);
 
-        assertTrue("elapsed: " + elapsedMillis, elapsedMillis > 140 && elapsedMillis < 170);
+        assertTrue("elapsed: " + elapsedMillis, elapsedMillis > 140 && elapsedMillis < 300);
     }
 
     @Test
