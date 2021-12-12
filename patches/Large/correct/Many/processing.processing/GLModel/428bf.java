diff --git a/android/core/src/processing/android/core/GLModel.java b/android/core/src/processing/android/core/GLModel.java
index 77e8d9b..c0c8d39 100644
--- a/android/core/src/processing/android/core/GLModel.java
+++ b/android/core/src/processing/android/core/GLModel.java
@@ -239,7 +239,7 @@
       int offset = firstUpdateIdx * 2;
       int size = (lastUpdateIdx - firstUpdateIdx + 1) * 2;
       
-      texCoords.put(updateNormalArray, offset, size);
+      texCoords.put(updateTexCoordArray, offset, size);
       texCoords.position(0);
       
       gl.glBufferSubData(GL11.GL_ARRAY_BUFFER, offset * SIZEOF_FLOAT, size * SIZEOF_FLOAT, texCoords);
