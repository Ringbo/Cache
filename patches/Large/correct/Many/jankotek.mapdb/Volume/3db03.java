diff --git a/src/main/java/org/mapdb/Volume.java b/src/main/java/org/mapdb/Volume.java
index 0140e22..41e994f 100644
--- a/src/main/java/org/mapdb/Volume.java
+++ b/src/main/java/org/mapdb/Volume.java
@@ -123,7 +123,7 @@
      * Writes a long to the indicated position
      */
     public void putSixLong(long pos, long value) {
-        assert(value>0 && (value>>>6*8)==0): "value does not fit";
+        assert(value>=0 && (value>>>6*8)==0): "value does not fit";
         //TODO read/write as integer+short, might be faster
         putByte(pos + 0, (byte) (0xff & (value >> 40)));
         putByte(pos + 1, (byte) (0xff & (value >> 32)));
@@ -643,7 +643,7 @@
 
         @Override
         public final void putSixLong(long offset, long value) {
-            assert(value>0 && (value>>>6*8)==0): "value does not fit";
+            assert(value>=0 && (value>>>6*8)==0): "value does not fit";
 
             try{
 
