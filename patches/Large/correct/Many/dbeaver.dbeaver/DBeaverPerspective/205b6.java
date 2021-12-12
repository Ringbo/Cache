diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
index 7db338a..762c904 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
@@ -67,7 +67,7 @@
         IFolderLayout bottomLeft = layout.createFolder(
             BOTTOM_BOTTOM_LEFT,
             IPageLayout.BOTTOM,
-            0.2f,
+            0.7f,
             FOLDER_NAVIGATION);
         bottomLeft.addView(ProjectExplorerView.VIEW_ID);
 
