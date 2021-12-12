diff --git a/core/src/test/java/io/undertow/testutils/DebuggingSlicePool.java b/core/src/test/java/io/undertow/testutils/DebuggingSlicePool.java
index 8b676c4..d3eea2b 100644
--- a/core/src/test/java/io/undertow/testutils/DebuggingSlicePool.java
+++ b/core/src/test/java/io/undertow/testutils/DebuggingSlicePool.java
@@ -74,7 +74,7 @@
         @Override
         public ByteBuffer getResource() throws IllegalStateException {
             if(free) {
-                throw new RuntimeException("Buffer already freed, free point: ", freePoint);
+                throw new IllegalStateException("Buffer already freed, free point: ", freePoint);
             }
             return delegate.getResource();
         }
