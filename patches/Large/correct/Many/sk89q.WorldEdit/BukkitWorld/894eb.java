diff --git a/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java b/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
index 2dbcba1..ebb73e6 100644
--- a/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
+++ b/src/main/java/com/sk89q/worldedit/bukkit/BukkitWorld.java
@@ -276,7 +276,7 @@
             if (!(state instanceof org.bukkit.block.NoteBlock)) return false;
             org.bukkit.block.NoteBlock bukkit = (org.bukkit.block.NoteBlock)state;
             NoteBlock we = (NoteBlock)block;
-            bukkit.setNote(we.getNote());
+            bukkit.setRawNote(we.getNote());
             return true;
         }
         
@@ -335,7 +335,7 @@
             if (!(state instanceof org.bukkit.block.NoteBlock)) return false;
             org.bukkit.block.NoteBlock bukkit = (org.bukkit.block.NoteBlock)state;
             NoteBlock we = (NoteBlock)block;
-            we.setNote(bukkit.getNote());
+            we.setNote(bukkit.getRawNote());
         }
         
         return false;
