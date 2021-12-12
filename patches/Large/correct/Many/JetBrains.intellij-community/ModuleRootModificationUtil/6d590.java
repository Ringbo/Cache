diff --git a/platform/projectModel-api/src/com/intellij/openapi/roots/ModuleRootModificationUtil.java b/platform/projectModel-api/src/com/intellij/openapi/roots/ModuleRootModificationUtil.java
index 81e44a7..958b1ed 100644
--- a/platform/projectModel-api/src/com/intellij/openapi/roots/ModuleRootModificationUtil.java
+++ b/platform/projectModel-api/src/com/intellij/openapi/roots/ModuleRootModificationUtil.java
@@ -90,7 +90,7 @@
       entry.setScope(scope);
       entry.setExported(exported);
 
-      ApplicationManager.getApplication().invokeAndWait(() -> WriteAction.run(model::commit));
+      ApplicationManager.getApplication().invokeAndWait(() -> WriteAction.run(libraryModel::commit));
     });
   }
 
