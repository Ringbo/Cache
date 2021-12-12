diff --git a/java/src/test/java/com/google/crypto/tink/subtle/AesGcmHkdfStreamingTest.java b/java/src/test/java/com/google/crypto/tink/subtle/AesGcmHkdfStreamingTest.java
index 54a8936..76acc83 100644
--- a/java/src/test/java/com/google/crypto/tink/subtle/AesGcmHkdfStreamingTest.java
+++ b/java/src/test/java/com/google/crypto/tink/subtle/AesGcmHkdfStreamingTest.java
@@ -723,13 +723,13 @@
    * TODO(bleichen): Using PipedInputStream may have performance problems.
    */
   private ReadableByteChannel ciphertextChannel(
-      AesGcmHkdfStreaming ags,
-      ReadableByteChannel plaintext,
-      byte[] aad,
-      int chunkSize) throws Exception {
+      final AesGcmHkdfStreaming ags,
+      final ReadableByteChannel plaintext,
+      final byte[] aad,
+      final int chunkSize) throws Exception {
     PipedOutputStream output = new PipedOutputStream();
     PipedInputStream result = new PipedInputStream(output);
-    WritableByteChannel ciphertext = Channels.newChannel(output);
+    final WritableByteChannel ciphertext = Channels.newChannel(output);
     new Thread(new Runnable() {
       public void run() {
         encryptChannel(ags, plaintext, ciphertext, aad, chunkSize);
