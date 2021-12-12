diff --git a/src/main/java/com/sk89q/worldedit/commands/RegionCommands.java b/src/main/java/com/sk89q/worldedit/commands/RegionCommands.java
index 74748c6..8563446 100644
--- a/src/main/java/com/sk89q/worldedit/commands/RegionCommands.java
+++ b/src/main/java/com/sk89q/worldedit/commands/RegionCommands.java
@@ -552,8 +552,7 @@
 
         ForestGenerator generator = new ForestGenerator(editSession, new TreeGenerator(type));
         GroundFunction ground = new GroundFunction(editSession, generator);
-        LayerVisitor visitor = new LayerVisitor(
-                editSession, asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
+        LayerVisitor visitor = new LayerVisitor(asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
         visitor.setMask(new NoiseFilter2D(new RandomNoise(), density));
         OperationHelper.completeLegacy(visitor);
 
@@ -575,8 +574,7 @@
         Region region = session.getSelection(player.getWorld());
         FloraGenerator generator = new FloraGenerator(editSession);
         GroundFunction ground = new GroundFunction(editSession, generator);
-        LayerVisitor visitor = new LayerVisitor(
-                editSession, asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
+        LayerVisitor visitor = new LayerVisitor(asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
         visitor.setMask(new NoiseFilter2D(new RandomNoise(), density));
         OperationHelper.completeLegacy(visitor);
 
