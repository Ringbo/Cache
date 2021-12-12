diff --git a/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java b/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
index d1f8223..2e5f940 100644
--- a/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
+++ b/src/main/java/org/jboss/netty/buffer/CompositeChannelBuffer.java
@@ -261,7 +261,7 @@
         if (index + 3 <= indices[sliceId + 1]) {
             slices[sliceId].setMedium(index - indices[sliceId], value);
         } else if (order() == ByteOrder.BIG_ENDIAN) {
-            setShort(index, (short) (value >>> 8));
+            setShort(index, (short) (value >> 8));
             setByte(index + 2, (byte) value);
         } else {
             setShort(index    , (short) value);
