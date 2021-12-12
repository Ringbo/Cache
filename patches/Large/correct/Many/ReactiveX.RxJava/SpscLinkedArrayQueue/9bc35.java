diff --git a/src/main/java/io/reactivex/internal/queue/SpscLinkedArrayQueue.java b/src/main/java/io/reactivex/internal/queue/SpscLinkedArrayQueue.java
index 342574d..8bc8f05 100644
--- a/src/main/java/io/reactivex/internal/queue/SpscLinkedArrayQueue.java
+++ b/src/main/java/io/reactivex/internal/queue/SpscLinkedArrayQueue.java
@@ -79,7 +79,7 @@
             if (null == lvElement(buffer, lookAheadElementOffset)) {// LoadLoad
                 producerLookAhead = index + lookAheadStep - 1; // joy, there's plenty of room
                 return writeToQueue(buffer, e, index, offset);
-            } else if (null != lvElement(buffer, calcWrappedOffset(index + 1, mask))) { // buffer is not full
+            } else if (null == lvElement(buffer, calcWrappedOffset(index + 1, mask))) { // buffer is not full
                 return writeToQueue(buffer, e, index, offset);
             } else {
                 resize(buffer, index, offset, e, mask); // add a buffer and link old to new
