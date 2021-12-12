diff --git a/src/main/java/com/sk89q/worldedit/data/AnvilChunk.java b/src/main/java/com/sk89q/worldedit/data/AnvilChunk.java
index 96f9255..5dc387a 100644
--- a/src/main/java/com/sk89q/worldedit/data/AnvilChunk.java
+++ b/src/main/java/com/sk89q/worldedit/data/AnvilChunk.java
@@ -119,9 +119,9 @@
             
             // 4 bits, so we have to divide by 2 and get the right 4 bits
             if (index % 2 == 0) {
-                addId = (blocksAdd[section][index >> 2] >> 4) << 8;
+                addId = (blocksAdd[section][index / 2] & 0xF0) << 4;
             } else {
-                addId = (blocksAdd[section][index >> 2] & 0xF) << 8;
+                addId = (blocksAdd[section][index / 2] & 0x0F) << 8;
             }
             
             return blocks[section][index] & 0xFF + addId;
