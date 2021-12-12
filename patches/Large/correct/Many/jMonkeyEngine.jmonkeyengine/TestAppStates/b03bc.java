diff --git a/engine/src/test/jme3test/app/state/TestAppStates.java b/engine/src/test/jme3test/app/state/TestAppStates.java
index c106ea7..d31ec87 100644
--- a/engine/src/test/jme3test/app/state/TestAppStates.java
+++ b/engine/src/test/jme3test/app/state/TestAppStates.java
@@ -88,7 +88,7 @@
         stateManager.render(renderManager);
 
         // render the viewports
-        renderManager.render(tpf, false);
+        renderManager.render(tpf, true);
     }
 
     @Override
