diff --git a/app/src/processing/app/EditorToolbar.java b/app/src/processing/app/EditorToolbar.java
index 09d22d4..00da0f3 100644
--- a/app/src/processing/app/EditorToolbar.java
+++ b/app/src/processing/app/EditorToolbar.java
@@ -450,7 +450,7 @@
 
 
   public Dimension getMaximumSize() {
-    return new Dimension(scale(3000), BUTTON_HEIGHT);
+    return new Dimension(scale(30000), BUTTON_HEIGHT);
   }
 
   public boolean dispatchKeyEvent(final KeyEvent e) {
