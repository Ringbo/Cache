diff --git a/store/src/main/java/com/alibaba/otter/canal/store/memory/MemoryEventStoreWithBuffer.java b/store/src/main/java/com/alibaba/otter/canal/store/memory/MemoryEventStoreWithBuffer.java
index fb74d5f..6c6d08f 100644
--- a/store/src/main/java/com/alibaba/otter/canal/store/memory/MemoryEventStoreWithBuffer.java
+++ b/store/src/main/java/com/alibaba/otter/canal/store/memory/MemoryEventStoreWithBuffer.java
@@ -435,7 +435,7 @@
                     if (batchMode.isMemSize()) {
                         ackMemSize.addAndGet(memsize);
                         // 尝试清空buffer中的内存，将ack之前的内存全部释放掉
-                        for (long index = sequence + 1; index <= next; index++) {
+                        for (long index = sequence + 1; index < next; index++) {
                             entries[getIndex(index)] = null;// 设置为null
                         }
                     }
