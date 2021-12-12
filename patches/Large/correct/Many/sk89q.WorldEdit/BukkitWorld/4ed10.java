diff --git a/src/com/sk89q/worldedit/bukkit/BukkitWorld.java b/src/com/sk89q/worldedit/bukkit/BukkitWorld.java
index aabdaef..2a729dc 100644
--- a/src/com/sk89q/worldedit/bukkit/BukkitWorld.java
+++ b/src/com/sk89q/worldedit/bukkit/BukkitWorld.java
@@ -312,7 +312,7 @@
     @Override
     public boolean generateTree(EditSession editSession, Vector pt) {
         return world.generateTree(BukkitUtil.toLocation(world, pt), TreeType.TREE,
-                new EditSessionBlockChangeDegate(editSession));
+                new EditSessionBlockChangeDelegate(editSession));
     }
 
     /**
@@ -324,7 +324,7 @@
     @Override
     public boolean generateBigTree(EditSession editSession, Vector pt) {
         return world.generateTree(BukkitUtil.toLocation(world, pt), TreeType.BIG_TREE,
-                new EditSessionBlockChangeDegate(editSession));
+                new EditSessionBlockChangeDelegate(editSession));
     }
 
     /**
@@ -336,7 +336,7 @@
     @Override
     public boolean generateBirchTree(EditSession editSession, Vector pt) {
         return world.generateTree(BukkitUtil.toLocation(world, pt), TreeType.BIRCH,
-                new EditSessionBlockChangeDegate(editSession));
+                new EditSessionBlockChangeDelegate(editSession));
     }
 
     /**
@@ -348,7 +348,7 @@
     @Override
     public boolean generateRedwoodTree(EditSession editSession, Vector pt) {
         return world.generateTree(BukkitUtil.toLocation(world, pt), TreeType.REDWOOD,
-                new EditSessionBlockChangeDegate(editSession));
+                new EditSessionBlockChangeDelegate(editSession));
     }
 
     /**
@@ -360,7 +360,7 @@
     @Override
     public boolean generateTallRedwoodTree(EditSession editSession, Vector pt) {
         return world.generateTree(BukkitUtil.toLocation(world, pt), TreeType.TALL_REDWOOD,
-                new EditSessionBlockChangeDegate(editSession));
+                new EditSessionBlockChangeDelegate(editSession));
     }
 
     /**
