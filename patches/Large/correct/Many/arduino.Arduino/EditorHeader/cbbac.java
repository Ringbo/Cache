diff --git a/app/src/processing/app/EditorHeader.java b/app/src/processing/app/EditorHeader.java
index 42d6769..25c09a8 100644
--- a/app/src/processing/app/EditorHeader.java
+++ b/app/src/processing/app/EditorHeader.java
@@ -351,7 +351,7 @@
 
 
   public Dimension getMaximumSize() {
-    Dimension size = scale(new Dimension(3000, GRID_SIZE));
+    Dimension size = scale(new Dimension(30000, GRID_SIZE));
     if (OSUtils.isMacOS())
       size.height--;
     return size;
