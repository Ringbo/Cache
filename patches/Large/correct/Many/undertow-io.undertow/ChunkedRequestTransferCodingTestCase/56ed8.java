diff --git a/core/src/test/java/io/undertow/test/handlers/ChunkedRequestTransferCodingTestCase.java b/core/src/test/java/io/undertow/test/handlers/ChunkedRequestTransferCodingTestCase.java
index b6703bc..892367a 100644
--- a/core/src/test/java/io/undertow/test/handlers/ChunkedRequestTransferCodingTestCase.java
+++ b/core/src/test/java/io/undertow/test/handlers/ChunkedRequestTransferCodingTestCase.java
@@ -125,7 +125,7 @@
                     public void writeTo(OutputStream outstream) throws IOException {
                         int l = 0;
                         int i = 0;
-                        while (i < message.length()) {
+                        while (i <= message.length()) {
                             i += random.nextInt(1000);
                             i = Math.min(i, message.length());
                             outstream.write(message.getBytes(), l, i - l);
