diff --git a/opengl/java/android/opengl/Matrix.java b/opengl/java/android/opengl/Matrix.java
index a412a43..6d80bc6 100644
--- a/opengl/java/android/opengl/Matrix.java
+++ b/opengl/java/android/opengl/Matrix.java
@@ -362,7 +362,7 @@
 
         m[offset + 12] = 0.0f;
         m[offset + 13] = 0.0f;
-        m[offset + 14] = 2.0f * zFar * rangeReciprocal;
+        m[offset + 14] = 2.0f * zFar * zNear * rangeReciprocal;
         m[offset + 15] = 0.0f;
     }
 
