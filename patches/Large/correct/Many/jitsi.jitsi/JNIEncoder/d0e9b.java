diff --git a/src/net/java/sip/communicator/impl/media/codec/video/h264/JNIEncoder.java b/src/net/java/sip/communicator/impl/media/codec/video/h264/JNIEncoder.java
index ab4de7c..49d1829 100644
--- a/src/net/java/sip/communicator/impl/media/codec/video/h264/JNIEncoder.java
+++ b/src/net/java/sip/communicator/impl/media/codec/video/h264/JNIEncoder.java
@@ -111,7 +111,7 @@
 
         // mismatch input format
         if (!(in instanceof VideoFormat)
-            || null == NativeDecoder.matches(in, inputFormats))
+            || null == JNIDecoder.matches(in, inputFormats))
             return new Format[0];
 
         return getMatchingOutputFormats(in);
@@ -121,7 +121,7 @@
     {
         // mismatch input format
         if (!(in instanceof VideoFormat)
-            || null == NativeDecoder.matches(in, inputFormats))
+            || null == JNIDecoder.matches(in, inputFormats))
             return null;
 
         VideoFormat videoIn = (VideoFormat) in;
@@ -156,7 +156,7 @@
     {
         // mismatch output format
         if (!(out instanceof VideoFormat)
-            || null == NativeDecoder.matches(out,
+            || null == JNIDecoder.matches(out,
                 getMatchingOutputFormats(inputFormat)))
             return null;
 
