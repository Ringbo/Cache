diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ui/QuickFixToolbar.java b/platform/lang-impl/src/com/intellij/codeInspection/ui/QuickFixToolbar.java
index 0aa4ec8..6aa54f6 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ui/QuickFixToolbar.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ui/QuickFixToolbar.java
@@ -70,7 +70,7 @@
       line.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
       panels.add((JPanel)add(line));
     }
-    if (multipleDescriptors) {
+    if (multipleDescriptors || !hasFixes) {
       panels.get(0).setBorder(IdeBorderFactory.createEmptyBorder(5, 0, 0, 0));
     }
 
