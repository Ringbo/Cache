diff --git a/core/src/test/java/io/undertow/util/SingleByteStreamSourceConduit.java b/core/src/test/java/io/undertow/util/SingleByteStreamSourceConduit.java
index f7bbdde..6b8de88 100644
--- a/core/src/test/java/io/undertow/util/SingleByteStreamSourceConduit.java
+++ b/core/src/test/java/io/undertow/util/SingleByteStreamSourceConduit.java
@@ -31,7 +31,8 @@
 
     @Override
     public int read(ByteBuffer dst) throws IOException {
-        if (state > singleByteReads) {
+        if (state > singleByteReads || dst.remaining() == 1) {
+            //we always let a single byte read through, otherwise SSL renegotiation breaks
             return next.read(dst);
         }
 
