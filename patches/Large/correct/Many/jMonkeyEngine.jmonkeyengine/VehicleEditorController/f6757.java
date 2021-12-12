diff --git a/sdk/jme3-vehicle-creator/src/com/jme3/gde/vehiclecreator/VehicleEditorController.java b/sdk/jme3-vehicle-creator/src/com/jme3/gde/vehiclecreator/VehicleEditorController.java
index c20f607..d3074a5 100644
--- a/sdk/jme3-vehicle-creator/src/com/jme3/gde/vehiclecreator/VehicleEditorController.java
+++ b/sdk/jme3-vehicle-creator/src/com/jme3/gde/vehiclecreator/VehicleEditorController.java
@@ -214,7 +214,7 @@
         vehicleControl.setLinearVelocity(Vector3f.ZERO);
         vehicleControl.setAngularVelocity(Vector3f.ZERO);
         vehicleControl.resetSuspension();
-        vehicleControl.attachDebugShape(SceneApplication.getApplication().getAssetManager());
+        vehicleControl.createDebugShape(SceneApplication.getApplication().getAssetManager());
         bulletState.getPhysicsSpace().removeAll(toolsNode);
         bulletState.getPhysicsSpace().remove(vehicleControl);
 //        chaseCam.setEnabled(false);
@@ -380,12 +380,12 @@
         VehicleControl control = rootNode.getControl(VehicleControl.class);
         if (control == null) {
             vehicleControl = new VehicleControl(new BoxCollisionShape(Vector3f.UNIT_XYZ), 200);
-            vehicleControl.attachDebugShape(SceneApplication.getApplication().getAssetManager());
+            vehicleControl.createDebugShape(SceneApplication.getApplication().getAssetManager());
             rootNode.addControl(vehicleControl);
             return true;
         } else {
             vehicleControl = control;
-            vehicleControl.attachDebugShape(SceneApplication.getApplication().getAssetManager());
+            vehicleControl.createDebugShape(SceneApplication.getApplication().getAssetManager());
             return false;
         }
     }
