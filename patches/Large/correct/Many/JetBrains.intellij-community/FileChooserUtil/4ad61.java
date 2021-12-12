diff --git a/platform/platform-impl/src/com/intellij/openapi/fileChooser/impl/FileChooserUtil.java b/platform/platform-impl/src/com/intellij/openapi/fileChooser/impl/FileChooserUtil.java
index 2bc3bc5..f3b5d27 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileChooser/impl/FileChooserUtil.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileChooser/impl/FileChooserUtil.java
@@ -42,10 +42,10 @@
     }
     else if (toSelect != null && lastPath != null) {
       if (Boolean.TRUE.equals(descriptor.getUserData(PathChooserDialog.PREFER_LAST_OVER_EXPLICIT))) {
-        return toSelect;
+        return lastPath;
       }
       else {
-        return lastPath;
+        return toSelect;
       }
     }
     else if (toSelect == null) {
