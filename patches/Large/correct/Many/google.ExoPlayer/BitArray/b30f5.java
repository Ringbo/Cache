diff --git a/library/src/main/java/com/google/android/exoplayer/util/BitArray.java b/library/src/main/java/com/google/android/exoplayer/util/BitArray.java
index 23cd760..5f7ed42 100644
--- a/library/src/main/java/com/google/android/exoplayer/util/BitArray.java
+++ b/library/src/main/java/com/google/android/exoplayer/util/BitArray.java
@@ -148,16 +148,15 @@
    * @return The value of the parsed byte.
    */
   public int readUnsignedByte() {
-    byte b;
+    int value;
     if (bitOffset != 0) {
-      b = (byte) ((data[byteOffset] << bitOffset)
-          | (data[byteOffset + 1] >> (8 - bitOffset)));
+      value = (data[byteOffset] << bitOffset)
+          | ((data[byteOffset + 1] & 0xFF) >>> (8 - bitOffset));
     } else {
-      b = data[byteOffset];
+      value = data[byteOffset];
     }
     byteOffset++;
-    // Converting a signed byte into unsigned.
-    return b & 0xFF;
+    return value & 0xFF;
   }
 
   /**
