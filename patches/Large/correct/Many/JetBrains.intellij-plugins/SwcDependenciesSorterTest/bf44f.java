diff --git a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/SwcDependenciesSorterTest.java b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/SwcDependenciesSorterTest.java
index 623d865..6d4be8d 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/SwcDependenciesSorterTest.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/testSrc/com/intellij/flex/uiDesigner/SwcDependenciesSorterTest.java
@@ -47,7 +47,7 @@
     
     if (appRootDir != null && appRootDir.exists()) {
       for (File file : appRootDir.listFiles()) {
-        if (!file.isHidden() && file.getPath().endsWith(".swf")) {
+        if (!file.isHidden() && file.getPath().endsWith(".swf") && !file.getPath().endsWith("/designer.swf")) {
           //noinspection ResultOfMethodCallIgnored
           file.delete(); 
         }
