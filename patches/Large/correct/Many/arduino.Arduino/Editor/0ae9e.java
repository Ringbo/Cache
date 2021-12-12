diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index af95a8f..7313f61 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -2212,7 +2212,7 @@
           // copy the sketch inside
           File properPdeFile = new File(properFolder, sketchFile.getName());
           try {
-            Base.copyFile(file, properPdeFile);
+            Base.copyFile(sketchFile, properPdeFile);
           } catch (IOException e) {
             Base.showWarning(_("Error"), _("Could not copy to a proper location."), e);
             return false;
