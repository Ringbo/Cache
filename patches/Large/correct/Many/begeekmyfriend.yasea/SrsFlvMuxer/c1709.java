diff --git a/library/src/main/java/net/ossrs/yasea/SrsFlvMuxer.java b/library/src/main/java/net/ossrs/yasea/SrsFlvMuxer.java
index e5cdb16..d446b77 100644
--- a/library/src/main/java/net/ossrs/yasea/SrsFlvMuxer.java
+++ b/library/src/main/java/net/ossrs/yasea/SrsFlvMuxer.java
@@ -466,7 +466,7 @@
 
         public SrsFlvFrameBytes muxNaluHeader(SrsFlvFrameBytes frame) {
             SrsFlvFrameBytes nalu_hdr = new SrsFlvFrameBytes();
-            nalu_hdr.data = ByteBuffer.allocateDirect(4);
+            nalu_hdr.data = ByteBuffer.allocate(4);
             nalu_hdr.size = 4;
             // 5.3.4.2.1 Syntax, H.264-AVC-ISO_IEC_14496-15.pdf, page 16
             // lengthSizeMinusOne, or NAL_unit_length, always use 4bytes size
