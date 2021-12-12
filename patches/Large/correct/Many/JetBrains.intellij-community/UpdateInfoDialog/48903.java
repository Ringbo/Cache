diff --git a/source/com/intellij/openapi/updateSettings/impl/UpdateInfoDialog.java b/source/com/intellij/openapi/updateSettings/impl/UpdateInfoDialog.java
index 48b647a..c01c2c4 100644
--- a/source/com/intellij/openapi/updateSettings/impl/UpdateInfoDialog.java
+++ b/source/com/intellij/openapi/updateSettings/impl/UpdateInfoDialog.java
@@ -100,7 +100,7 @@
       myBuildNumber.setText(build + ")");
       final String majorVersion = ApplicationInfo.getInstance().getMajorVersion();
       final String version;
-      if (majorVersion != null) {
+      if (majorVersion != null && majorVersion.trim().length() > 0) {
         final String minorVersion = ApplicationInfo.getInstance().getMinorVersion();
         if (minorVersion != null && minorVersion.trim().length() > 0) {
           version = majorVersion + "." + minorVersion;
