diff --git a/src/org/editorconfig/configmanagement/EncodingManager.java b/src/org/editorconfig/configmanagement/EncodingManager.java
index 3dae55a..56c597d 100644
--- a/src/org/editorconfig/configmanagement/EncodingManager.java
+++ b/src/org/editorconfig/configmanagement/EncodingManager.java
@@ -51,7 +51,7 @@
     }
 
     private void applySettings(VirtualFile file) {
-        if (!file.isInLocalFileSystem()) return;
+        if (file == null || !file.isInLocalFileSystem()) return;
         // Prevent "setEncoding" calling "saveAll" from causing an endless loop
         isApplyingSettings = true;
         final String filePath = file.getCanonicalPath();
