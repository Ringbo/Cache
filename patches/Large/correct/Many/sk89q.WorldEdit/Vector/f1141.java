diff --git a/src/main/java/com/sk89q/worldedit/Vector.java b/src/main/java/com/sk89q/worldedit/Vector.java
index 4b31da0..ffd4454 100644
--- a/src/main/java/com/sk89q/worldedit/Vector.java
+++ b/src/main/java/com/sk89q/worldedit/Vector.java
@@ -508,7 +508,7 @@
     public boolean containedWithinBlock(Vector min, Vector max) {
         return getBlockX() >= min.getBlockX() && getBlockX() <= max.getBlockX()
                 && getBlockY() >= min.getBlockY() && getBlockY() <= max.getBlockY()
-                && getBlockZ() >= min.getBlockZ() && getBlockZ() <= max.getBlockY();
+                && getBlockZ() >= min.getBlockZ() && getBlockZ() <= max.getBlockZ();
     }
 
     /**
