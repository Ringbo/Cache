diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/CompareAndSetOperation.java b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/CompareAndSetOperation.java
index b46f8b4..4fba948 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/CompareAndSetOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/CompareAndSetOperation.java
@@ -44,7 +44,7 @@
     public void run() throws Exception {
         AtomicReferenceContainer atomicReferenceContainer = getReferenceContainer();
         returnValue = atomicReferenceContainer.compareAndSet(expect, update);
-        shouldBackup = !returnValue;
+        shouldBackup = returnValue;
     }
 
     @Override
