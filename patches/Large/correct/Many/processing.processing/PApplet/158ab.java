diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index a55efbf..6741c84 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -6408,7 +6408,7 @@
           fileChooser.setDialogTitle(prompt);
           fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           if (defaultSelection != null) {
-            fileChooser.setSelectedFile(defaultSelection);
+            fileChooser.setCurrentDirectory(defaultSelection);
           }
 
           int result = fileChooser.showOpenDialog(parentFrame);
