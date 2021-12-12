diff --git a/src/main/java/com/sk89q/worldedit/regions/CuboidRegion.java b/src/main/java/com/sk89q/worldedit/regions/CuboidRegion.java
index 2b5d2b4..4fd9c92 100644
--- a/src/main/java/com/sk89q/worldedit/regions/CuboidRegion.java
+++ b/src/main/java/com/sk89q/worldedit/regions/CuboidRegion.java
@@ -88,11 +88,11 @@
     }
 
     public int getMinimumY() {
-        return Math.min(pos1.getBlockX(), pos2.getBlockY());
+        return Math.min(pos1.getBlockY(), pos2.getBlockY());
     }
 
     public int getMaximumY() {
-        return Math.max(pos1.getBlockX(), pos2.getBlockY());
+        return Math.max(pos1.getBlockY(), pos2.getBlockY());
     }
 
     /**
