diff --git a/src/com/sk89q/worldedit/regions/CuboidRegionSelector.java b/src/com/sk89q/worldedit/regions/CuboidRegionSelector.java
index 85203b9..eddf8f9 100644
--- a/src/com/sk89q/worldedit/regions/CuboidRegionSelector.java
+++ b/src/com/sk89q/worldedit/regions/CuboidRegionSelector.java
@@ -65,10 +65,10 @@
 
     public void explainSecondarySelection(LocalPlayer player, Vector pos) {
         if (pos1 != null && pos2 != null) {
-            player.print("Second position set to " + pos1
+            player.print("Second position set to " + pos2
                     + " (" + region.getArea() + ").");
         } else {
-            player.print("Second position set to " + pos1 + ".");
+            player.print("Second position set to " + pos2 + ".");
         }
     }
     
