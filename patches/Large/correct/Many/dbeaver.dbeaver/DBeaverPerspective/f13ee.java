diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
index 6843b37..eef45a5 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
@@ -69,7 +69,7 @@
             0.7f,
             FOLDER_NAVIGATION);
         bottomLeft.addView(ProjectExplorerView.VIEW_ID);
-        bottomLeft.addView(DatabaseBrowserView.VIEW_ID);
+        bottomLeft.addPlaceholder(DatabaseBrowserView.VIEW_ID);
 
         // Bottom right.
         IPlaceholderFolderLayout bottomRight = layout.createPlaceholderFolder(
