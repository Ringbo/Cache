diff --git a/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java b/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
index bfd1c01..c5d7afd 100644
--- a/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
+++ b/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
@@ -866,7 +866,7 @@
      */
     @Override
     public boolean isValidBlockType(int type) {
-        return type <= 255 && Material.getMaterial(type) != null;
+        return type <= 4095 && Material.getMaterial(type) != null;
     }
 
     @Override
