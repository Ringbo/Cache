diff --git a/common/buildcraft/builders/container/ContainerFillingPlanner.java b/common/buildcraft/builders/container/ContainerFillingPlanner.java
index 740baea..5e772a9 100644
--- a/common/buildcraft/builders/container/ContainerFillingPlanner.java
+++ b/common/buildcraft/builders/container/ContainerFillingPlanner.java
@@ -70,7 +70,7 @@
                 inverted = buffer.readBoolean();
                 addon.parameters = parameters;
                 addon.inverted = inverted;
-                addon.markDirty();
+                addon.updateBuildingInfo();
                 WorldSavedDataVolumeBoxes.get(player.world).markDirty();
             }
         }
