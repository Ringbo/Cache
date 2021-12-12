diff --git a/src/WorldEdit.java b/src/WorldEdit.java
index 59474d9..0a8d61d 100644
--- a/src/WorldEdit.java
+++ b/src/WorldEdit.java
@@ -440,7 +440,7 @@
 
         // Remove blocks above current position
         } else if (split[0].equalsIgnoreCase("/removeabove")) {
-            int size = split.length > 1 ? Math.max(1, Integer.parseInt(split[1]) - 1) : 0;
+            int size = split.length > 1 ? Math.max(0, Integer.parseInt(split[1]) - 1) : 0;
             int height = split.length > 2 ? Math.max(1, Integer.parseInt(split[2])) : 127;
 
             int affected = 0;
@@ -467,14 +467,14 @@
 
         // Remove blocks below current position
         } else if (split[0].equalsIgnoreCase("/removebelow")) {
-            int size = split.length > 1 ? Math.max(1, Integer.parseInt(split[1]) - 1) : 0;
+            int size = split.length > 1 ? Math.max(0, Integer.parseInt(split[1]) - 1) : 0;
             int height = split.length > 2 ? Math.max(1, Integer.parseInt(split[2])) : 127;
 
             int affected = 0;
             int cx = (int)Math.floor(player.getX());
             int cy = (int)Math.floor(player.getY());
             int cz = (int)Math.floor(player.getZ());
-            int minY = Math.max(0, cy - height + 1);
+            int minY = Math.max(0, cy - height);
 
             for (int x = cx - size; x <= cx + size; x++) {
                 for (int z = cz - size; z <= cz + size; z++) {
