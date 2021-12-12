diff --git a/plugins/android/src/org/jetbrains/android/uipreview/RenderServiceFactory.java b/plugins/android/src/org/jetbrains/android/uipreview/RenderServiceFactory.java
index 84297f5..c05bc3f 100644
--- a/plugins/android/src/org/jetbrains/android/uipreview/RenderServiceFactory.java
+++ b/plugins/android/src/org/jetbrains/android/uipreview/RenderServiceFactory.java
@@ -160,7 +160,7 @@
     final FrameworkResources resources = new FrameworkResources();
     final FolderWrapper resFolderWrapper = new FolderWrapper(resFolder);
 
-    RenderUtil.loadResources(resources);
+    RenderUtil.loadResources(resources, resFolderWrapper);
 
     resources.loadPublicResources(resFolderWrapper, log);
     return resources;
