diff --git a/src/main/java/org/bukkit/material/Lever.java b/src/main/java/org/bukkit/material/Lever.java
index 737d16c..5d6e7f4 100644
--- a/src/main/java/org/bukkit/material/Lever.java
+++ b/src/main/java/org/bukkit/material/Lever.java
@@ -40,7 +40,7 @@
      * @return BlockFace attached to
      */
     public BlockFace getAttachedFace() {
-        byte data = (byte) (getData() ^ 0x8);
+        byte data = (byte) (getData() ^ 0x7);
 
         switch (data) {
             case 0x1:
