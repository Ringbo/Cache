diff --git a/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java b/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
index a14452b..54a42f8 100644
--- a/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
+++ b/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
@@ -674,23 +674,23 @@
                 break;
             case FloatArray:
                 fb = (FloatBuffer) uniform.getValue();
-                GLES20.glUniform1fv(loc, fb.capacity(), fb);
+                GLES20.glUniform1fv(loc, fb.limit(), fb);
                 break;
             case Vector2Array:
                 fb = (FloatBuffer) uniform.getValue();
-                GLES20.glUniform2fv(loc, fb.capacity() / 2, fb);
+                GLES20.glUniform2fv(loc, fb.limit() / 2, fb);
                 break;
             case Vector3Array:
                 fb = (FloatBuffer) uniform.getValue();
-                GLES20.glUniform3fv(loc, fb.capacity() / 3, fb);
+                GLES20.glUniform3fv(loc, fb.limit() / 3, fb);
                 break;
             case Vector4Array:
                 fb = (FloatBuffer) uniform.getValue();
-                GLES20.glUniform4fv(loc, fb.capacity() / 4, fb);
+                GLES20.glUniform4fv(loc, fb.limit() / 4, fb);
                 break;
             case Matrix4Array:
                 fb = (FloatBuffer) uniform.getValue();
-                GLES20.glUniformMatrix4fv(loc, fb.capacity() / 16, false, fb);
+                GLES20.glUniformMatrix4fv(loc, fb.limit() / 16, false, fb);
                 break;
             case Int:
                 Integer i = (Integer) uniform.getValue();
@@ -1685,11 +1685,11 @@
         }
 
         int usage = convertUsage(vb.getUsage());
-        vb.getData().clear();
+        vb.getData().rewind();
 
         if (created || vb.hasDataSizeChanged()) {
             // upload data based on format
-            int size = vb.getData().capacity() * vb.getFormat().getComponentSize();
+            int size = vb.getData().limit() * vb.getFormat().getComponentSize();
 
             switch (vb.getFormat()) {
                 case Byte:
@@ -1715,7 +1715,7 @@
                     throw new RuntimeException("Unknown buffer format.");
             }
         } else {
-            int size = vb.getData().capacity() * vb.getFormat().getComponentSize();
+            int size = vb.getData().limit() * vb.getFormat().getComponentSize();
 
             switch (vb.getFormat()) {
                 case Byte:
@@ -1926,7 +1926,7 @@
                 //ARBDrawInstanced.
 /*
                 GLES20.glDrawElementsInstancedARB(convertElementMode(mesh.getMode()),
-                indexBuf.getData().capacity(),
+                indexBuf.getData().limit(),
                 convertFormat(indexBuf.getFormat()),
                 0,
                 count);
@@ -1935,7 +1935,7 @@
                 indexData.clear();
                 GLES20.glDrawElements(
                         convertElementMode(mesh.getMode()),
-                        indexBuf.getData().capacity(),
+                        indexBuf.getData().limit(),
                         convertFormat(indexBuf.getFormat()),
                         0);
             }
@@ -2157,7 +2157,7 @@
         } else {
             GLES20.glDrawElements(
                     convertElementMode(mesh.getMode()),
-                    indexBuf.getData().capacity(),
+                    indexBuf.getData().limit(),
                     convertFormat(indexBuf.getFormat()),
                     indexBuf.getData());
         }
