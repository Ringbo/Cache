diff --git a/platform/lang-impl/src/com/intellij/ide/extensionResources/ExtensionsRootType.java b/platform/lang-impl/src/com/intellij/ide/extensionResources/ExtensionsRootType.java
index 4574fab..04cfd10 100644
--- a/platform/lang-impl/src/com/intellij/ide/extensionResources/ExtensionsRootType.java
+++ b/platform/lang-impl/src/com/intellij/ide/extensionResources/ExtensionsRootType.java
@@ -111,7 +111,7 @@
     Application application = ApplicationManager.getApplication();
     for (URL bundledResourceDirUrl : bundledResources) {
       VirtualFile bundledResourcesDir = VfsUtil.findFileByURL(bundledResourceDirUrl);
-      if (!bundledResourcesDir.isDirectory()) continue;
+      if (bundledResourcesDir == null || !bundledResourcesDir.isDirectory()) continue;
 
       AccessToken token = application.acquireWriteActionLock(ExtensionsRootType.class);
       try {
