diff --git a/engine/src/test/jme3test/app/TestBareBonesApp.java b/engine/src/test/jme3test/app/TestBareBonesApp.java
index 5635b36..491f397 100644
--- a/engine/src/test/jme3test/app/TestBareBonesApp.java
+++ b/engine/src/test/jme3test/app/TestBareBonesApp.java
@@ -78,7 +78,7 @@
         boxGeom.updateGeometricState();
 
         // render the viewports
-        renderManager.render(tpf);
+        renderManager.render(tpf, false);
     }
 
     @Override
