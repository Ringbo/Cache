diff --git a/arduino-core/src/processing/app/SketchFile.java b/arduino-core/src/processing/app/SketchFile.java
index 0a6f4cc..f134165 100644
--- a/arduino-core/src/processing/app/SketchFile.java
+++ b/arduino-core/src/processing/app/SketchFile.java
@@ -177,7 +177,7 @@
   public void renameTo(String newName) throws IOException {
     File newFile = new File(file.getParentFile(), newName);
     sketch.checkNewFilename(newFile);
-    if (file.renameTo(newFile)) {
+    if (!file.exists() || file.renameTo(newFile)) {
       renamedTo(newFile);
     } else {
       String msg = I18n.format(tr("Failed to rename \"{0}\" to \"{1}\""), file.getName(), newName);
