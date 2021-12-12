diff --git a/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/body/BodyFileRegion.java b/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/body/BodyFileRegion.java
index 49fabee..010625f 100755
--- a/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/body/BodyFileRegion.java
+++ b/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/body/BodyFileRegion.java
@@ -52,7 +52,7 @@
 
     @Override
     public long transferTo(WritableByteChannel target, long position) throws IOException {
-        long written = body.transferTo(position, Long.MAX_VALUE, target);
+        long written = body.transferTo(position, target);
         if (written > 0) {
             transfered += written;
         }
