diff --git a/ClassySharkWS/src/com/google/classyshark/gui/panel/toolbar/Toolbar.java b/ClassySharkWS/src/com/google/classyshark/gui/panel/toolbar/Toolbar.java
index 8bc77d2..56fa945 100644
--- a/ClassySharkWS/src/com/google/classyshark/gui/panel/toolbar/Toolbar.java
+++ b/ClassySharkWS/src/com/google/classyshark/gui/panel/toolbar/Toolbar.java
@@ -104,7 +104,7 @@
     private JTextField buildTypingArea() {
         final JTextField result = new JTextField(50);
 
-        result.setEnabled(false);
+        result.setEnabled(true);
 
         result.addMouseListener(new MouseAdapter() {
 
