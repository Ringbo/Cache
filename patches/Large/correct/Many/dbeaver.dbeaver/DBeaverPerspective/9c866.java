diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
index 7ef4893..b6cf2dc 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DBeaverPerspective.java
@@ -65,7 +65,7 @@
         IFolderLayout bottomLeft = layout.createFolder(
             BOTTOM_BOTTOM_LEFT,
             IPageLayout.BOTTOM,
-            0.8f,
+            0.2f,
             FOLDER_NAVIGATION);
         bottomLeft.addView(ProjectExplorerView.VIEW_ID);
 
