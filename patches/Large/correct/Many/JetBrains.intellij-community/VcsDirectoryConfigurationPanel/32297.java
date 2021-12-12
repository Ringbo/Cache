diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
index 1fbcea8..5407704 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
@@ -101,7 +101,7 @@
             return;
           }
           String relativePath = FileUtil.getRelativePath(ioBase, directoryFile);
-          if (".".equals(relativePath)) {
+          if (".".equals(relativePath) || relativePath == null) {
             append(ioBase.getPath());
           }
           else {
