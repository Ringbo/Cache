diff --git a/src/main/java/com/sk89q/worldedit/tools/BlockDataCyler.java b/src/main/java/com/sk89q/worldedit/tools/BlockDataCyler.java
index bf7c42a..6885ad4 100644
--- a/src/main/java/com/sk89q/worldedit/tools/BlockDataCyler.java
+++ b/src/main/java/com/sk89q/worldedit/tools/BlockDataCyler.java
@@ -78,9 +78,9 @@
         } else if (type == BlockID.WALL_SIGN) {
             data = ((data + increment) - 2) % 4 + 2;
         } else if (type == BlockID.STEP) {
-            data = (data + increment) % 3;
+            data = (data + increment) % 4;
         } else if (type == BlockID.DOUBLE_STEP) {
-            data = (data + increment) % 3;
+            data = (data + increment) % 4;
         } else if (type == BlockID.FURNACE || type == BlockID.BURNING_FURNACE
                 || type == BlockID.DISPENSER) {
             data = (data + increment) % 4 + 2;
