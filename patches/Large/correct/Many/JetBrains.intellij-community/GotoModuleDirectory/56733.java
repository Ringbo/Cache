diff --git a/platform/lang-impl/src/com/intellij/openapi/fileChooser/actions/GotoModuleDirectory.java b/platform/lang-impl/src/com/intellij/openapi/fileChooser/actions/GotoModuleDirectory.java
index 744ba1f..37b6c95 100644
--- a/platform/lang-impl/src/com/intellij/openapi/fileChooser/actions/GotoModuleDirectory.java
+++ b/platform/lang-impl/src/com/intellij/openapi/fileChooser/actions/GotoModuleDirectory.java
@@ -48,7 +48,7 @@
     if (module == null) {
       module = e.getData(LangDataKeys.MODULE);
     }
-    if (module == null) {
+    if (module == null || module.isDisposed()) {
       return null;
     }
     final VirtualFile moduleFile = validated(module.getModuleFile());
