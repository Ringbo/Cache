diff --git a/src/java/voldemort/store/slop/SlopStorageEngine.java b/src/java/voldemort/store/slop/SlopStorageEngine.java
index 3613e8a..588eba8 100644
--- a/src/java/voldemort/store/slop/SlopStorageEngine.java
+++ b/src/java/voldemort/store/slop/SlopStorageEngine.java
@@ -130,7 +130,7 @@
         Slop slop = slopSerializer.toObject(value.getValue());
         slopEngine.put(key, value, transforms);
         totalAddedSinceReset.incrementAndGet();
-        addedSinceResetByNode.get(slop.getValue()).incrementAndGet();
+        addedSinceResetByNode.get(slop.getNodeId()).incrementAndGet();
     }
 
     public boolean delete(ByteArray key, Version version) throws VoldemortException {
