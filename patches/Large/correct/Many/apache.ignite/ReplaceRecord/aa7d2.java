diff --git a/modules/core/src/main/java/org/apache/ignite/internal/pagemem/wal/record/delta/ReplaceRecord.java b/modules/core/src/main/java/org/apache/ignite/internal/pagemem/wal/record/delta/ReplaceRecord.java
index 2107189..517602c 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/pagemem/wal/record/delta/ReplaceRecord.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/pagemem/wal/record/delta/ReplaceRecord.java
@@ -58,7 +58,7 @@
     /** {@inheritDoc} */
     @Override public void applyDelta(PageMemory pageMem, ByteBuffer buf)
         throws IgniteCheckedException {
-        if (io.getCount(buf) >= idx)
+        if (io.getCount(buf) < idx)
             throw new DeltaApplicationException("Index is greater than count: " + idx);
 
         io.store(buf, idx, row, rowBytes);
