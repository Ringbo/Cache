diff --git a/src/main/java/org/bukkit/material/Button.java b/src/main/java/org/bukkit/material/Button.java
index c6d1aed..21335f2 100644
--- a/src/main/java/org/bukkit/material/Button.java
+++ b/src/main/java/org/bukkit/material/Button.java
@@ -40,7 +40,7 @@
      * @return BlockFace attached to
      */
     public BlockFace getAttachedFace() {
-        byte data = (byte) (getData() ^ 0x8);
+        byte data = (byte) (getData() ^ 0x7);
 
         switch (data) {
             case 0x1:
