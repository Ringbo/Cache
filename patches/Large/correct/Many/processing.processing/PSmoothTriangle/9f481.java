diff --git a/core/src/processing/core/PSmoothTriangle.java b/core/src/processing/core/PSmoothTriangle.java
index 7dd2285..ba692fe 100644
--- a/core/src/processing/core/PSmoothTriangle.java
+++ b/core/src/processing/core/PSmoothTriangle.java
@@ -394,8 +394,8 @@
 
       // added == because things on same plane weren't replacing each other
       // makes for strangeness in 3D [ewj: yup!], but totally necessary for 2D
-      if (noDepthTest || (sp[Z] < zbuffer[offset+x])) {
-        //if (noDepthTest || (sp[Z] <= zbuffer[offset+x])) {
+      //if (noDepthTest || (sp[Z] < zbuffer[offset+x])) {
+      if (noDepthTest || (sp[Z] <= zbuffer[offset+x])) {
         //if (true) {
 
         // map texture based on U, V coords in sp[U] and sp[V]
