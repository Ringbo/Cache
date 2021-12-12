diff --git a/app/src/processing/app/Sketch.java b/app/src/processing/app/Sketch.java
index cac978b..81ceed7 100644
--- a/app/src/processing/app/Sketch.java
+++ b/app/src/processing/app/Sketch.java
@@ -387,7 +387,7 @@
     // Make sure no .pde *and* no .java files with the same name already exist
     // http://dev.processing.org/bugs/show_bug.cgi?id=543
     for (SketchCode c : code) {
-      if (sanitaryName.equals(c.getPrettyName())) {
+      if (sanitaryName.equalsIgnoreCase(c.getPrettyName())) {
         Base.showMessage("Nope",
                          "A file named \"" + c.getFileName() + "\" already exists\n" +
                          "in \"" + folder.getAbsolutePath() + "\"");
@@ -757,7 +757,7 @@
     // but ignore this situation for the first tab, since it's probably being
     // resaved (with the same name) to another location/folder.
     for (int i = 1; i < codeCount; i++) {
-      if (newName.equals(code[i].getPrettyName())) {
+      if (newName.equalsIgnoreCase(code[i].getPrettyName())) {
         Base.showMessage("Nope",
                          "You can't save the sketch as \"" + newName + "\"\n" +
                          "because the sketch already has a tab with that name.");
