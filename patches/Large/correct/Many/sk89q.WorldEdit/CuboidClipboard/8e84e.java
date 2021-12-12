diff --git a/src/main/java/com/sk89q/worldedit/CuboidClipboard.java b/src/main/java/com/sk89q/worldedit/CuboidClipboard.java
index fe95913..be3755b 100644
--- a/src/main/java/com/sk89q/worldedit/CuboidClipboard.java
+++ b/src/main/java/com/sk89q/worldedit/CuboidClipboard.java
@@ -182,7 +182,7 @@
 
         switch (dir) {
         case NORTH_SOUTH:
-            int wid = (int)Math.ceil(width / 2);
+            int wid = (int)Math.ceil(width / 2.0f);
             for (int xs = 0; xs < wid; ++xs) {
                 for (int z = 0; z < length; ++z) {
                     for (int y = 0; y < height; ++y) {
@@ -208,7 +208,7 @@
             break;
 
         case WEST_EAST:
-            int len = (int)Math.ceil(length / 2);
+            int len = (int)Math.ceil(length / 2.0f);
             for (int zs = 0; zs < len; ++zs) {
                 for (int x = 0; x < width; ++x) {
                     for (int y = 0; y < height; ++y) {
@@ -233,7 +233,7 @@
             break;
 
         case UP_DOWN:
-            int hei = (int)Math.ceil(height / 2);
+            int hei = (int)Math.ceil(height / 2.0f);
             for (int ys = 0; ys < hei; ++ys) {
                 for (int x = 0; x < width; ++x) {
                     for (int z = 0; z < length; ++z) {
