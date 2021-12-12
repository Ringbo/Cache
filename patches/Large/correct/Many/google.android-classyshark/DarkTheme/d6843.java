diff --git a/ClassySharkWS/src/com/google/classyshark/gui/theme/dark/DarkTheme.java b/ClassySharkWS/src/com/google/classyshark/gui/theme/dark/DarkTheme.java
index 46effff..d2f104c 100644
--- a/ClassySharkWS/src/com/google/classyshark/gui/theme/dark/DarkTheme.java
+++ b/ClassySharkWS/src/com/google/classyshark/gui/theme/dark/DarkTheme.java
@@ -102,7 +102,7 @@
 
     @Override
     public void applyTo(Component component) {
-        if (component instanceof JTree) {
+        if (component instanceof JTree || component instanceof JTextField) {
             component.setBackground(BACKGROUND_LIGHT);
         } else {
             component.setBackground(BACKGROUND);
