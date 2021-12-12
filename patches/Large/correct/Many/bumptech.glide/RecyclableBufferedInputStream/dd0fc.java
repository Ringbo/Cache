diff --git a/library/src/main/java/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.java b/library/src/main/java/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.java
index 7bd0d62..ace8b22 100644
--- a/library/src/main/java/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.java
+++ b/library/src/main/java/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.java
@@ -335,7 +335,7 @@
       throw new IOException("Stream is closed");
     }
     if (-1 == markpos) {
-      throw new InvalidMarkException("Mark has been invalidated");
+      throw new InvalidMarkException("Mark has been invalidated, pos: " + pos + " markLimit: " + marklimit);
     }
     pos = markpos;
   }
@@ -391,7 +391,7 @@
    * An exception thrown when a mark can no longer be obeyed because the underlying buffer size is
    * smaller than the amount of data read after the mark position.
    */
-  public static class InvalidMarkException extends RuntimeException {
+  public static class InvalidMarkException extends IOException {
     private static final long serialVersionUID = -4338378848813561757L;
 
     public InvalidMarkException(String detailMessage) {
