diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/util/QueueBasedObjectPool.java b/hazelcast-client/src/main/java/com/hazelcast/client/util/QueueBasedObjectPool.java
index 8e7fb80..504ab09 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/util/QueueBasedObjectPool.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/util/QueueBasedObjectPool.java
@@ -62,7 +62,7 @@
     }
 
     public void destroy() {
-        active = true;
+        active = false;
         final Collection<E> c = new LinkedList<E>();
         queue.drainTo(c);
         for (E e : c) {
