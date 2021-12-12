diff --git a/h2/src/main/org/h2/mvstore/WriteBuffer.java b/h2/src/main/org/h2/mvstore/WriteBuffer.java
index 303c4f2..7acf9c1 100644
--- a/h2/src/main/org/h2/mvstore/WriteBuffer.java
+++ b/h2/src/main/org/h2/mvstore/WriteBuffer.java
@@ -185,7 +185,7 @@
      * @return this
      */
     public WriteBuffer put(ByteBuffer src) {
-        ensureCapacity(buff.remaining()).put(src);
+        ensureCapacity(src.remaining()).put(src);
         return this;
     }
 
