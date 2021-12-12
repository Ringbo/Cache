diff --git a/okhttp/src/main/java/okhttp3/internal/http1/Http1Codec.java b/okhttp/src/main/java/okhttp3/internal/http1/Http1Codec.java
index 625c173..4be3a32 100644
--- a/okhttp/src/main/java/okhttp3/internal/http1/Http1Codec.java
+++ b/okhttp/src/main/java/okhttp3/internal/http1/Http1Codec.java
@@ -369,7 +369,7 @@
   private class FixedLengthSource extends AbstractSource {
     private long bytesRemaining;
 
-    public FixedLengthSource(long length) throws IOException {
+    FixedLengthSource(long length) throws IOException {
       bytesRemaining = length;
       if (bytesRemaining == 0) {
         endOfInput(true);
