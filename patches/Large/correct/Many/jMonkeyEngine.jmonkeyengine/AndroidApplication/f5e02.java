diff --git a/engine/src/android/com/jme3/app/android/AndroidApplication.java b/engine/src/android/com/jme3/app/android/AndroidApplication.java
index b3f5f45..296a540 100644
--- a/engine/src/android/com/jme3/app/android/AndroidApplication.java
+++ b/engine/src/android/com/jme3/app/android/AndroidApplication.java
@@ -222,7 +222,7 @@
 
         // render states
         stateManager.render(renderManager);
-        renderManager.render(tpf);
+        renderManager.render(tpf, true);
         render(renderManager);
         stateManager.postRender();
     }
