diff --git a/engine/src/test/jme3test/app/TestBareBonesApp.java b/engine/src/test/jme3test/app/TestBareBonesApp.java
index 491f397..e358af3 100644
--- a/engine/src/test/jme3test/app/TestBareBonesApp.java
+++ b/engine/src/test/jme3test/app/TestBareBonesApp.java
@@ -78,7 +78,7 @@
         boxGeom.updateGeometricState();
 
         // render the viewports
-        renderManager.render(tpf, false);
+        renderManager.render(tpf, true);
     }
 
     @Override
