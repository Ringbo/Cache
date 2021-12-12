diff --git a/src/main/java/com/sk89q/worldedit/command/RegionCommands.java b/src/main/java/com/sk89q/worldedit/command/RegionCommands.java
index 67e285d..5534df3 100644
--- a/src/main/java/com/sk89q/worldedit/command/RegionCommands.java
+++ b/src/main/java/com/sk89q/worldedit/command/RegionCommands.java
@@ -327,7 +327,7 @@
                       @Switch('a') boolean ignoreAirBlocks) throws WorldEditException {
         int affected = editSession.stackCuboidRegion(region, direction, count, !ignoreAirBlocks);
 
-        if (ignoreAirBlocks) {
+        if (moveSelection) {
             try {
                 final Vector size = region.getMaximumPoint().subtract(region.getMinimumPoint());
 
