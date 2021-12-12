diff --git a/commons/src/main/java/com/navercorp/pinpoint/common/buffer/FixedBuffer.java b/commons/src/main/java/com/navercorp/pinpoint/common/buffer/FixedBuffer.java
index dbcd0a2..f1e699e 100644
--- a/commons/src/main/java/com/navercorp/pinpoint/common/buffer/FixedBuffer.java
+++ b/commons/src/main/java/com/navercorp/pinpoint/common/buffer/FixedBuffer.java
@@ -300,7 +300,7 @@
     @Deprecated
     @Override
     public void put(final byte[] v) {
-        put(v);
+        putBytes(v);
     }
 
     @Override
