diff --git a/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java b/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
index 8bd9b8c..d6d8d1e 100644
--- a/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
+++ b/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
@@ -641,7 +641,8 @@
         }
 
         private void runTimeline(double newTransX, double newWidth) {
-            if(selectedTabLine.getTranslateX() == newTransX) return;
+            if(selectedTabLine.getTranslateX() == newTransX
+                && scale.getX() == newWidth) return;
 
             double tempScaleX = 0;
             double tempWidth = 0;
