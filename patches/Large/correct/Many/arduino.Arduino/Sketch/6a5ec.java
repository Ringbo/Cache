diff --git a/app/src/processing/app/Sketch.java b/app/src/processing/app/Sketch.java
index d317b4d..f5adfde 100644
--- a/app/src/processing/app/Sketch.java
+++ b/app/src/processing/app/Sketch.java
@@ -652,7 +652,7 @@
     // make sure there doesn't exist a .cpp file with that name already
     // but ignore this situation for the first tab, since it's probably being
     // resaved (with the same name) to another location/folder.
-    for (int i = 0; i < data.getCodeCount(); i++) {
+    for (int i = 1; i < data.getCodeCount(); i++) {
       SketchCode code = data.getCode(i);
       if (newName.equalsIgnoreCase(code.getPrettyName())) {
         Base.showMessage(tr("Error"),
