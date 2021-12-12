diff --git a/engine/src/core/com/jme3/scene/Spatial.java b/engine/src/core/com/jme3/scene/Spatial.java
index 9b509f2..75490b0 100644
--- a/engine/src/core/com/jme3/scene/Spatial.java
+++ b/engine/src/core/com/jme3/scene/Spatial.java
@@ -1183,7 +1183,7 @@
             clone.controls = new SafeArrayList<Control>(Control.class);
             for (int i = 0; i < controls.size(); i++) {
                 Control newControl = controls.get(i).cloneForSpatial(clone);
-                newControl.setSpatial(this);
+                newControl.setSpatial(clone);
                 clone.controls.add(newControl);
             }
 
