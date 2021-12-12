diff --git a/src/main/java/com/sk89q/worldedit/blocks/BlockData.java b/src/main/java/com/sk89q/worldedit/blocks/BlockData.java
index f207e13..939d337 100644
--- a/src/main/java/com/sk89q/worldedit/blocks/BlockData.java
+++ b/src/main/java/com/sk89q/worldedit/blocks/BlockData.java
@@ -398,11 +398,11 @@
 
         switch (direction) {
         case NORTH_SOUTH:
-            flipX = 1;
+            flipZ = 1;
             break;
 
         case WEST_EAST:
-            flipZ = 1;
+            flipX = 1;
             break;
 
         case UP_DOWN:
