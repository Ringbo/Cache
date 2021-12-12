diff --git a/android/core/src/processing/core/PShape3D.java b/android/core/src/processing/core/PShape3D.java
index ad2f454..4b36e2a 100644
--- a/android/core/src/processing/core/PShape3D.java
+++ b/android/core/src/processing/core/PShape3D.java
@@ -691,7 +691,7 @@
 
   
   public void addChild(String name, int n0, int n1) {
-    PShape child = createChild(name, n0, n1, glMode);
+    PShape child = createChild(name, n0, n1, getDrawModeImpl());
     addChild(child);
   }
   
@@ -721,7 +721,7 @@
       who3d.papplet = papplet;
       who3d.a3d = a3d;
       who3d.gl = gl;
-      for (int n = who3d.firstVertex; n < who3d.lastVertex; n++) {
+      for (int n = who3d.firstVertex; n <= who3d.lastVertex; n++) {
         vertexChild[n] = who3d;
       }       
     } else {
