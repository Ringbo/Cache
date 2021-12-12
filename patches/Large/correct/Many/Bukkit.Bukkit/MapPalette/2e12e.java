diff --git a/src/main/java/org/bukkit/map/MapPalette.java b/src/main/java/org/bukkit/map/MapPalette.java
index b9935b7..959929c 100644
--- a/src/main/java/org/bukkit/map/MapPalette.java
+++ b/src/main/java/org/bukkit/map/MapPalette.java
@@ -97,7 +97,7 @@
 
         byte[] result = new byte[temp.getWidth() * temp.getHeight()];
         for (int i = 0; i < pixels.length; i++) {
-            result[i] = matchColor(new Color(pixels[i]));
+            result[i] = matchColor(new Color(pixels[i], true));
         }
         return result;
     }
