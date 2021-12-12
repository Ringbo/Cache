diff --git a/src/main/java/com/sk89q/worldedit/EditSession.java b/src/main/java/com/sk89q/worldedit/EditSession.java
index 5735238..69012f8 100644
--- a/src/main/java/com/sk89q/worldedit/EditSession.java
+++ b/src/main/java/com/sk89q/worldedit/EditSession.java
@@ -1689,7 +1689,8 @@
             pos = pos.subtract(0, height, 0);
         }
 
-        if (pos.getBlockY() - height - 1 < 0) {
+        // Only do this check if height is negative --Elizabeth
+        if (height < 0 && pos.getBlockY() - height - 1 < 0) {
             height = pos.getBlockY() + 1;
         } else if (pos.getBlockY() + height - 1 > 127) {
             height = 127 - pos.getBlockY() + 1;
