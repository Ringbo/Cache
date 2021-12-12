diff --git a/library/src/main/java/net/ossrs/yasea/SrsMp4Muxer.java b/library/src/main/java/net/ossrs/yasea/SrsMp4Muxer.java
index ca4675d..bdc9afa 100644
--- a/library/src/main/java/net/ossrs/yasea/SrsMp4Muxer.java
+++ b/library/src/main/java/net/ossrs/yasea/SrsMp4Muxer.java
@@ -703,7 +703,7 @@
     private class InterleaveChunkMdat implements Box {
         private boolean first = true;
         private ContainerBox parent;
-        private ByteBuffer header = ByteBuffer.allocateDirect(16);
+        private ByteBuffer header = ByteBuffer.allocate(16);
         private long contentSize = 1024 * 1024 * 1024;
 
         public ContainerBox getParent() {
@@ -809,7 +809,7 @@
             byteBuf.position(bi.offset + (isAudio ? 0 : 4));
             byteBuf.limit(bi.offset + bi.size);
             if (!isAudio) {
-                ByteBuffer size = ByteBuffer.allocateDirect(4);
+                ByteBuffer size = ByteBuffer.allocate(4);
                 size.position(0);
                 size.putInt(bi.size - 4);
                 size.position(0);
