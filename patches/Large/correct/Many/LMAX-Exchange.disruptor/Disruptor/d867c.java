diff --git a/src/main/java/com/lmax/disruptor/dsl/Disruptor.java b/src/main/java/com/lmax/disruptor/dsl/Disruptor.java
index 7274d83..4a7e455 100644
--- a/src/main/java/com/lmax/disruptor/dsl/Disruptor.java
+++ b/src/main/java/com/lmax/disruptor/dsl/Disruptor.java
@@ -322,7 +322,7 @@
         final long cursor = ringBuffer.getCursor();
         for (Sequence consumer : consumerRepository.getLastSequenceInChain())
         {
-            if (cursor != consumer.get())
+            if (cursor > consumer.get())
             {
                 return true;
             }
