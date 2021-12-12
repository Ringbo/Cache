diff --git a/src/main/java/io/mycat/buffer/ByteBufferArena.java b/src/main/java/io/mycat/buffer/ByteBufferArena.java
index 87c74da..659abe7 100644
--- a/src/main/java/io/mycat/buffer/ByteBufferArena.java
+++ b/src/main/java/io/mycat/buffer/ByteBufferArena.java
@@ -110,7 +110,7 @@
             }else {
                 memoryUsage.put(threadId, (long) reqCapacity);
             }
-            if (sharedOptsCount.contains(thread)) {
+            if (sharedOptsCount.containsKey(thread)) {
                 int currentCount = sharedOptsCount.get(thread);
                 currentCount++;
                 sharedOptsCount.put(thread,currentCount);
@@ -149,7 +149,7 @@
             if (memoryUsage.containsKey(threadId)){
                 memoryUsage.put(threadId,memoryUsage.get(thread.getId())-size);
             }
-            if (sharedOptsCount.contains(thread)) {
+            if (sharedOptsCount.containsKey(thread)) {
                 int currentCount = sharedOptsCount.get(thread);
                 currentCount--;
                 sharedOptsCount.put(thread,currentCount);
