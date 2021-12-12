diff --git a/src/main/java/com/sk89q/worldedit/data/BlockData.java b/src/main/java/com/sk89q/worldedit/data/BlockData.java
index 66532dc..a178057 100644
--- a/src/main/java/com/sk89q/worldedit/data/BlockData.java
+++ b/src/main/java/com/sk89q/worldedit/data/BlockData.java
@@ -227,7 +227,7 @@
             int open = data & 0x4;
             int withoutOpen = data ^ 0x4;
             switch (withoutOpen) {
-                case 3: return 9 | open;
+                case 3: return 0 | open;
                 case 2: return 1 | open;
                 case 0: return 2 | open;
                 case 1: return 3 | open;
