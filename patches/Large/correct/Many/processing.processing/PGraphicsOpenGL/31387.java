diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 8c8f472..1f79c39 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -4054,7 +4054,7 @@
    */
   @Override
   public void ortho() {
-    ortho(-width/2, +width/2, -height/2, +height/2, cameraNear, cameraFar);
+    ortho(-width/2, +width/2, +height/2, -height/2, cameraNear, cameraFar);
   }
 
 
@@ -4079,15 +4079,15 @@
    * dimensions as the screen size, then we would pass:
    * left   = -width/2
    * right  = +width/2
-   * bottom = -height/2
-   * top    = +height/2
+   * bottom = +height/2
+   * top    = -height/2
    * In general, if we want to set an ortographic projection covering the
    * rectangle determined by the top-left corner (x0, y0) and bottom-right
    * corner (x1, y1), we would need to pass the following parameters:
    * left   = x0 - width/2
    * right  = x1 - width/2
-   * bottom = height/2 - y1
-   * top    = height/2 - y0
+   * bottom = height/2 - y0
+   * top    = height/2 - y1
    * that just correspond to the change of coordinates between the
    * coordinate system located at the screen center with the Y-axis
    * bottom-to-top, and Processing's system.
@@ -4110,7 +4110,7 @@
 
     // The minus sign is needed to invert the Y axis.
     projection.set(x,  0, 0, tx,
-                   0, -y, 0, ty,
+                   0, y, 0, ty,
                    0,  0, z, tz,
                    0,  0, 0,  1);
 
@@ -4155,7 +4155,7 @@
     float ymin = -ymax;
     float xmin = ymin * aspect;
     float xmax = ymax * aspect;
-    frustum(xmin, xmax, ymin, ymax, zNear, zFar);
+    frustum(xmin, xmax, ymax, ymin, zNear, zFar);
   }
 
 
@@ -4177,7 +4177,7 @@
     float d = zfar - znear;
 
     projection.set(n2 / w,       0,  (right + left) / w,                0,
-                        0, -n2 / h,  (top + bottom) / h,                0,
+                        0, n2 / h,  (top + bottom) / h,                0,
                         0,       0, -(zfar + znear) / d, -(n2 * zfar) / d,
                         0,       0,                  -1,                0);
 
