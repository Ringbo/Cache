diff --git a/src/org/editorconfig/configmanagement/EditorSettingsManager.java b/src/org/editorconfig/configmanagement/EditorSettingsManager.java
index ec95dd4..1784b25 100644
--- a/src/org/editorconfig/configmanagement/EditorSettingsManager.java
+++ b/src/org/editorconfig/configmanagement/EditorSettingsManager.java
@@ -48,7 +48,7 @@
     }
 
     private static void applySettings(VirtualFile file) {
-        if (!file.isInLocalFileSystem()) return;
+        if (file == null || !file.isInLocalFileSystem()) return;
         // Get editorconfig settings
         final String filePath = file.getCanonicalPath();
         final SettingsProviderComponent settingsProvider = SettingsProviderComponent.getInstance();
