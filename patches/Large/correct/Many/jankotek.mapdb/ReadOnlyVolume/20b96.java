diff --git a/src/main/java/org/mapdb/volume/ReadOnlyVolume.java b/src/main/java/org/mapdb/volume/ReadOnlyVolume.java
index 63cef79..405bc02 100644
--- a/src/main/java/org/mapdb/volume/ReadOnlyVolume.java
+++ b/src/main/java/org/mapdb/volume/ReadOnlyVolume.java
@@ -24,37 +24,37 @@
 
     @Override
     public void truncate(long size) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putLong(long offset, long value) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putInt(long offset, int value) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putByte(long offset, byte value) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putData(long offset, byte[] src, int srcPos, int srcSize) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putData(long offset, ByteBuffer buf) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
     public void putDataOverlap(long offset, byte[] src, int srcPos, int srcSize) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
@@ -110,7 +110,7 @@
 
     @Override
     public void deleteFile() {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
@@ -125,7 +125,7 @@
 
     @Override
     public void putUnsignedShort(long offset, int value) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
@@ -140,7 +140,7 @@
 
     @Override
     public void putUnsignedByte(long offset, int b) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
 
@@ -151,7 +151,7 @@
 
     @Override
     public void putSixLong(long pos, long value) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 
     @Override
@@ -176,6 +176,6 @@
 
     @Override
     public void clear(long startOffset, long endOffset) {
-        throw new IllegalAccessError("read-only");
+        throw new UnsupportedOperationException("read-only");
     }
 }
