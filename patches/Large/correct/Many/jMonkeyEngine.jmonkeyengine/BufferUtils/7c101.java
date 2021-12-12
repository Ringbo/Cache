diff --git a/engine/src/core/com/jme3/util/BufferUtils.java b/engine/src/core/com/jme3/util/BufferUtils.java
index 3e2c556..1f4b07b 100644
--- a/engine/src/core/com/jme3/util/BufferUtils.java
+++ b/engine/src/core/com/jme3/util/BufferUtils.java
@@ -1062,7 +1062,7 @@
             int position = (buffer != null ? buffer.position() : 0);
             FloatBuffer newVerts = createFloatBuffer(position + required);
             if (buffer != null) {
-                buffer.rewind();
+                buffer.flip();
                 newVerts.put(buffer);
                 newVerts.position(position);
             }
@@ -1076,7 +1076,7 @@
             int position = (buffer != null ? buffer.position() : 0);
             ShortBuffer newVerts = createShortBuffer(position + required);
             if (buffer != null) {
-                buffer.rewind();
+                buffer.flip();
                 newVerts.put(buffer);
                 newVerts.position(position);
             }
@@ -1090,7 +1090,7 @@
             int position = (buffer != null ? buffer.position() : 0);
             ByteBuffer newVerts = createByteBuffer(position + required);
             if (buffer != null) {
-                buffer.rewind();
+                buffer.flip();
                 newVerts.put(buffer);
                 newVerts.position(position);
             }
