diff --git a/storm-core/src/jvm/backtype/storm/utils/DisruptorQueue.java b/storm-core/src/jvm/backtype/storm/utils/DisruptorQueue.java
index 932af16..1f2110d 100644
--- a/storm-core/src/jvm/backtype/storm/utils/DisruptorQueue.java
+++ b/storm-core/src/jvm/backtype/storm/utils/DisruptorQueue.java
@@ -94,7 +94,7 @@
     public void consumeBatchWhenAvailable(EventHandler<Object> handler) {
         try {
             final long nextSequence = _consumer.get() + 1;
-            final long availableSequence = _barrier.waitFor(nextSequence, 10, TimeUnit.MILLISECONDS);
+            final long availableSequence = _barrier.waitFor(nextSequence, 1000, TimeUnit.MILLISECONDS);
             if(availableSequence >= nextSequence) {
                 consumeBatchToCursor(availableSequence, handler);
             }
