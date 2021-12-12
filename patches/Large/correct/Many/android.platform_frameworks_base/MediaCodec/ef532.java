diff --git a/media/java/android/media/MediaCodec.java b/media/java/android/media/MediaCodec.java
index 59fccda..d82afdf 100644
--- a/media/java/android/media/MediaCodec.java
+++ b/media/java/android/media/MediaCodec.java
@@ -669,10 +669,10 @@
      * Thrown when an internal codec error occurs.
      */
     public final static class CodecException extends IllegalStateException {
-        CodecException(int errorCode, int actionCode, String detailMessage) {
+        CodecException(int errorCode, int actionCode, String detailMessage, int reason) {
             super(detailMessage);
             mErrorCode = errorCode;
-            mReason = REASON_HARDWARE;
+            mReason = reason;
             mActionCode = actionCode;
 
             // TODO get this from codec
