diff --git a/presto-orc/src/main/java/com/facebook/presto/orc/stream/OrcInputStream.java b/presto-orc/src/main/java/com/facebook/presto/orc/stream/OrcInputStream.java
index bb6f353..5a579da 100644
--- a/presto-orc/src/main/java/com/facebook/presto/orc/stream/OrcInputStream.java
+++ b/presto-orc/src/main/java/com/facebook/presto/orc/stream/OrcInputStream.java
@@ -67,7 +67,7 @@
         requireNonNull(systemMemoryContext, "systemMemoryContext is null");
         this.bufferMemoryUsage = systemMemoryContext.newLocalMemoryContext();
         this.fixedMemoryUsage = systemMemoryContext.newLocalMemoryContext();
-        this.fixedMemoryUsage.setBytes(sliceInput.length());
+        this.fixedMemoryUsage.setBytes(sliceInput.getRetainedSize());
 
         if (!decompressor.isPresent()) {
             this.current = sliceInput;
@@ -83,7 +83,7 @@
     public void close()
     {
         current = null;
-        fixedMemoryUsage.setBytes(compressedSliceInput.length()); // see comments above for fixedMemoryUsage
+        fixedMemoryUsage.setBytes(compressedSliceInput.getRetainedSize()); // see comments above for fixedMemoryUsage
 
         buffer = null;
         bufferMemoryUsage.setBytes(0);
