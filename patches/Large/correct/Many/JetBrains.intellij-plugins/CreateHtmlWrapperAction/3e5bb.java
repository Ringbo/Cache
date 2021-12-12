diff --git a/flex/src/com/intellij/lang/javascript/flex/actions/htmlwrapper/CreateHtmlWrapperAction.java b/flex/src/com/intellij/lang/javascript/flex/actions/htmlwrapper/CreateHtmlWrapperAction.java
index 51c6b72..82423f4 100644
--- a/flex/src/com/intellij/lang/javascript/flex/actions/htmlwrapper/CreateHtmlWrapperAction.java
+++ b/flex/src/com/intellij/lang/javascript/flex/actions/htmlwrapper/CreateHtmlWrapperAction.java
@@ -104,7 +104,7 @@
               attributes.setProperty(REQUIRED_FLASH_PLAYER_VERSION_MINOR, String.valueOf(parameters.getFlashPlayerVersionMinor()));
               attributes.setProperty(REQUIRED_FLASH_PLAYER_VERSION_REVISION, String.valueOf(parameters.getFlashPlayerVersionRevision()));
 
-              final String resultText = FileTemplateUtil.mergeTemplate(attributes, VfsUtil.loadText(file));
+              final String resultText = FileTemplateUtil.mergeTemplate(attributes, VfsUtil.loadText(file), true);
               _htmlFile = FlexUtils.addFileWithContent(parameters.getHtmlFileName(), resultText, parameters.getHtmlFileLocation());
             }
             else {
