diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index 9ba3a14..c4521e1 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -508,7 +508,7 @@
         if (!components.contains(sketchbookMenu)) {
           fileMenu.insert(sketchbookMenu, 3);
         }
-        if (!components.contains(sketchbookMenu)) {
+        if (!components.contains(examplesMenu)) {
           fileMenu.insert(examplesMenu, 4);
         }
         fileMenu.revalidate();
