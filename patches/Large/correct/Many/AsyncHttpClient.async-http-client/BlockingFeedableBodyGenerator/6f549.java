diff --git a/client/src/main/java/org/asynchttpclient/request/body/generator/BlockingFeedableBodyGenerator.java b/client/src/main/java/org/asynchttpclient/request/body/generator/BlockingFeedableBodyGenerator.java
index eac683c..055e3ba 100644
--- a/client/src/main/java/org/asynchttpclient/request/body/generator/BlockingFeedableBodyGenerator.java
+++ b/client/src/main/java/org/asynchttpclient/request/body/generator/BlockingFeedableBodyGenerator.java
@@ -18,7 +18,7 @@
 import java.util.concurrent.BlockingQueue;
 
 public final class BlockingFeedableBodyGenerator extends QueueBasedFeedableBodyGenerator<BlockingQueue<BodyChunk>> {
-    private final BlockingQueue<BodyChunk> queue;
+    private final ArrayBlockingQueue<BodyChunk> queue;
 
     public BlockingFeedableBodyGenerator(int capacity) {
         queue = new ArrayBlockingQueue<>(capacity);
