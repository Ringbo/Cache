diff --git a/java/idea-ui/src/com/intellij/ide/actions/ImportModuleAction.java b/java/idea-ui/src/com/intellij/ide/actions/ImportModuleAction.java
index 3f087a9..76e3567 100644
--- a/java/idea-ui/src/com/intellij/ide/actions/ImportModuleAction.java
+++ b/java/idea-ui/src/com/intellij/ide/actions/ImportModuleAction.java
@@ -136,7 +136,7 @@
     });
     StringBuilder builder = new StringBuilder("<html>Select ");
     boolean first = true;
-    if (list.size() > 1) {
+    if (list.size() > 0) {
       for (ProjectImportProvider provider : list) {
         String sample = provider.getFileSample();
         if (sample != null) {
