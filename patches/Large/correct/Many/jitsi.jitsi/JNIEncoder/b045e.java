diff --git a/src/net/java/sip/communicator/impl/neomedia/codec/video/h264/JNIEncoder.java b/src/net/java/sip/communicator/impl/neomedia/codec/video/h264/JNIEncoder.java
index 4fd749e..0b0abdf 100644
--- a/src/net/java/sip/communicator/impl/neomedia/codec/video/h264/JNIEncoder.java
+++ b/src/net/java/sip/communicator/impl/neomedia/codec/video/h264/JNIEncoder.java
@@ -303,8 +303,7 @@
         avframe = FFMPEG.avcodec_alloc_frame();
         int size = width * height;
         FFMPEG.avframe_set_data(avframe, rawFrameBuffer, size, size / 4);
-        FFMPEG.avframe_set_linesize(avframe, width, height / 2,
-            width / 2);
+        FFMPEG.avframe_set_linesize(avframe, width, width / 2, width / 2);
 
         encFrameBuffer = new byte[encFrameLen];
 
