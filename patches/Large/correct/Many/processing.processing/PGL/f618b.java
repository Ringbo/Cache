diff --git a/core/src/processing/opengl/PGL.java b/core/src/processing/opengl/PGL.java
index 4818cd0..ecfbb17 100644
--- a/core/src/processing/opengl/PGL.java
+++ b/core/src/processing/opengl/PGL.java
@@ -2232,7 +2232,7 @@
 
   protected boolean hasAnisoSamplingSupport() {
     int major = getGLVersion()[0];
-    if (major < 3) {
+    if (isES() || major < 3) {
       String ext = getString(EXTENSIONS);
       return -1 < ext.indexOf("_texture_filter_anisotropic");
     } else {
